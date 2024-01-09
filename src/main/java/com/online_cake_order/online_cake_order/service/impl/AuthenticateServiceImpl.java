package com.online_cake_order.online_cake_order.service.impl;

import com.online_cake_order.online_cake_order.Security.JwtService;
import com.online_cake_order.online_cake_order.dto.AuthenticateRequest;
import com.online_cake_order.online_cake_order.dto.AuthenticateResponse;
import com.online_cake_order.online_cake_order.repository.UserRepository;
import com.online_cake_order.online_cake_order.service.AuthenticateService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticateServiceImpl implements AuthenticateService {

    private final UserRepository userRepo;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;


    @Override
    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticateRequest.getEmail(), authenticateRequest.getPassword()
                )
        );

        UserDetails userDetails = (UserDetails) userRepo.getUserByUsername(authenticateRequest.getEmail())
                .orElseThrow(() -> new EntityNotFoundException("User not found."));
        String jwtToken = jwtService.generateToken(userDetails);
        return AuthenticateResponse.builder().token(jwtToken).build();
    }
}
