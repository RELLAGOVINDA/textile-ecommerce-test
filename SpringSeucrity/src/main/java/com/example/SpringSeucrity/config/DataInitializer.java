package com.example.SpringSeucrity.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.SpringSeucrity.Entity.LoginUser;
import com.example.SpringSeucrity.Repository.UserRepository;


@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner createUsers(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {

        return args -> {

            if (userRepository.findByUsername("govinda").isEmpty()) {

            	LoginUser user = new LoginUser();

                user.setUsername("govinda");

                user.setPassword(
                    passwordEncoder.encode("password123")
                );

                user.setRole("USER");

                userRepository.save(user);
            }

            if (userRepository.findByUsername("admin").isEmpty()) {

            	LoginUser admin = new LoginUser();

                admin.setUsername("admin");

                admin.setPassword(
                    passwordEncoder.encode("admin123")
                );

                admin.setRole("ADMIN");

                userRepository.save(admin);
            }
        };
    }
}