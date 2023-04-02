package com.demo.codeanalysis;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeanalysisApplicationTests {
	
	@Autowired
	private CodeanalysisApplication application;

	@Test
	void contextLoads() {
		assertThat(application).isNotNull();
	}

}
