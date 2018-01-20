package com.jalgoarena

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2


@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
@Configuration
@EnableSwagger2
open class JAlgoArenaAuthServer {

    @Bean
    open fun jalGoArenaApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.jalgoarena"))
                .paths(PathSelectors.any()).build()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(JAlgoArenaAuthServer::class.java, *args)
}
