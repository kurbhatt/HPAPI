package org.hp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Main extends SpringBootServletInitializer {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/*public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		Main.LOGGER.info("Startup Complete!");
	}*/

	public static void main(String[] args) {
		new Main().configure(new SpringApplicationBuilder(Main.class)).run(args);
	}
}
