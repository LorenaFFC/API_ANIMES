package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.service.AnimeService;
import academy.devdojo.springboot2.util.DateUtil;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("animes")
public class AnimeController {
    private DateUtil dateUtil;
    private AnimeService animeService;


// Construtor
    public AnimeController(DateUtil dateUtil, AnimeService animeService){
        this.dateUtil = dateUtil;
        this.animeService = animeService;
    }

    @GetMapping
    public ResponseEntity<List<Anime>> list(){
      return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK) ;
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<Anime> findById(@PathVariable long id){
        return new ResponseEntity<>(animeService.findById(id), HttpStatus.OK) ;
    }
    @GetMapping(path="/find")
    public ResponseEntity<List<Anime>> findByName(@RequestParam String name){
        return new ResponseEntity<>(animeService.findByName(name), HttpStatus.OK) ;
    }
    @PostMapping
    public ResponseEntity<Anime> save(@RequestBody @Valid Anime anime){
        return new ResponseEntity<>( animeService.save(anime), HttpStatus.CREATED);
    }
    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        animeService.deleteId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT) ;
    }
    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody Anime anime){
        animeService.replace(anime);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT) ;
    }
}
