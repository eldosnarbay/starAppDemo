package kz.eldos.mybatis.resources;

import kz.eldos.mybatis.mapper.CategoryMapper;
import kz.eldos.mybatis.mapper.DiscovererMapper;
import kz.eldos.mybatis.mapper.StarMapper;
import kz.eldos.mybatis.model.Category;
import kz.eldos.mybatis.model.Discoverer;
import kz.eldos.mybatis.model.Star;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stars")
public class StarResource {
    @Autowired private StarMapper starMapper;
    @Autowired private CategoryMapper categoryMapper;
    @Autowired private DiscovererMapper discovererMapper;

    @CrossOrigin
    @GetMapping("/all")
    public List<Star> getAll(){
        return starMapper.getAll();
    }

    @CrossOrigin
    @PostMapping("/insert")
    public ResponseEntity create(@RequestBody Star star){
        if(star == null){
            return ResponseEntity.noContent().build();
        }

        starMapper.insert(star);
        return new ResponseEntity<>("Created", HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("")
    public List<Map<String, String>> getStars(){
        List<Map<String, String>> list = new ArrayList<>();
        List<Star> stars = starMapper.getAll();

        for(Star star : stars){
            Category category = categoryMapper.findById(star.getCategoryId());
            Discoverer discoverer = discovererMapper.findById(star.getDiscovererId());
            Map<String, String> obj = new HashMap<>();
            obj.put("id", star.getId().toString());
            obj.put("name", star.getName());
            obj.put("coorX", star.getCoorX());
            obj.put("coorY", star.getCoorY());
            obj.put("categoryId", star.getCategoryId().toString());
            obj.put("category", category.getName());
            obj.put("discovererId", star.getDiscovererId().toString());
            obj.put("discovererFirstName", discoverer.getFirstName());
            obj.put("discovererLastName", discoverer.getLastName());
            list.add(obj);
        }

        return list;
    }

    @CrossOrigin
    @PostMapping("/update/{id}")
    public ResponseEntity update(@PathVariable Integer id, @RequestBody Star star){
        if(id == null){
            return ResponseEntity.notFound().build();
        }

        if(star == null){
            return ResponseEntity.noContent().build();
        }

        if(star.getId() == null){
            star.setId(id);
        }

        starMapper.update(star);

        return new ResponseEntity<>("Updated", HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        Integer delId = starMapper.delete(id);
        if(delId == 0){
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);
    }
}