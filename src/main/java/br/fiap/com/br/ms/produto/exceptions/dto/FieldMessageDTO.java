package br.fiap.com.br.ms.produto.exceptions.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FieldMessageDTO {

    private String fieldName;
    private String message;
}
