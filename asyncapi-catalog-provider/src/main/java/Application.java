

import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Supplier<Catalog> CatalogEvent() {
		return () -> {
			// Add business logic here.
			return new Catalog();
		};
	}

	@Bean
	public Supplier<Product> ProductEvent() {
		return () -> {
			// Add business logic here.
			return new Product();
		};
	}

}
