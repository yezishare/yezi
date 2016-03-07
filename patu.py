#coding=utf-8
import re
import urllib

def getHtml(url):
    page=urllib.urlopen(url)
    html=page.read()
    return html
def getImg(html):
    reg=r'src="(.+?\.jpg)"'
    imgre=re.compile(reg)
    imglist=re.findall(imgre,html)
    x=0
    for imgurl in imglist:
        urllib.urlretrieve(imgurl,'%s.jpg' % x)
        x+=1
    
html=getHtml("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&step_word=&pn=0&spn=0&di=63719554470&pi=&rn=1&tn=baiduimagedetail&is=&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=3841157212%2C2135341815&os=2353784648%2C2722531871&simid=3438637943%2C188811404&adpicid=0&ln=1000&fr=&fmq=1457274392627_R&ic=undefined&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&objurl=http%3A%2F%2Fpica.nipic.com%2F2007-11-09%2F200711912453162_2.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bgtrtv_z%26e3Bv54AzdH3Ffi5oAzdH3FnAzdH3F0nAzdH3Fd8jv9bu88mnmw990_z%26e3Bip4s&gsm=0")
print getImg(html)
    
