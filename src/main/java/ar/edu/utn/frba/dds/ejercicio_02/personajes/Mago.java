package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="mago")
public class Mago  extends Personaje{
  @Column(name="nivel_de_magia")
  private Integer nivelDeMagia;
  @Column(name="tiene_alas")
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {
 //TODO
  }


}
