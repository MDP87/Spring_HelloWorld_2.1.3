import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean.getMessage());
        Cat catBean = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println("compare HelloWorld  = " +  (bean == bean2) );
        System.out.println("compare Cat = " + (catBean == catBean2));


    }
}