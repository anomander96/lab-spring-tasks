package task2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE {

    private String name;
    private int value;

    public BeanE(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("afterInit method in BeanE is running");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("beforeDestroy method in BeanE is running");
    }
}
