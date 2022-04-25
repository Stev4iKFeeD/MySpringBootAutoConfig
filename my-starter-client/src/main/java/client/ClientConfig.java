package client;

import lib.LibAutoConfig;
import lib.log.ConsoleLog;
import lib.log.ExternalLog;
import lib.log.LocalLog;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(LibAutoConfig.class)
public class ClientConfig {

    @Bean
    @ConditionalOnBean(ConsoleLog.class)
    ConsoleLogBean consoleLogBean() {
        return new ConsoleLogBean();
    }

    @Bean
    @ConditionalOnBean(LocalLog.class)
    LocalLogBean localLogBean() {
        return new LocalLogBean();
    }

    @Bean
    @ConditionalOnBean(ExternalLog.class)
    ExternalLogBean externalLogBean() {
        return new ExternalLogBean();
    }

    @Bean
    @ConditionalOnMissingBean({ConsoleLog.class, LocalLog.class, ExternalLog.class})
    NoLogBean noLogBean() {
        return new NoLogBean();
    }

}
