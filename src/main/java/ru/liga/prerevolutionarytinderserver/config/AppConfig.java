package ru.liga.prerevolutionarytinderserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.liga.prerevolutionarytinderserver.services.DefaultConsumerService;
import ru.liga.prerevolutionarytinderserver.services.api.ConsumerService;

@Configuration
public class AppConfig {

    @Bean
    public ConsumerService consumerService() {
        return new DefaultConsumerService();
}

}
