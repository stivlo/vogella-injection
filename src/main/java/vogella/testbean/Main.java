package vogella.testbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

        public static void main(String[] args) {
                ApplicationContext context = new ClassPathXmlApplicationContext(
                                "META-INF/spring/applicationContext.xml");
                MySpringBeanWithDependency test = context.getBean(MySpringBeanWithDependency.class);
                test.run();
        }

}
