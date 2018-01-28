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

    @Insert("INSERT INTO discoverer(fname, lname) VALUES (#{firstName}, #{lastName})")
    void insert(Discoverer discoverer);

    @Update("UPDATE discoverer SET fname = #{firstName}, lname = #{lastName} WHERE id = #{id}")
    void update(Discoverer discoverer);

    @Delete("DELETE FROM discoverer WHERE id = #{id}")
    Integer delete(Integer id);

}
