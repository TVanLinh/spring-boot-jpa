import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by linhtran on 13/07/17.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"dao", "service", "controller","config"})
@EntityScan(basePackages = "entities")
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}