package basic.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import basic.boot.config.DevConfig;


@SpringBootApplication
@ComponentScan(basePackages = "basic.boot")
public class Camp3Application {

	@Autowired
	private DevConfig devConfig;

	public static void main(String[] args) {
		SpringApplication.run(Camp3Application.class, args);
	}

}
