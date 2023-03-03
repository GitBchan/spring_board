package org.zerock.b02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zerock.b02.domain.Board;
import org.zerock.b02.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {
    @Query(value = "select now() from board where 1=1 limit 1", nativeQuery = true)
    String getTime();
}
