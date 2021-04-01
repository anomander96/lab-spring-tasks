package task1.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private int id;
    private String name;

    public BeanA() {
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
