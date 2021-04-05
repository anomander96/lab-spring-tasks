package task2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private String name;
    private String value;

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
