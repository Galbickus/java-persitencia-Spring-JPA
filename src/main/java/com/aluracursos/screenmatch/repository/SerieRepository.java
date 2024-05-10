package com.aluracursos.screenmatch.repository;

import com.aluracursos.screenmatch.model.Categoria;
import com.aluracursos.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie,Long> {
    Optional<Serie> findByTituloContainsIgnoreCase(String nombreSerie);

    List<Serie> findTop5ByOrderByEvaluacionDesc();

    List<Serie> findByGenero(Categoria categoria);

    //List<Serie> findByTotalTemporadasLessThanEqualAndEvaluacionGreaterThanEqual(int totalTemporadas, Double evaluacion);
 /*   @Query(value = "SELECT * FROM series WHERE series.total_temporadas <=6 \n" +
            "AND series.evaluacion>=7.5", nativeQuery = true)*/

    @Query("SELECT s FROM Serie s WHERE s.totalTemporadas <= :totalTemporadas \n" +
            "AND s.evaluacion >= :evaluacion")
    List<Serie> seriesPorTemporadaYEvaluacion(int totalTemporadas, Double evaluacion);
    @Query("SELECT e FROM Series s JOIN s.episodios WHERE e.titulo ILIKE %:nombreEpisodio%")
    List<Serie> episodiosPorNombre(String nombreEpisodio);
}
