package cn.susuper.pojo;

import java.io.Serializable;

/**
 * 视图登录的javabean
 * @author susuper
 * @date 2019/8/8 17:35
 */
public class User  implements Serializable {
    //用户id
    private Long id;
    //用户登录名
    private String username;
    //用户密码
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
