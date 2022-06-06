package com.example.demo.controller;

import com.example.demo.vo.AdminUser;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminUserController {

    @PostMapping("adminUser/create")
    public AdminUser create(
            @RequestParam int adminUserStatus,
            @RequestParam String adminUserName,
            @RequestParam String adminUserPassword
    ) {

        return new AdminUser(adminUserName, adminUserPassword, adminUserStatus);
    }

    @GetMapping("adminUser/find")
    public AdminUser find(
            @RequestParam int id
    ) {
        return new AdminUser(id, "demodeom", "12345678", 1);
    }

    @PutMapping("adminUser/update")
    public AdminUser update(
            @RequestParam int id,
            @RequestParam String adminUserName,
            @RequestParam String adminUserPassword,
            @RequestParam int adminUserStatus
    ) {
        return new AdminUser(id, adminUserName, adminUserPassword, adminUserStatus);
    }

    @DeleteMapping("adminUser/delete")
    public AdminUser delete(
            @RequestParam int id
    ) {
        return new AdminUser(id, "demo_new", "666666", 2);
    }

    @DeleteMapping("adminUser/delete/{id}")
    public AdminUser deleteNew(
            @PathVariable int id) {
        return new AdminUser(id, "demo_new", "666666", 2);
    }

    @PostMapping("adminUser/createNew")
    public AdminUser createNew(@RequestBody AdminUser adminUser) {
        return adminUser;
    }

}
