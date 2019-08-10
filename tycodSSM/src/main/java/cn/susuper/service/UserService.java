package cn.susuper.service;

import cn.susuper.pojo.User;

/**
 * @author susuper
 * @date 2019/8/8 18:05
 */
public interface UserService extends BaseService<User> {
    User login(String name);
}
