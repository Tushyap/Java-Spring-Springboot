package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class TestConfig {

	@Bean
    Docket postApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
//				.paths(PathSelectors.ant("/test/*"))
//				.apis(RequestHandlerSelectors.basePackage("com.test"))				
				.build()
				.apiInfo(metaData());
	}

    ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Test Service")
				.description("sample documentation using swagger for test microservice")
				.termsOfServiceUrl("https://globallogic.com")
				.license("Testing")
				.licenseUrl("http://www.testcenter.com")
				.version("1.0")
				.build();
	}
}
