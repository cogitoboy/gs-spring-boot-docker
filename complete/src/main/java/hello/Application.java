package hello;

import com.azure.security.keyvault.secrets.SecretClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	@Value("${keyvault.secret.secretOne}")
	private String secretOne;

	@Value("${keyvault.secret.secretTwo}")
	private String secretTwo;

	@RequestMapping("/")
	public String home() {
		return "Secret One:" + secretOne + " Secret Two:" + secretTwo ;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
