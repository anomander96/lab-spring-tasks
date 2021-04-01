package task1.beansWithInterface;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import task1.MyBean;


@Component
@Primary
@Order(1)
public class BeanImplA implements MyBean {

    @Override
    public void doSomething() {
        System.out.println("Some action for beanImplA");
    }
}
