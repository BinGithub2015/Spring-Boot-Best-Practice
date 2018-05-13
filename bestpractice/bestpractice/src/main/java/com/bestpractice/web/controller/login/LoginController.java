package com.bestpractice.web.controller.login;

import com.bestpractice.db.mysql.mapper.UserMapper;
import com.bestpractice.db.mysql.model.User;
import com.bestpractice.web.controller.BaseRestController;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping(value = "/login")
public class LoginController extends BaseRestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Response get() {

        String resource = "sqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);;
        } catch (IOException e) {
            e.printStackTrace();
            return response(StateCode.SUCCESS, System.getProperty("user.dir"));
            //return response(StateCode.SUCCESS, e.getMessage());
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        //SqlSEssion帮我生成一个实现类  （给接口）
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        session.close();
        return response(StateCode.SUCCESS, user);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Response post(HttpServletRequest request, HttpServletResponse response) {
        //todo cookie session
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        //SqlSEssion帮我生成一个实现类  （给接口）
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        session.close();
        return response(StateCode.SUCCESS, user);
    }

}
