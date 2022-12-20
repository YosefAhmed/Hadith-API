package com.example.HadithAPISpringBoot;

import com.example.HadithAPISpringBoot.Models.HadithBook;
import com.example.HadithAPISpringBoot.Services.HadithService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class HadithApiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HadithApiSpringBootApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(HadithService hadithService){
		return args -> {
			File dir = new File("src/main/resources/static/books");
			File[] directoryListing = dir.listFiles();
			for (File jsonFile : directoryListing) {
				ObjectMapper mapper = new ObjectMapper();
				TypeReference<HadithBook> typeReference = new TypeReference<HadithBook>(){};
				InputStream inputStream = TypeReference.class.getResourceAsStream("/static/books/"+jsonFile.getName());
				try {
					HadithBook hadithBook = mapper.readValue(inputStream,typeReference);
					hadithService.saveHadith(hadithBook.getHadithList());
					System.out.println("("+hadithBook.getHadithList().size()+") Hadith from ("+hadithBook.getBookName()+") book are saved successfully!");

				}catch (IOException e){
					System.out.println("Unable to save data: " + e.getMessage());
				}
			}
		};
	}
}
