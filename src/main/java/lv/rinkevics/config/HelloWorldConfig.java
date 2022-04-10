package lv.rinkevics.config;

import lv.rinkevics.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld() throws IOException, ClassNotFoundException {
        return new HelloWorld("message");
    }

}