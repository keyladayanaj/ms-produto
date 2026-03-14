package br.fiap.com.br.ms.produto.controller;

import br.fiap.com.br.ms.produto.entities.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @GetMapping
    public ResponseEntity<List<Produto>> getProduto(){

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1L,"Smart Tv","Smart TV de 38 polegadas",2000.0));
        produtos.add(new Produto(2L,"Notebook Dell","Notebook Dell i7 16GB RAM",5200.0));
        produtos.add(new Produto(3L,"Smartphone Samsung","Galaxy S23 256GB",4500.0));
        produtos.add(new Produto(4L,"Fone Bluetooth","Fone sem fio com cancelamento de ruído",350.0));
        produtos.add(new Produto(5L,"Mouse Gamer","Mouse RGB 7200 DPI",180.0));
        produtos.add(new Produto(6L,"Teclado Mecânico","Teclado mecânico switch blue",420.0));
        produtos.add(new Produto(7L,"Monitor LG","Monitor Full HD 24 polegadas",980.0));
        produtos.add(new Produto(8L,"Tablet Lenovo","Tablet 10 polegadas 128GB",1500.0));
        produtos.add(new Produto(9L,"Impressora HP","Impressora multifuncional Wi-Fi",750.0));
        produtos.add(new Produto(10L,"Caixa de Som JBL","Caixa de som portátil Bluetooth",600.0));

        return ResponseEntity.ok(produtos);
    }
}
