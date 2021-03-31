package task1.beansImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import task1.otherBeans.OtherBeanA;

@Component
public class OtherBeanAImpl {
    private OtherBeanA otherBeanA;

    @Autowired
    public OtherBeanAImpl(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }
}
