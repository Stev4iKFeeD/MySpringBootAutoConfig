package client;

import org.springframework.beans.factory.InitializingBean;

public class ExternalLogBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("[ExternalLogBean started]");
    }

}
