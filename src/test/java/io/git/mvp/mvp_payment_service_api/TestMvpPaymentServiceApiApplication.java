package io.git.mvp.mvp_payment_service_api;

import org.springframework.boot.SpringApplication;

public class TestMvpPaymentServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(MvpPaymentServiceApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
