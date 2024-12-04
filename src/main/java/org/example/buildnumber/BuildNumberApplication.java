package org.example.buildnumber;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BuildNumberApplication implements CommandLineRunner {

    @Value("${build.number}")
    private String buildNumber;

    public static void main(String[] args) {
        SpringApplication.run(BuildNumberApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        log.info("Build number: {}", buildNumber);
    }
}
