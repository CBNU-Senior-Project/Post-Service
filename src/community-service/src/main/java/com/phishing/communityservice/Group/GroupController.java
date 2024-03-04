package com.phishing.communityservice.Group;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phishing.communityservice.User.User;

@RestController
@RequestMapping("/groups")
public class GroupController {

    // �׷� �ο� �߰�
    @PostMapping("/{groupId}/add-member")
    public ResponseEntity<String> addMemberToGroup(@PathVariable Long groupId, @RequestBody User user) {
        // �׷쿡 ��� �߰� ����
        return ResponseEntity.ok("Member added successfully to group");
    }

    // �׷� �ο� ����
    @DeleteMapping("/{groupId}/remove-member/{userId}")
    public ResponseEntity<String> removeMemberFromGroup(@PathVariable Long groupId, @PathVariable Long userId) {
        // �׷쿡�� ��� ���� ����
        return ResponseEntity.ok("Member removed successfully from group");
    }

    
    // �׷� �ο� ����
    @PutMapping("/{groupId}/update-member/{userId}")
    public ResponseEntity<String> updateMemberInGroup(@PathVariable Long groupId, @PathVariable Long userId, @RequestBody User user) {
        // �׷��� ��� ���� ���� ����
        return ResponseEntity.ok("Member updated successfully in group");
    }

    // API ����

    // �׷� �ο��� �����ִ� API
    @GetMapping("/{groupId}")
    public ResponseEntity<Group> getGroup(@PathVariable Long groupId) {
        // �׷� ���� ��ȸ ����
        Group group = new Group(); // ���÷� ����
        return ResponseEntity.ok(group);
    }

   
}

