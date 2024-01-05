package com.online_cake_order.online_cake_order.controller;

import com.online_cake_order.online_cake_order.dto.ItemDto;
import com.online_cake_order.online_cake_order.entity.Item;
import com.online_cake_order.online_cake_order.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/data")
    public  String getData(){
        return "data retrieved";
    }

    @PostMapping("/save")
    public String createData(@RequestBody ItemDto itemDto){
        itemService.save(itemDto);
        return "created data";
    }

    @GetMapping("/getAll")
    public List<Item> getAllData() {
        return itemService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<Item> getById(@PathVariable("id") Integer id) {
        return itemService.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public  void deleteById(@PathVariable("id") Integer id) {
        itemService.deleteById(id);
    }

}
