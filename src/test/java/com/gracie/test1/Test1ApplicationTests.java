package com.gracie.test1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.gracie.test1.mapper")
public class Test1ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
