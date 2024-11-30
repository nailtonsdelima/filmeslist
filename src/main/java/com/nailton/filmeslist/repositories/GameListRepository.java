package com.nailton.filmeslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nailton.filmeslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
