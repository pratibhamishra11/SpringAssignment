package SpringAssignment2.springAssignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringAssignment2/springAssignment2/config.xml");
    	drawing d=(drawing) context.getBean("drawing");
    	System.out.println(d);
    }
}
