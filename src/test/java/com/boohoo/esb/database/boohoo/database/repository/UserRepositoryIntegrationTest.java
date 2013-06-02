package com.boohoo.esb.database.boohoo.database.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.boohoo.esb.database.entity.User;
import com.boohoo.esb.database.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/boohoo-jpa-context.xml")
public class UserRepositoryIntegrationTest {

	@Autowired 
	UserRepository repository;

	@Test
	public void sampleTestCase() {
		User dave = new User("Dave", "Matthews");
		repository.save(dave);

		User carter = new User("Carter", "Beauford");
		repository.save(carter);

		List<User> result = repository.getUser("Dave");
		assertTrue(result.size() ==  2);
	}
}