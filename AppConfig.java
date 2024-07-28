import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProductFactory productFactory() {
        return new ProductFactory();
    }

    @Bean
    public Product getProduct() {
        return productFactory().createProduct();
    }
}