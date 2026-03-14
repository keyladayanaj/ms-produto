package br.fiap.com.br.ms.produto.dto;

public class ProdutoResponseDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Double valor;

    public ProdutoResponseDTO(Long id, String nome, String descricao, Double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public static ProdutoResponseDTO creaMock(){

        ProdutoResponseDTO responseDTO = new ProdutoResponseDTO(1L,"Smart Tv","Smart TV de 38 polegadas",2000.0);
        return responseDTO;
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
