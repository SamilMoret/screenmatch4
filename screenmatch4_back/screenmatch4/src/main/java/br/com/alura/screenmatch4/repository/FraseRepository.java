package br.com.alura.screenmatch4.repository;

import br.com.alura.screenmatch4.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query(value = "SELECT * FROM frases ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Frase buscaFraseAleatoria();
}

