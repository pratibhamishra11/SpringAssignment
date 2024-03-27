package SpringAssignment1.springAssignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
        		new ClassPathXmlApplicationContext("applicationContext.xml"); 
    	
    	question1 e =(question1) context.getBean("employees");

        e.display();
    }
}