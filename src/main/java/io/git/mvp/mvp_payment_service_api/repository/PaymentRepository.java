package io.git.mvp.mvp_payment_service_api.repository;

import io.git.mvp.mvp_payment_service_api.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
