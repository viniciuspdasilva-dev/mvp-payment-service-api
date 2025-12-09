package io.git.mvp.mvp_payment_service_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long orderId;
    private String status;
    private LocalDateTime processedAt;
    private String nsu;

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Payment payment)) return false;

        return Objects.equals(getId(), payment.getId()) && Objects.equals(getOrderId(), payment.getOrderId()) && Objects.equals(getStatus(), payment.getStatus()) && Objects.equals(getProcessedAt(), payment.getProcessedAt()) && Objects.equals(getNsu(), payment.getNsu());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getId());
        result = 31 * result + Objects.hashCode(getOrderId());
        result = 31 * result + Objects.hashCode(getStatus());
        result = 31 * result + Objects.hashCode(getProcessedAt());
        result = 31 * result + Objects.hashCode(getNsu());
        return result;
    }
}
