import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by timonewton on 6/9/17.
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "com.prankersize")
public class Application {
    public static void main (String[]args ){
        SpringApplication.run(Application.class, args);
    }
}
