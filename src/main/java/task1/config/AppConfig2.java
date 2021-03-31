package task1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import task1.beans3.BeanD;
import task1.beans3.BeanF;

@Configuration
@ComponentScan("task1.beans2")
public class AppConfig2 {
    @Bean
    public BeanD beanD() {
        return new BeanD();
    }

    @Bean
    public BeanF beanF() {
        return new BeanF();
    }
}
