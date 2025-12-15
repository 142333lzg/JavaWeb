package org.example.springbootweb01.cotroller;

import cn.hutool.core.io.IoUtil;
import org.example.springbootweb01.pojo.User;
import org.example.springbootweb01.service.UserService;
import org.example.springbootweb01.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list() throws Exception {
        List<User> userList = userService.findAll();
        return userList;
    }
}
