package com.pao.xmlJsonParser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.pao.controller"})
@SpringBootApplication
public class XmlJsonParserApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlJsonParserApplication.class, args);
	}

}
