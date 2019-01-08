package com.capella.esb.database.repository;

import com.capella.esb.database.entity.User;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/database-jpa-context.xml")
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