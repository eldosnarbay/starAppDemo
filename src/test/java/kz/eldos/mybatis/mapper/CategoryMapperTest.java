package kz.eldos.mybatis.mapper;

import kz.eldos.mybatis.model.Category;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CategoryMapperTest extends AbstractTestNGSpringContextTests{
    @Autowired CategoryMapper categoryMapper;

    @Test
    public void testFindById() throws Exception {
        Category category = categoryMapper.findById(1);
        assertEquals("Голубая", category.getName());
    }

}