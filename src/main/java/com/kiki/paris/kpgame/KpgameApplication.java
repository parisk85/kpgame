package com.kiki.paris.kpgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class KpgameApplication {

	public static void main(String[] args) {
		SpringApplication.run(KpgameApplication.class, args);
	}

	@RequestMapping("/home")
	public List<Developer> home() {
		List<Developer> developers = new ArrayList();

		developers.add(new Developer("Kiki", "Front-End Developer", "https://www.linkedin.com/in/paris-karagiannopoulos-b19262b1"));
		developers.add(new Developer("Paris", "Back-End Developer", "https://www.linkedin.com/in/vasiliki-loukoumi-41426492"));

		return developers;
	}
}
