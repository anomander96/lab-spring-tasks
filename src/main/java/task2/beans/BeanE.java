package task2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanE {

    private String name;
    private String value;

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
