package com.kiki.paris.kpgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class KpgameApplication {

	public static void main(String[] args) {
		SpringApplication.run(KpgameApplication.class, args);
	}

	@RequestMapping("/home")
	public Map<String, String> home() {
		Map<String, String> map = new HashMap();
		map.put("developer1", "Kiki");
		map.put("developer2", "Paris");
		return map;
	}
}
