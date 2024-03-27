package SpringAssignment4.springAssignment4;


import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages="SpringAssignment4.springAssignment4")
@EnableAspectJAutoProxy
public class JavaConfig {

	@Bean
	public Triangle tr() {
		return new Triangle("Isosceles", 5, 5, 3);
	}
	
	@Bean
	public AspectLog al() {
		return new AspectLog();
	}
}