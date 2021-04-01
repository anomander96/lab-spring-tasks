package task1.beansWithInterface;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import task1.MyBean;

@Component
@Order(2)
public class BeanImplB implements MyBean {
    @Override
    public void doSomething() {
        System.out.println("Some action for beanImplB");
    }
}
