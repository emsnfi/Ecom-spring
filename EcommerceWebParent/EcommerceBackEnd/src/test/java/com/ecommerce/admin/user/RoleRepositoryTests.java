package com.ecommerce.admin.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.ecommerce.common.entity.Role;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)

public class RoleRepositoryTests {

	@Autowired
	private RoleRepository repo;

	
	@Test 
	public void testCreateFirstRole() {
		// For create an fixed role, such as admin
		// Since different role, has different right
		// This is for create a instance of entity
		Role roleAdmin = new Role("Admin","manage everything");
		Role saveRole = repo.save(roleAdmin);
		assertThat(saveRole.getId()).isGreaterThan(0);
	}
	
}
