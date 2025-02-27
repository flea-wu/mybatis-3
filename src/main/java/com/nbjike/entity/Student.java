package com.nbjike.entity;

/**
 * <p>
 *
 * @author panjing（panjing.wu@tuya.com）
 * @since 2021/8/3 2:08 上午
 */
public class Student {

  private Long id;
  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
      "id=" + id +
      ", name='" + name + '\'' +
      '}';
  }
}
