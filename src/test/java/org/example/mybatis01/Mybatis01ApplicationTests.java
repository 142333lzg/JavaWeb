package org.example.mybatis01;

import org.example.mapper.UserMapper;
import org.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class Mybatis01ApplicationTests {

	@Autowired //注入UserMapper
	private UserMapper userMapper;

	@Test
	public void testfindAll() {
		List<User> userList = userMapper.findAll();
		for (User user : userList) {
			System.out.println(user.getId() + " - " + user.getUsername() + " - " + user.getName());
		}
	}

}
