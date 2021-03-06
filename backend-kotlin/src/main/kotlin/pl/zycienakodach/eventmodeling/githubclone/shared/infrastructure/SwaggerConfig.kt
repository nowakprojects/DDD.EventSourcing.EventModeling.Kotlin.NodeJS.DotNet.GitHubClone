package pl.zycienakodach.eventmodeling.githubclone.shared.infrastructure

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    fun api(): Docket =
        Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select().apis(RequestHandlerSelectors.any())
            .build()

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("Kotlin | GitHub Clone REST API | ZycieNaKodach.pl")
            .version("0.0.1")
            .contact(Contact("Mateusz Nowak", "zycienakodach.pl", "mateusz@zycienakodach.pl"))
            .build()
    }
}
