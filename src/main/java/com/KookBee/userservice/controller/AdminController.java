package com.KookBee.userservice.controller;

import com.KookBee.userservice.domain.request.ManagerSignUpRequest;
import com.KookBee.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final UserService userService;
    @PostMapping
    public String SignUp(@RequestBody ManagerSignUpRequest request){
        userService.managerSignUp(request);
        return "성공";
    }
}
