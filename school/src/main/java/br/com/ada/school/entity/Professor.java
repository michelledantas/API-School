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
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.NUMERIC)
    @Getter
    private Long id;

    @Getter
    @Setter
    @Column(name = "nome")
    private String nome;

    @Getter
    @Setter
    @Column(name = "titulo")
    private String titulo;

    @Getter
    @Setter
    @Column(name = "sexo")
    private String sexo;

}
