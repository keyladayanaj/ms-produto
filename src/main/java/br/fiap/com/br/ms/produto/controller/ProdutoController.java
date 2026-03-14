package br.fiap.com.br.ms.produto.controller;

import br.fiap.com.br.ms.produto.dto.ProdutoResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<ProdutoResponseDTO> getProduto(){

        ProdutoResponseDTO dto = ProdutoResponseDTO.creaMock();
        return ResponseEntity.ok(dto);
    }
}
