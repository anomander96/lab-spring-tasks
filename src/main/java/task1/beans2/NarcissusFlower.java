package task1.beans2;

import org.springframework.stereotype.Component;

@Component
public class NarcissusFlower {
    private boolean isHealthy;
    private String color;

    public NarcissusFlower() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsHealthy() {
        return isHealthy;
    }
}
