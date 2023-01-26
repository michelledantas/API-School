package br.com.ada.school.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.NUMERIC)
    @Getter
    private Long id;

    @Getter
    @Setter
    @Column(name = "name")
    private String nome;

    @Getter
    @Setter
    @Column(name = "descricao")
    private String descricao;

    @Getter
    @Setter
    @Column(name = "duracao")
    private String duracao;

}
