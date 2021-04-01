package task1.beans3;

import org.springframework.stereotype.Component;

@Component
public class BeanE {
    private int id;
    private double value;

    public BeanE() {
    }

    public double getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }
}
