package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.models.Guitare;
import com.example.models.IInstrument;

@Configuration
@ComponentScan({"com.example.*"})
public class AppConfig {

	@Bean
	public IInstrument getGuitare() {
		return new Guitare("Yukulele");
	}

}
