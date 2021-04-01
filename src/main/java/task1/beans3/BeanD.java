package task1.beans3;

import org.springframework.stereotype.Component;

@Component
public class BeanD {
    private int id;
    private String text;

    public BeanD() {
    }

    public String getText() {
        return text;
    }

    public void setId(int id) {
        this.id = id;
    }


}
