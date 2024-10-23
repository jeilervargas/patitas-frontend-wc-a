package pe.edu.cibertec.patitas_frontend_wc_a.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutenticacionFeignConfig {

    @Bean
    public Request.Options feignRequestOptions() {
        return new Request.Options(10000, 10000);
    }
}
