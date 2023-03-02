package com.ds.internship1;

import com.ds.internship1.controller.PurchaseController;
import com.ds.internship1.model.Customer;
import com.ds.internship1.repository.PurchaseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Internship1Application {

	public static void main(String[] args) {
		SpringApplication.run(Internship1Application.class, args);
		Customer customer = new Customer("wojciech", "nowak");
	}

}
