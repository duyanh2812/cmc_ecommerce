package com.cmc.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setName("Huy Tú");
//        user.setEmail("dhtu1@cmcglobal.vn");
//        user.setPassword(passwordEncoder.encode("123456"));
//        userMapper.insert(user);
    }
}
