package com.juego.preguntas.service;

import java.util.List;
import java.util.Optional;

import com.juego.preguntas.model.Question;
import com.juego.preguntas.repository.QuestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	public List<Question> findAll() {
		return questionRepository.findAll();
	}

	public Optional<Question> findById(Long id) {
		return questionRepository.findById(id);
	}

	public Question save(Question question) {
		return questionRepository.save(question);
	}

	public Question update(Question question) {
		return questionRepository.save(question);
	}

	public void delete(Long id) {
		questionRepository.deleteById(id);
	}

}
