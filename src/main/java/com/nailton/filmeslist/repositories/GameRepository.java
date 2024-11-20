package com.nailton.filmeslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nailton.filmeslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
