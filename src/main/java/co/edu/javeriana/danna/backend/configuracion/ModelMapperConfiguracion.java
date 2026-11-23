package co.edu.javeriana.danna.backend.configuracion;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguracion {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
