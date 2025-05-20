package Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tarefa")

public class Tarefas {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

 private String nome;
 private String descrição;
 private String prioridade;

    public Tarefas(int id, String nome, String descrição, String prioridade, LocalDate dataVencimento, String status, LocalDate dataConclusao) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.prioridade = prioridade;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.dataConclusao = dataConclusao;
    }

    private LocalDate dataVencimento;
 private String status;
 private LocalDate dataConclusao;

 public Tarefas() {};

 @ManyToOne
 @JoinColumn(name = "id_projeto")
 private projeto projeto;

 @ManyToOne
 @JoinColumn(name = "id_responsavel")
 private Usuario responsavel;


}

