package kz.eldos.mybatis.mapper;

import kz.eldos.mybatis.model.Star;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StarMapper {

    @Select("SELECT * FROM star")
    @Results({
            @Result(property = "categoryId", column = "category_id"),
            @Result(property = "discovererId", column = "discoverer_id")
    })
    List<Star> getAll();
}
