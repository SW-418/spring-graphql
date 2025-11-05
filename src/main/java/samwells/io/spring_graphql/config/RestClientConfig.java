package samwells.io.spring_graphql.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {
    @Bean
    RestClient restClient() {
        return RestClient.builder()
                // TODO: Pull from env config
                .baseUrl("http://localhost:5001")
                .build();
    }
}
