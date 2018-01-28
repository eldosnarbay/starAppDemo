package kz.eldos.mybatis.resources;

import kz.eldos.mybatis.mapper.StarMapper;
import kz.eldos.mybatis.model.Star;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stars")
public class StarResource {
    @Autowired
    private StarMapper starMapper;

    @GetMapping("")
    public List<Star> getAll(){
        return starMapper.getAll();
    }
}
