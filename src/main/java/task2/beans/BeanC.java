package task2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanC {

    private String name;
    private String value;

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
