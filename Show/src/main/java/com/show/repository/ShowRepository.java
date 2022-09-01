package com.show.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.show.entity.ShowTb;

@Repository
public interface ShowRepository extends JpaRepository<ShowTb,Long>{

	// for testing purpose 
	@Query("SELECT CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE END FROM ShowTb s WHERE s.showId=?1")
	Boolean isShowExists(Long id);
}
