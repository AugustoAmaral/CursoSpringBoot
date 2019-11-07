package com.augustoamaral.cursoDeSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.augustoamaral.cursoDeSpring.model.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {

}
