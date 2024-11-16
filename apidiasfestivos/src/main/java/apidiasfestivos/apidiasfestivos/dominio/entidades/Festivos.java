package apidiasfestivos.apidiasfestivos.dominio.entidades;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "Festivo")
@Entity
public class Festivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "secuencia_Festivos", strategy = "increment")

    @Column(name = "Id")
    private int id;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Dia", nullable = false)
    private int dia;

    @Column(name = "Mes", nullable = false)
    private int mes;

    @Column(name = "DiasPascua", nullable = false)
    private int diasPascua;

    @ManyToOne
    @JoinColumn(name = "IdTipo", nullable = false)
    private Tipo tipo;
}