package samwells.io.spring_graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringGraphqlApplication {

	static void main(String[] args) {
		SpringApplication.run(SpringGraphqlApplication.class, args);
	}

}
