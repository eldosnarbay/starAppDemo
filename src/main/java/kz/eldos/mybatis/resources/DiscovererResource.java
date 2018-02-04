package kz.eldos.mybatis.resources;

import kz.eldos.mybatis.mapper.DiscovererMapper;
import kz.eldos.mybatis.model.Discoverer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discoverers")
public class DiscovererResource {
    @Autowired
    private DiscovererMapper discovererMapper;

    @GetMapping("")
    public List<Discoverer> getAll(){
        return discovererMapper.getAll();
    }

    @PostMapping("/insert")
    public ResponseEntity insert(@RequestBody Discoverer discoverer){
        if(discoverer == null){
            return ResponseEntity.noContent().build();
        }

        discovererMapper.insert(discoverer);
        System.err.println(discoverer.getId());
        return new ResponseEntity<>("Successfully inserted", HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity update(@PathVariable Integer id, @RequestBody Discoverer discoverer){
        if(id == null){
            return ResponseEntity.notFound().build();
        }

        if(discoverer == null){
            return ResponseEntity.noContent().build();
        }

        if(discoverer.getId() == null){
            discoverer.setId(id);
        }
        discovererMapper.update(discoverer);
        return new ResponseEntity<>("Succesfully update", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        Integer delId = discovererMapper.delete(id);
        if(delId == 0){
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>("Succesfully deleted", HttpStatus.OK);
    }
}