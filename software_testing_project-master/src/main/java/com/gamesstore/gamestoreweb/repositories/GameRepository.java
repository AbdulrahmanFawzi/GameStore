package com.gamesstore.gamestoreweb.repositories;

import com.gamesstore.gamestoreweb.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    // Custom query methods (if needed) can be defined here
}
