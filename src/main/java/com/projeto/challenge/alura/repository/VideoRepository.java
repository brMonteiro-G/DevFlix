package com.projeto.challenge.alura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projeto.challenge.alura.model.VideoModel;

@Repository
public interface VideoRepository extends JpaRepository<VideoModel,Long> {

}
