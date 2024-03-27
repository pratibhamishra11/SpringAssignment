package SpringAssignment3.springAssignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new  AnnotationConfigApplicationContext(JavaConfig.class);
    	Triangle t=(Triangle) context.getBean("tr");
    	
        System.out.println(t);
    }
}