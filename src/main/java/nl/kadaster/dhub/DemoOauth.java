package nl.kadaster.dhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@Configuration
@EnableGlobalAuthentication
@EnableMethodSecurity
//@EnableWebSecurity

public class DemoOauth {

    public static void main(String[] args) {
        SpringApplication.run(DemoOauth.class, args);
    }

}