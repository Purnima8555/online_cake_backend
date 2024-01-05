package com.online_cake_order.online_cake_order.repository;

import com.online_cake_order.online_cake_order.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ItemRepository extends JpaRepository <Item, Integer> {

}
