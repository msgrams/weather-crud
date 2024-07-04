package com.msgrams.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: LiZhi
 * @Date: 2024/7/4 - 9:26
 * @Description: com.msgrams.config
 * @version: 1.0
 */
@Configuration
public class SwaggerConfig {
    /*
    * http://localhost:8080/swagger-ui/#/
    * */
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("接口文档标题")
                        .description("SpringBoot3 集成 Swagger3接口文档")
                        .version("v1"))
                .externalDocs(new ExternalDocumentation()
                        .description("项目API文档")
                        .url("/"));
    }
}
