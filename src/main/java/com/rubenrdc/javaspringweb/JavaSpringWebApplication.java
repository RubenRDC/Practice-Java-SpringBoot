package com.rubenrdc.javaspringweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@PropertySources({ Para cargar archivos de configuracion personalizados y cargarlos con la etique @Value ("${config.value}")
    @PropertySource(value="casspath:values.propieties",encoding = "UTF-8"),
    @PropertySource(value="casspath:values2.propieties",encoding = "UTF-8")
})*/
public class JavaSpringWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringWebApplication.class, args);
    }
}
/*
Para cargar archivos de configuracion personalizados y cargarlos con la etiqueta @Value("${config.value}")
en una clase independiente.
@Configuration
@PropertySources({ 
    @PropertySource(value="casspath:values.propieties",encoding = "UTF-8"),
    @PropertySource(value="casspath:values2.propieties",encoding = "UTF-8")
})
class ValuesConfig {

}*/
