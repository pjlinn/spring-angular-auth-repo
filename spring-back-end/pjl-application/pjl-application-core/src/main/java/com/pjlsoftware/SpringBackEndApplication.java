package com.pjlsoftware;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = {
        SpringBackEndApplication.class,
        Jsr310JpaConverters.class
})
public class SpringBackEndApplication {
    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(SpringBackEndApplication.class, args);
    }
}
