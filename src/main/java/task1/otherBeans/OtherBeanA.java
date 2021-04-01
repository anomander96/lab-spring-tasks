package task1.otherBeans;

import org.springframework.stereotype.Component;

@Component
public class OtherBeanA {
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
