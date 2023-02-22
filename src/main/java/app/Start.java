package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Start {
    private Animal animal;
    //private Animal animal2;
    long ms = System.currentTimeMillis();
@Autowired
    public Start(@Qualifier("cat") Animal animal
               // , @Qualifier("dog") Animal animal2
) {
        this.animal = animal;
        //this.animal2 = animal2;
    }

    public void sayHello() {
        System.out.println("" + animal.getSound()/*+ " " + animal2.getSound()*/ + ms);
    }

}
