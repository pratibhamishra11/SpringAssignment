package SpringAssignment3.springAssignment3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Triangle tr() {
		return new Triangle("Isosceles", 5, 5, 3);
	}

}
