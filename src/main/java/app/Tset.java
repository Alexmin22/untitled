package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tset {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Start start = context.getBean("start", Start.class);
        start.sayHello();

        context.close();
    }
}
