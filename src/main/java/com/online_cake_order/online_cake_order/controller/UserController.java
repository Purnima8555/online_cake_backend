package com.online_cake_order.online_cake_order.controller;

import com.online_cake_order.online_cake_order.dto.UserDto;
import com.online_cake_order.online_cake_order.entity.User;
import com.online_cake_order.online_cake_order.service.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/data")
    public  String getData(){
        return "data retrieved";
    }

    @PostMapping("/save")
    public String createData(@RequestBody UserDto userDto){
        userService.save(userDto);
        return "created data";
    }

    @GetMapping("/getAll")
    public List<User> getAllData() {
        return userService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<User> getById(@PathVariable("id") Integer id) {
        return userService.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public  void deleteById(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }

}