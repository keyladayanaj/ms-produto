package br.fiap.com.br.ms.produto.repository;

import br.fiap.com.br.ms.produto.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
