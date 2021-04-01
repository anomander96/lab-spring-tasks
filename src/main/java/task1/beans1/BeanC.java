package task1.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
    private int id;
    private boolean isActive;

    public BeanC() {
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setId(int id) {
        this.id = id;
    }
}
