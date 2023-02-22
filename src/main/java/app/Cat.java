package app;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    public String getSound() {
        return "meow!";
    }
}
