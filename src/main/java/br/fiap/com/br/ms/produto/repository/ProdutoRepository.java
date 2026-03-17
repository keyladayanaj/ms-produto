package br.fiap.com.br.ms.produto.repository;

import br.fiap.com.br.ms.produto.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
