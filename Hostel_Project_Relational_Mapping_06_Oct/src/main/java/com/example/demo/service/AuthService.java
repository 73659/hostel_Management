//package com.example.demo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;
//
//import com.example.demo.dto.LoginRequest;
//import com.example.demo.dto.LoginResponse;
//import com.example.demo.entity.User;
//import com.example.demo.repository.UserRepo;
//import com.example.demo.security.JwtUtil;
//
//@Service
//public class AuthService {
//
//    @Autowired
//    private UserRepo userRepo;
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    public LoginResponse login(LoginRequest request) {
//
//        User user = userRepo.findByEmail(request.getEmail())
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
//
//        if (!user.getPassword().equals(request.getPassword())) {
//            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid Password");
//        }
//
//        String token = jwtUtil.generateToken(user.getEmail());
//
//        return new LoginResponse(token, user.getRole());
//    }
//}
