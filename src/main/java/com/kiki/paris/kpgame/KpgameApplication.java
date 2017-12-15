package com.kiki.paris.kpgame;

import com.kiki.paris.kpgame.model.Hero;
import com.kiki.paris.kpgame.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class KpgameApplication {

	@Autowired
	HeroRepository heroRepository;

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

	@RequestMapping(value = "hero/create", method = RequestMethod.POST)
	public void create(@RequestParam String name) {
		heroRepository.save(new Hero(name));
	}

	@RequestMapping("/heroes")
	public List<Hero> heroes() {
		return (ArrayList) heroRepository.findAll();
	}
}
