package org.apache.ibatis.test;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2021/1/9 8:32 下午
 */
public class Ratings {
  private Integer id;
  private Integer category;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

  @Override
  public String toString() {
    return "Ratings{" +
      "id=" + id +
      ", category=" + category +
      '}';
  }
}
