package com.online_cake_order.online_cake_order.service;

import com.online_cake_order.online_cake_order.dto.UserDto;
import com.online_cake_order.online_cake_order.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    String save(UserDto userDto);

    List<User> getAll();

    Optional<User> getById(Integer id);

    void deleteById(Integer id);
}
