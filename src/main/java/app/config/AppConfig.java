package app.config;

import app.model.Dog;
import app.model.NanoTimer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name="dog")
    public Dog getDog() {
        return new Dog();
    }
    
    @Bean(name="timer") 
    public NanoTimer getTimer() {
        return new NanoTimer();
    }

}
