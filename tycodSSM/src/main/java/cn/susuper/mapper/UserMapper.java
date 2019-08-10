package cn.susuper.mapper;

import cn.susuper.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * 持久层方法 共xml使用
 * @author susuper
 * @date 2019/8/8 20:39
 */
//@Repository
public interface UserMapper {
    User login(String username);
}
