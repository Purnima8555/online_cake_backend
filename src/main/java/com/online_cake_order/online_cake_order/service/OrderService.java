package com.online_cake_order.online_cake_order.service;

import com.online_cake_order.online_cake_order.dto.OrderDto;
import com.online_cake_order.online_cake_order.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    String save(OrderDto orderDTO);

    String createOrder(OrderDto orderDTO);

    List<Order> getAllOrders();

    Optional<Order> getOrderById(Integer id);

    void deleteOrderById(Integer id);


}