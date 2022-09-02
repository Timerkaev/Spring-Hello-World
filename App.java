import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        ApplicationContext contextCat =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean2 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(bean2.getSay());

        ApplicationContext contextCat2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean3 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(bean3.getSay());
    }
}