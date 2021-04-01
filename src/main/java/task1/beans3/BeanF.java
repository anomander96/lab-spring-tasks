package task1.beans3;

import org.springframework.stereotype.Component;

@Component
public class BeanF {
    private int id;
    private double size;

    public BeanF() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSize() {
        return size;
    }
}
