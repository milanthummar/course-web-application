package course.application.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CourseWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseWebAppApplication.class, args);
	}
}
