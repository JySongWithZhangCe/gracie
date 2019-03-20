package com.gracie.test1.mapper;

import com.gracie.test1.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.gracie.test1.mapper")
public class UserMapperSpec {

    @Autowired
    private UserMapper mapper;

    @Test
    public void insertTest(){
        User user = new User();
        user.setUsername("Kevin");
        user.setPassword("032421");
        user.setRole("admin");
        int i = mapper.insertSelective(user);
        System.out.println(i);
    }

    @Test
    public void selectTest() {
        System.out.println(mapper.selectByPrimaryKey(2).getUsername());
    }
}
