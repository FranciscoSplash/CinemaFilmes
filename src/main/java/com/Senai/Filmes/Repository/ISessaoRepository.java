package com.Senai.Filmes.Repository;

import com.Senai.Filmes.Model.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ISessaoRepository extends JpaRepository<Sessao, UUID> {


    @Query("SELECT ra.assento.id FROM ReservaAssento ra " + " WHERe iniio.id = :sessaoId And ra.reserva.status =:status")
    List<Sessao> fingdByDate(@Param("inicioDia"));



    List <Sessao> findBFilmefindBY();
}
