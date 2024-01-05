package com.online_cake_order.online_cake_order.service;

import com.online_cake_order.online_cake_order.dto.ItemDto;
import com.online_cake_order.online_cake_order.entity.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    String save(ItemDto itemDto);

    List<Item> getAll();
    Optional<Item> getById(Integer id);
    void deleteById(Integer id);
}
