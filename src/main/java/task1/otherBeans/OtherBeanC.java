package task1.otherBeans;

import org.springframework.stereotype.Component;

@Component
public class OtherBeanC {
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
