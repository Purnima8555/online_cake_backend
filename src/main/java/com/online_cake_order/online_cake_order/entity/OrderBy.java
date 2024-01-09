package com.online_cake_order.online_cake_order.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class OrderBy {

    @Id
    @SequenceGenerator(name = "orders_seq_gen", sequenceName = "orders_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "orders_seq_gen", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    private User user;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;
}

