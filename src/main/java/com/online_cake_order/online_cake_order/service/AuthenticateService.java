package com.online_cake_order.online_cake_order.service;

import com.online_cake_order.online_cake_order.dto.AuthenticateRequest;
import com.online_cake_order.online_cake_order.dto.AuthenticateResponse;

public interface AuthenticateService {

    AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest);
}
