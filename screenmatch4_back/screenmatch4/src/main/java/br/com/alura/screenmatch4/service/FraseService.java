package br.com.alura.screenmatch4.service;

import br.com.alura.screenmatch4.dto.FraseDTO;
import br.com.alura.screenmatch4.model.Frase;
import br.com.alura.screenmatch4.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
