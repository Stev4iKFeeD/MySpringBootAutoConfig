package client;

import org.springframework.beans.factory.InitializingBean;

public class ConsoleLogBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("[ConsoleLogBean started]");
    }

}
