package kz.eldos.mybatis;

import kz.eldos.mybatis.model.Category;
import kz.eldos.mybatis.model.Discoverer;
import kz.eldos.mybatis.model.Star;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes({Category.class, Discoverer.class, Star.class})
@MapperScan("kz.eldos.mybatis.mapper")
@SpringBootApplication()
public class MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}
}
