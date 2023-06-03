package io.bootify.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"io.bootify"})
@EnableJpaRepositories(basePackages = {"io.bootify"})// scan JPA entities
@SpringBootApplication
public class MyAppApplication {

    public static void main(final String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
    }

}
