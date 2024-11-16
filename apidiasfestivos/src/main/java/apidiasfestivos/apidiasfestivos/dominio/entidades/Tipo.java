package apidiasfestivos.apidiasfestivos.dominio.entidades;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Tipo")
@Entity
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_Tipo")
    @GenericGenerator(name = "secuencia_Tipo", strategy = "increment")
    @Column(name = "id")
    private int id;
    @Column(name="tipo")
    private String tipos;
}
