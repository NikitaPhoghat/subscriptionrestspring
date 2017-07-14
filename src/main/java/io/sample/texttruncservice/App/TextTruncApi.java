package io.sample.texttruncservice.App;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;



@SpringBootApplication

//@ComponentScan(basePackageClasses = TextTruncService.class)
public class TextTruncApi 
{
	public static void main(String[] args) {
		SpringApplication.run(TextTruncApi.class,args);

	}
}
