package dev.dfmnzess.ofertas_bot.oferta;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ofertas")
public class OfertaController {

    private final OfertaRepository repository;

    public OfertaController(OfertaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Oferta> listar() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Oferta criar(@RequestBody Oferta oferta) {
        return repository.save(oferta);
    }
}