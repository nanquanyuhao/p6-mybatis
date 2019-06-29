package net.nanquanyuhao.mybatis.unit02;

import net.nanquanyuhao.mybatis.unit02.po.User;
import net.nanquanyuhao.mybatis.unit02.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * 测试入门案例
 */
public class Test2 {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception {

        // 加载全局配置文件（同时把映射文件也加载了）
        String resource = "unit02/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // sqlsessionFactory需要通过sqlsessionFactoryBuilder读取全局配置文件信息之后
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById() {

        // 创建 UserMapper 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 调用 UserMapper 对象的 API
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }

}
