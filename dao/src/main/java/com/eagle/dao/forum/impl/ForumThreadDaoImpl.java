package com.eagle.dao.forum.impl;

import com.eagle.dao.BaseDao;
import com.eagle.dao.forum.ForumThread;
import com.eagle.dao.forum.ForumThreadDao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: eagle
 * Date: 14-8-4
 * Time: 下午9:31
 * To change this template use File | Settings | File Templates.
 */
public class ForumThreadDaoImpl extends BaseDao implements ForumThreadDao {

    @Override
    public List<ForumThread> findAll() {
        return getSqlSession().selectList("forumThread.findAll");
    }
}
