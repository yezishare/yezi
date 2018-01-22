package base;

import com.jd.pop.ware.ic.api.domain.ClientInfo;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

@ContextConfiguration(locations ={"classpath*:spring-config.xml"})
public class BaseTestNG extends AbstractTestNGSpringContextTests implements ITest{
    private ITest itest;

    @BeforeClass
    public void setUp(){
        itest = new AbstracITest(this.applicationContext);
        ITestResult it= Reporter.getCurrentTestResult(); //ITestResult是org.testng的一个方法
        System.out.println("Test Class:"+it.getTestClass().getName());
    }

    @Override
    public <T> Result<T> invoke(Object bean,String methodName,Class<T> clazz,Object... args){
        return itest.invoke(bean,methodName,clazz,args);
    }
    @Override
    public <T> Result<T> invoke(String beanId,String methodName,Class<T> clazz,String[] argsClazz,Object... args){
        return itest.invoke(beanId,methodName,clazz,argsClazz,args);
    }

    @Override
    public <T> T getObject(String fileName, Class<T> clazz) {
        return null;
    }

    @Override
    public String getJSONObject(String fileName) {
        return null;
    }

    @Override
    public ClientInfo getClientInfo() {
        return null;
    }


}
