package fi.academy.aforismit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AforismitApplication {

	public static void main(String[] args) {
		SpringApplication.run(AforismitApplication.class, args);
	}

	@Bean
	public CommandLineRunner alusta(@Autowired Aforismilista aforismilista) {
		return (args) -> {
			aforismilista.lisaaAforismiListalle(new Aforismi("Obi-Wan Kenobi", "The Force will be with you. Always."));
			aforismilista.lisaaAforismiListalle(new Aforismi("Yoda", "Do. Or do not. There is no try."));
			aforismilista.lisaaAforismiListalle(new Aforismi("Han Solo", "Never tell me the odds."));
		};
	}
}
