package ch03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {

    @Value("John Mayer")
    private String name;

    @Value("39")
    private int age;

    @Value("1.92")
    private float height;

    @Value("false")
    private boolean programmer;

    @Value("1241401112")
    private Long ageInSeconds;


    @Override
    public String toString() {
        return "InjectSimple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();

        InjectSimple simple = ctx.getBean("injectSimple", InjectSimple.class);
        System.out.println(simple);
    }

}
