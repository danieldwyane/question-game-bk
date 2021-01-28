package com.juego.preguntas.controller;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.juego.preguntas.model.Question;
import com.juego.preguntas.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/question")
@CrossOrigin("*")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@GetMapping()
	public List<Question> findAll() {
		return questionService.findAll();
	}

	@GetMapping("{id}")
	public Optional<Question> findById(@PathVariable("id") Long id) {
		return questionService.findById(id);
	}

	@PostMapping()
	public Question save(@RequestBody Question question) {
		return questionService.save(question);
	}

	@PutMapping()
	public Question update(@RequestBody Question question) {
		return questionService.update(question);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Long id) {
		questionService.delete(id);
	}

}
