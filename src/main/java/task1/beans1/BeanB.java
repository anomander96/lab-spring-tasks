package task1.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private int id;
    private String name;

    public BeanB() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
