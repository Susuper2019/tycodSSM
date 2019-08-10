package cn.susuper.test;



import cn.susuper.mapper.UserMapper;
import cn.susuper.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

/**
 * @author susuper
 * @date 2019/8/8 17:45
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement preStmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm_demo","root","root");
            rs = conn.createStatement().executeQuery("select * from tb_user");
            while(rs.next()){
                System.out.println(rs.getString("username"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void run11() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis/mybatis.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.login("admin"));
    }
    @org.junit.Test
    public void testRunService(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring.xml");
//        UserService userService = (UserService) ac.getBean(UserService.class);
        UserService userService = (UserService) ac.getBean("userService");//均可
        System.out.println(userService.login("admin"));
    }

}
