package br.fiap.com.br.ms.produto.controller;

import br.fiap.com.br.ms.produto.entities.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @GetMapping
    public ResponseEntity<Produto> getProduto(){
        Produto produto = new Produto(1L,"Smart Tv","Smart TV de 38 polegadas",2000.0);
        return ResponseEntity.ok(produto);
    }
}
