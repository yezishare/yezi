from selenium import webdriver
import unittest

class NewVisitorTest(unittest.TestCase):

    def setUp(self):
        self.browser=webdriver.Chrome()
        self.browser.implicitly_wait(3)

    def tearDown(self):
        self.browser.quit()

    def test_can_start_a_list_and_retrieve_it_later(self):
#A听说有一个很酷的在线待办事项应用
#她去看了这个应用的首页
            self.browser.get('http://localhost:8000')


#她注意到网页的标题和头部都包含“To-Do”这个词
#assert 'To-Do' in browser.title, "Browser title was" + browser.title
            self.assertIn('To-Do',self.browser.title)
            self.fail('Finish the test!')
#应用邀请她输入一个待办事项
#她在文本框中输入了“Buy peacock feathers”(购买孔雀羽毛)
#她的爱好是使用假绳做饵钓鱼
#她按回车键后，页面更新
#待办事项表格中显示了“1：buy peacock feathers”


#页面中又显示了一个文本框，可以输入其他待办事项
#她输入了“Use peacoko feathers to make a fly”(使用孔雀羽毛做假绳)
#她做事很有条理

#页面再次刷新，她的清单中显示了这两个待办事项

#她想知道这个网站是否会记住她的清单

#她看到网站为她生成了一个唯一的url
#而且页面中有一些文字解说这个功能

#她访问那个url，发现待办事项列表还在

#她很满意，去睡觉了
if __name__=='__main__':
    unittest.main(warnings='ignore')
