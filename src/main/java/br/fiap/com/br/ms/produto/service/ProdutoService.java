package br.fiap.com.br.ms.produto.service;

import br.fiap.com.br.ms.produto.dto.ProdutoDTO;
import br.fiap.com.br.ms.produto.entities.Produto;
import br.fiap.com.br.ms.produto.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.EntityFilterException;
import org.hibernate.action.internal.EntityActionVetoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Transactional(readOnly = true)
    public List<ProdutoDTO> finAllProdutos(){
        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream().map(ProdutoDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public  ProdutoDTO finProdutoById(Long id){

        Produto produto = produtoRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Recurso não encontrado. ID: "+ id)
        );

        return new ProdutoDTO(produto);
    }

    @Transactional
    public ProdutoDTO saveProduto(ProdutoDTO produtoDTO) {

        Produto produto = new Produto();
        //metodo auxiliar para converter DTO para Entidade Produto
        copyDtoToProduto(produtoDTO, produto);
        produto = produtoRepository.save(produto);
        return new ProdutoDTO(produto);
    }

    private void copyDtoToProduto(ProdutoDTO produtoDTO, Produto produto) {

        produto.setNome(produtoDTO.getNome());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setValor(produtoDTO.getValor());
    }

    @Transactional
    public ProdutoDTO updateProduto(Long id, ProdutoDTO produtoDTO) {

        try {
            Produto produto = produtoRepository.getReferenceById(id);
            copyDtoToProduto(produtoDTO, produto);
            produto = produtoRepository.save(produto);
            return new ProdutoDTO(produto);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Recurso não encontrado. ID: " + id);
        }
    }

    @Transactional
    public void deleteProdutoById(Long id) {

        if (!produtoRepository.existsById(id)) {
            throw new EntityNotFoundException("Recurso não encontrado. ID: " + id);
        }

        produtoRepository.deleteById(id);
    }



}
