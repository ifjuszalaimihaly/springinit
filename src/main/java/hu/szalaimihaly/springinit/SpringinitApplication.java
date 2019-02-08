package hu.szalaimihaly.springinit;

import hu.szalaimihaly.springinit.config.SpringinitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SpringinitProperties.class)
public class SpringinitApplication {

    @Autowired
    private SpringinitProperties springinitProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringinitApplication.class, args);
        System.out.println("Welcome to Springinit!");
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
            System.out.println("Welcome message "  + springinitProperties.getWelcomeMsg());
        };
    }

}

