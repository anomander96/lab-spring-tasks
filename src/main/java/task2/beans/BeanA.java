package task2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanA {

    private String name;
    private String value;

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
