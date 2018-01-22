package base;

import com.jd.pop.ware.ic.api.domain.ClientInfo;

public interface ITest {
    <T> Result<T> invoke(Object bean,String methodName,Class<T> clazz,Object ... args);
    <T> Result<T> invoke(String beanId,String methodName,Class<T> clazz,String[] argsClazz,Object ... args);
    <T> T getObject(String fileName,Class<T> clazz);
    String getJSONObject(String fileName);
    ClientInfo getClientInfo();
}
