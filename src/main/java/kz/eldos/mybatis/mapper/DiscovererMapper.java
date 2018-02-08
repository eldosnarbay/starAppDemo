package kz.eldos.mybatis.mapper;

import kz.eldos.mybatis.model.Discoverer;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DiscovererMapper {

    @Select("SELECT * FROM discoverer")
    @Results({
            @Result(property = "firstName", column = "fname"),
            @Result(property = "lastName", column = "lname")
    })
    List<Discoverer> getAll();

    @Select("SELECT * FROM discoverer WHERE id = #{id}")
    @Results({
            @Result(property = "firstName", column = "fname"),
            @Result(property = "lastName", column = "lname")
    })
    Discoverer findById(Integer id);

    @Insert("INSERT INTO discoverer(fname, lname) VALUES (#{firstName}, #{lastName})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(Discoverer discoverer);

    @Update("UPDATE discoverer SET fname = #{firstName}, lname = #{lastName} WHERE id = #{id}")
    void update(Discoverer discoverer);

    @Delete("DELETE FROM discoverer WHERE id = #{id}")
    Integer delete(Integer id);

}
