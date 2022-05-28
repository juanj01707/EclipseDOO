package co.edu.uco.grades.api.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponetScan(basePackages = {"co.edu.uco.grades"})
public class ApiGradesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGradesApplication.class, args);
	}

}
 