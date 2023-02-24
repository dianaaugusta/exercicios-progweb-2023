package school.sptech.projeto3api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {
    private List<Musica> musicas;

    public MusicaController() {
        this.musicas = new ArrayList<>();
        this.musicas.add(new Musica("Seppuku", 2015, false));
        this.musicas.add(new Musica("Runaway", 2016, false));
    }

    @GetMapping
    public List<Musica> listar(){
        return musicas;
    }

    @GetMapping("/buscar/{indice}")
    public Musica buscarPorIndice(@PathVariable int indice){
        if(indice >= 0 && indice < musicas.size()){
            return musicas.get(indice);
        }
        return null;
    }

    @PostMapping()
    public Musica cadastrar(
            @RequestBody Musica novaMusica
    ){
      //  Musica novaMusica = new Musica(nome, anoLancamento, nacional);
        musicas.add(novaMusica);
        return novaMusica;
    }

    @PutMapping("/{indice}")
    public Musica atualizar(
            @PathVariable int indice,
            @RequestBody Musica updatedMusica
    ){
        if(indice >= 0 && indice < musicas.size()){
            musicas.set(indice, updatedMusica);
            return updatedMusica;
        }
        return null;
    }

    @DeleteMapping("/buscar/{indice}")
    public Musica removerPorIndice(@PathVariable int indice){
        if(indice >= 0 && indice < musicas.size()){
            return musicas.remove(indice);
        }
        return null;
    }
}
