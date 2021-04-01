package task1.beans2;

import org.springframework.stereotype.Component;

@Component
public class CatAnimal {
    private int age;
    private String name;

    public CatAnimal() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
