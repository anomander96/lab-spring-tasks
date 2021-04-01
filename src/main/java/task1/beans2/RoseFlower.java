package task1.beans2;

import org.springframework.stereotype.Component;

@Component
public class RoseFlower {
    private boolean isHealthy;
    private String color;
    private double price;

    public RoseFlower() {
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
