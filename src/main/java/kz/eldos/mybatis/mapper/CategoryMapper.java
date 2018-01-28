package kz.eldos.mybatis.mapper;

import kz.eldos.mybatis.model.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Select("SELECT * FROM category")
    List<Category> getAll();

    @Insert("INSERT INTO category(name) VALUES(#{name})")
    void insert(Category category);

    @Update("UPDATE category SET name = #{name} where id = #{id}")
    void update(Category category);

    @Delete("DELETE FROM category WHERE id = #{id}")
    Integer delete(Integer id);
}
