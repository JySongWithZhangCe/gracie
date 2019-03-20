package com.gracie.test1.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.gracie.test1.mapper")
public class ClassMapperSpec {

    @Autowired
    private ClassMapper mapper;

    @Test
    public void selectTest() {
        System.out.println(mapper.selectByPrimaryKey(2).getClassname());
    }
}
