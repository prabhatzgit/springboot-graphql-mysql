package com.springgraphql.mysql.mysql;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.springgraphql.mysql.SpringBootGraphqlMysqlApplication;

@SpringBootTest(classes = SpringBootGraphqlMysqlApplication.class, 
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootGraphqlMysqlApplicationTests {

	@Test
	void contextLoads() {
	}

}
