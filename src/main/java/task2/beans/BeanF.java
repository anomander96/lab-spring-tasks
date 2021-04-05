package task2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanF {

    private String name;
    private String value;

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
