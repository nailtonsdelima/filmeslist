package com.nailton.filmeslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nailton.filmeslist.entities.Game;
import com.nailton.filmeslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	/* Para usar uma query nativa do SQL é necessário usar o nativeQuery=true abaixo */
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId);

}
