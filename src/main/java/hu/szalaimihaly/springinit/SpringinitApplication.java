package hu.szalaimihaly.springinit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringinitApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringinitApplication.class, args);
        System.out.println("Welcome to Springinit!");
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
            log.error("CommandlineRunner.run");
            log.warn("CommandlineRunner.run");
            log.info("CommandlineRunner.run");
            log.debug("CommandlineRunner.run");
            log.trace("CommandlineRunner.run");
        };
    }

}

