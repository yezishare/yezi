package base;

import com.jd.pop.ware.ic.api.domain.ClientInfo;
import org.springframework.context.ApplicationContext;

public class AbstracITest implements ITest {


    private final ApplicationContext applicationContext;

    public AbstracITest(ApplicationContext applicationContext) {
        super();
        this.applicationContext=applicationContext;
    }

    @Override
    public <T> Result<T> invoke(Object bean, String methodName, Class<T> clazz, Object... args) {
        return null;
    }

    @Override
    public <T> Result<T> invoke(String beanId, String methodName, Class<T> clazz, String[] argsClazz, Object... args) {
        return null;
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
