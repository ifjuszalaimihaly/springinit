package hu.szalaimihaly.springinit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringinitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringinitApplication.class, args);
        System.out.println("Welcome to Springinit!");
    }

    @Bean
    @Profile("dev")
    CommandLineRunner runner(){
        return args -> {
            System.out.println("This is something run in dev mode only");
        };
    }

}

