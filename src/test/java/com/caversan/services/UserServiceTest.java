package com.caversan.services;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.caversan.model.User;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration(classes = { UserService.class })
public class UserServiceTest {
	
	@Autowired
    UserService userService;
	
	@Test
	public void findByUserNameOrEmailTest() {
		
		List<User> users = userService.findByUserNameOrEmail("mkyong");
		assertThat(users.size(), is(1));
		
	}

}
