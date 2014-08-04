package com.eagle.dao.forum;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: eagle
 * Date: 14-8-4
 * Time: 下午9:29
 * To change this template use File | Settings | File Templates.
 */
public interface ForumThreadDao {
    List<ForumThread> findAll();
}
