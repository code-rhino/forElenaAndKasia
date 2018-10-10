package io.zipcode.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication implements CommandLineRunner {

    @Autowired
    private ProfileRepo profileRepo;

    @Autowired
    private CardPlayerRepository cardPlayerRepository;

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Profile profile = new Profile("Tariq", 100.0);
        profileRepo.save(profile);
        CardPlayer cardPlayer = new CardPlayer(profile);
        cardPlayerRepository.save(cardPlayer);
    }
}
