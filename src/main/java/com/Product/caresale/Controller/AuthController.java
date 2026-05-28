package com.Product.caresale.Controller;

import com.Product.caresale.security.JwtUtil;
import com.Product.caresale.security.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        if(request.getUsername().equals("admin")
        && request.getPassword().equals("1234")) {
            return jwtUtil.generateToken(request.getUsername());
        }
        return "Invalid credentials ";
    }
}
