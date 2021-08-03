package com.nbjike.dao;

import com.nbjike.entity.Student;

import java.util.List;

/**
 * <p>
 *
 * @author panjing（panjing.wu@tuya.com）
 * @since 2021/8/3 2:10 上午
 */
public interface StudentDao {

  List<Student> find();

}
