package ar.edu.utn.frba.dds.ejercicio_02;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Persistente {

    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

}
