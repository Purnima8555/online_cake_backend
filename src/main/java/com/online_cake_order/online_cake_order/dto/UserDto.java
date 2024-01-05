package com.online_cake_order.online_cake_order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
    private Integer id;

    @NotNull
    private String fullName;

    @NotNull
    private String email;

    @NotNull
    private String mobileNo;

    @NotNull
    private String password;
}
