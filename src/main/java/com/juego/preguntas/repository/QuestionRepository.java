package com.juego.preguntas.repository;

import com.juego.preguntas.model.Question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
