package com.online_cake_order.online_cake_order.repository;

import com.online_cake_order.online_cake_order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
