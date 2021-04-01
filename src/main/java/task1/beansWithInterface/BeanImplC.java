package task1.beansWithInterface;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import task1.MyBean;

@Component
@Order(3)
public class BeanImplC implements MyBean {
    @Override
    public void doSomething() {
        System.out.println("Some action for beanImplC");
    }
}
