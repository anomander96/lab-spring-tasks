package task1.otherBeans;

import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component
public class OtherBeanA implements Serializable {

    private String name;
    private String text;

    public OtherBeanA() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
