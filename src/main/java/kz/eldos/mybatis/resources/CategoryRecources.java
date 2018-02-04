package kz.eldos.mybatis.resources;

import kz.eldos.mybatis.mapper.CategoryMapper;
import kz.eldos.mybatis.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryRecources {

    @Autowired
    private CategoryMapper categoryMapper;

    //get category list
    @GetMapping("")
    public List<Category> getAll(){
        return categoryMapper.getAll();
    }


//    @PostMapping("/insert")
//    public ResponseEntity insert(@RequestBody Category category){
//
//        if(category == null){
//            return ResponseEntity.noContent().build();
//        }
//
//        categoryMapper.insert(category);
//
//        return new ResponseEntity<>("Category created succesfully",  HttpStatus.OK);
//    }

//    @PostMapping("/update/{id}")
//    public ResponseEntity update(@PathVariable Integer id, @RequestBody Category category){
//
//        if(id == null){
//            return ResponseEntity.notFound().build();
//        }
//
//        if(category == null){
//            return ResponseEntity.noContent().build();
//        }
//
//        if(category.getId() == null){
//            category.setId(id);
//        }
//
//        categoryMapper.update(category);
//
//        return ResponseEntity.ok().build();
//    }

//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity delete(@PathVariable Integer id){
//        Integer delId = categoryMapper.delete(id);
//        if(delId == 0){
//            return ResponseEntity.notFound().build();
//        }
//
//        return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);
//    }
}
