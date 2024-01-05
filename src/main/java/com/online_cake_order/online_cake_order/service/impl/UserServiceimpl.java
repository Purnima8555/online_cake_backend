
package com.online_cake_order.online_cake_order.service.impl;

import com.online_cake_order.online_cake_order.dto.UserDto;
import com.online_cake_order.online_cake_order.entity.User;
import com.online_cake_order.online_cake_order.repository.UserRepository;
import com.online_cake_order.online_cake_order.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceimpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public String save(UserDto userDto) {

        User user = new User();

        if(userDto.getId()!=null) {
            user=userRepository.findById((userDto.getId())).orElseThrow(() ->new NullPointerException("data not found"));
        }

        user.setEmail(userDto.getEmail());
        user.setFullName(userDto.getFullName());
        user.setMobileNo(userDto.getMobileNo());
        user.setPassword(userDto.getPassword());

        userRepository.save(user);


        return "created";
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }


}