package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.Persistente;
import ar.edu.utn.frba.dds.ejercicio_02.converters.ElementoDefensorConverter;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personaje extends Persistente {

  @Getter
  @Convert(converter = ElementoDefensor.class)
  @ElementCollection
  @CollectionTable(name="elementos_defensores_personaje", joinColumns = @JoinColumn(name="personaje_id"))
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column(name="estamina")
  private Integer estamina;

  @Getter @Setter
  @Column(name="puntos_de_vida")
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}
