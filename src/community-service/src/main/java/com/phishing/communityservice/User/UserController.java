package com.phishing.communityservice.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phishing.communityservice.Group.Group;

@RestController
@RequestMapping("/users")
public class UserController {

    // 사용자가 그룹을 등록하는 페이지
    @PostMapping("/register-group")
    public ResponseEntity<String> registerGroup(@RequestBody Group group) {
        // 그룹 등록 로직
        return ResponseEntity.ok("Group registered successfully");
    }
}
