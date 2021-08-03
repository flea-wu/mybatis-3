package com.nbjike;

import com.nbjike.dao.StudentDao;
import com.nbjike.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 *
 * @author panjing（panjing.wu@tuya.com）
 * @since 2021/8/3 1:34 上午
 */
public class MyTest {

  public static void main(String[] args) throws IOException {

    // 读取配置文件
    String resource = "config/mybatis-config.xml";
    InputStream resourceAsStream = Resources.getResourceAsStream(resource);

    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
    List<Student> students = studentDao.find();
    System.out.println(students);

    sqlSession.close();


  }

}
