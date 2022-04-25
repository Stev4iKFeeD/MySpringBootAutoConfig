package lib;

import lib.log.ConsoleLog;
import lib.log.ExternalLog;
import lib.log.LocalLog;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibAutoConfig {

    @Bean
    @ConditionalOnProperty(value = "log.type", havingValue = "console")
    ConsoleLog consoleLog() {
        return new ConsoleLog();
    }

    @Bean
    @ConditionalOnProperty(value = "log.type", havingValue = "local")
    LocalLog localLog() {
        return new LocalLog();
    }

    @Bean
    @ConditionalOnProperty(value = "log.type", havingValue = "external")
    ExternalLog externalLog() {
        return new ExternalLog();
    }

}
