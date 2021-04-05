package task1.otherBeans;

import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component
public class OtherBeanC implements Serializable {

    private double size;
    private String text;

    public OtherBeanC() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
