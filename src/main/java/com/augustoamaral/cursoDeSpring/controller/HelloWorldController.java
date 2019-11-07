package com.augustoamaral.cursoDeSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.augustoamaral.cursoDeSpring.repository.PessoaRepository;

@RestController
public class HelloWorldController {

	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping(path = "/hello")
	public ResponseEntity<?> qualquerCoisa()
	{
		return ResponseEntity.ok(pessoaRepository.findAll());
	}
}
