package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.exception.ExceptionName;
import academy.devdojo.springboot2.repository.AnimeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AnimeService   {
    //Regra de Negocio
    private AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    public List<Anime> listAll(){
        return animeRepository.findAll();
    }

    public List<Anime> findByName(String name){
        return animeRepository.findByName(name);
    }

    public Anime findById(long id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new ExceptionName("Anime Não Encontrado"));
                        //ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime Não Encontrado"));
    }

    public Anime save(Anime anime) {
        return animeRepository.save(anime);
    }

    public void deleteId(long id) {
        animeRepository.deleteById(id); // chamou a funcao de procurar o id
    }

    public void replace(Anime anime) {
        deleteId(anime.getId());
        animeRepository.save(anime);


    }
}
