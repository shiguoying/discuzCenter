package com.eagle.web.test;

import com.eagle.dao.forum.ForumThread;
import com.eagle.dao.forum.ForumThreadDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: eagle
 * Date: 14-8-4
 * Time: 下午9:10
 * To change this template use File | Settings | File Templates.
 */
public class SpringDaoTest {
    ClassPathXmlApplicationContext context = null;
    @Before
    public void setUp(){
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void testDao(){
        ForumThreadDao forumThreadDao = (ForumThreadDao) context.getBean("forumThreadDao");
        List<ForumThread> list = forumThreadDao.findAll();
        System.out.println(list);
    }
}
