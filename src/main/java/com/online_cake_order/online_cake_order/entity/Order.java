package com.online_cake_order.online_cake_order.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders", uniqueConstraints = {
        @UniqueConstraint(name = "UNIQUE_order_detail", columnNames = "Order_Detail")
})


public class Order {
    @Id
    @SequenceGenerator(name = "order_seq_gen", sequenceName = "orders_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "orders_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "Order_Detail", nullable = false)
    private String OrderDetail;


}