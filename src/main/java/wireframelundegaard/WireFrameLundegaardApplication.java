package wireframelundegaard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("entities")
@ComponentScan(basePackages = {"rest","services"})
@EnableJpaRepositories(basePackages = {"repositories"})

public class WireFrameLundegaardApplication {

	public static void main(String[] args) {
		SpringApplication.run(WireFrameLundegaardApplication.class, args);
	}

}
