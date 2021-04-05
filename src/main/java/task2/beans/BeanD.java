package task2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanD {

    private String name;
    private String value;

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
