package com.maher.microsservice;

import com.maher.microsservice.entities.Role;
import com.maher.microsservice.entities.User;
import com.maher.microsservice.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MicrosserviceApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void testAddUser() {
        User user = new User(null, "khalil", "1234", true, null);
        userService.saveUser(user);
        System.out.println(user);
    }
}
