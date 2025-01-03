package practice.dockerpractice;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080", "http://3.34.1.0:8080",
                        "http://localhost:5173",
                        "https://localhost:5173",
                        "https://127.0.0.1:5173"
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE")
        ;

    }
}

