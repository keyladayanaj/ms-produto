package br.fiap.com.br.ms.produto.dto;


import br.fiap.com.br.ms.produto.entities.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoriaDTO {

    private Long id;

    @NotBlank(message = "Campo nome não ser vazio, nulo ou em branco")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    private String nome;

    public CategoriaDTO(Categoria categoria){
        id = categoria.getId();
        nome = categoria.getNome();
    }

}