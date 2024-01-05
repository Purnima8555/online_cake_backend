package com.online_cake_order.online_cake_order.service.impl;

import com.online_cake_order.online_cake_order.dto.ItemDto;
import com.online_cake_order.online_cake_order.entity.Item;
import com.online_cake_order.online_cake_order.repository.ItemRepository;
import com.online_cake_order.online_cake_order.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public String save(ItemDto itemDto) {
        Item item = new Item();

        if (itemDto.getId() != null) {
            item = itemRepository.findById(itemDto.getId()).orElseThrow(() -> new NullPointerException("Data not found"));
        }

        item.setItemName(itemDto.getItemName());
        item.setPrice(itemDto.getPrice());
        item.setQuantity(itemDto.getQuantity());
        item.setDescription(itemDto.getDescription());

        itemRepository.save(item);

        return "created";
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> getById(Integer id) {
        return itemRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        itemRepository.deleteById(id);
    }
}
