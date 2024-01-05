package com.online_cake_order.online_cake_order.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    @NotNull
    private Long item_id;

    @NotNull
    private  Integer user_id;

    @NotNull
    private Integer quantity;
}
