package client;

import org.springframework.beans.factory.InitializingBean;

public class LocalLogBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("[LocalLogBean started]");
    }

}
