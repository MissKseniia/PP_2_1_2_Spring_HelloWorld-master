import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        //System.out.println(beanHW1.getMessage());

        HelloWorld beanHW2 =
                applicationContext.getBean("helloworld", HelloWorld.class);

        Cat cat1 = applicationContext.getBean("catBean", Cat.class);
        Cat cat2 = applicationContext.getBean("catBean", Cat.class);

        System.out.printf("Result for the pair of HelloWorld:\n->%b\n", beanHW1==beanHW2);
        System.out.printf("Result for the pair of Cat:\n->%b", cat1==cat2);
    }
}