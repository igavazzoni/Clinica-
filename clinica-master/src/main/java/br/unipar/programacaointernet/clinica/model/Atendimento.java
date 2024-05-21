package br.unipar.programacaointernet.clinica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String dataHora;
    private String anamnese;
    @ManyToOne
    private Medico medico;
    @ManyToOne
    private Paciente paciente;


}
