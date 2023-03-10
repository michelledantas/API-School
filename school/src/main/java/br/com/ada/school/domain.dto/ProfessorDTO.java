package br.com.ada.school.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class ProfessorDTO {

    private int id;
    private String nome;
    private String titulo;
    private String sexo;
}
