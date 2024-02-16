package com.online_cake_order.online_cake_order.service.impl;


import com.online_cake_order.online_cake_order.dto.OrderDto;
import com.online_cake_order.online_cake_order.entity.Order;
import com.online_cake_order.online_cake_order.repository.OrderRepository;
import com.online_cake_order.online_cake_order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class OrderServiceimpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public String save(OrderDto orderDTO) {
        return null;
    }

    @Override
    public String createOrder(OrderDto orderDTO) {
        Order order = new Order();

        if (orderDTO.getId() != null) {
            order = orderRepository.findById(orderDTO.getId()).orElseThrow(() -> new NullPointerException("Order not found"));
        }

        order.setOrderDetail(orderDTO.getOrderDetail());

        orderRepository.save(order);

        return "Order created";
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public void deleteOrderById(Integer id) {
        orderRepository.deleteById(id);
    }
}
