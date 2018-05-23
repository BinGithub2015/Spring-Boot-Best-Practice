package com.bestpractice;

import com.bestpractice.db.mysql.mapper.UserMapper;
import com.bestpractice.db.mysql.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@JacksonTester
	public void contextLoads() {

        String resource = "src/sqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        //SqlSEssion帮我生成一个实现类  （给接口）
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        session.close();

	}

}
