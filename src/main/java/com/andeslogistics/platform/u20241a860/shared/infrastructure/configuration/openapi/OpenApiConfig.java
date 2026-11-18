package com.andeslogistics.platform.u20241a860.shared.infrastructure.configuration.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Central OpenAPI metadata shared by all bounded contexts.
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI andesLogisticsPlatformApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Andes Logistics Platform API")
                        .version("1.0.0")
                        .description("REST API documentation for the Andes Logistics Platform bounded context.")
                        .contact(new Contact().name("Andes Logistics Platform Team"))
                        .license(new License().name("MIT License")
                                .url("https://opensource.org/licenses/MIT")));
    }
}
