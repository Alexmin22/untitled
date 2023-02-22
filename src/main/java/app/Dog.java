package app;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    public String getSound() {
        return "bark-bark";
    }
}
