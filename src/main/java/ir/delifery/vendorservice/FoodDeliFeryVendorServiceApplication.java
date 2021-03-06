package ir.delifery.vendorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FoodDeliFeryVendorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliFeryVendorServiceApplication.class, args);
	}

}
