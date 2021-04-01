package task1.beansImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import task1.otherBeans.OtherBeanC;

@Component
public class OtherBeanCImpl {
    @Autowired
    @Qualifier("otherBeanC")
    private OtherBeanC otherBeanC;

    public OtherBeanCImpl() {
    }

    public OtherBeanC getOtherBeanC() {
        return otherBeanC;
    }
}
