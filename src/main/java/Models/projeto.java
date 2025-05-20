package Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class projeto {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nome;
private String descrição;
private LocalDate dataInicio;
private LocalDate dataPrevistafim;

    public projeto(int id, String nome, String descrição, LocalDate dataInicio, LocalDate dataPrevistafim) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.dataInicio = dataInicio;
        this.dataPrevistafim = dataPrevistafim;
    }
}
