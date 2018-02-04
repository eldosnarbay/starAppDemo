package kz.eldos.mybatis.mapper;

import kz.eldos.mybatis.model.Star;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StarMapper {

    @Select("SELECT * FROM star")
    @Results({
            @Result(property = "categoryId", column = "category_id"),
            @Result(property = "discovererId", column = "discoverer_id")
    })
    List<Star> getAll();

    @Insert("INSERT INTO star(name, coorX, coorY, category_id, discoverer_id) " +
            "VALUES (#{name}, #{coorX}, #{coorY}, #{categoryId}, #{discovererId})")
    void insert(Star star);

    @Update("UPDATE star SET name = #{name}, coorX = #{coorX}, coorY = #{coorY}, " +
            "category_id = #{categoryId}, discoverer_id = #{discovererId} where id = #{id}")
    void update(Star star);

    @Delete("DELETE FROM star WHERE id = #{id}")
    Integer delete(Integer id);
}
