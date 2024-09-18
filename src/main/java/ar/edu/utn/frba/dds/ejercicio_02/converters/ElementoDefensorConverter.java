package ar.edu.utn.frba.dds.ejercicio_02.converters;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Espada;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ElementoDefensorConverter implements AttributeConverter<ElementoDefensor, String> {
    @Override
    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor) {
        if (elementoDefensor instanceof Arco) return "ARCO";
        else if (elementoDefensor instanceof Espada) return "ESPADA";
        else return null;
    }

    @Override
    public ElementoDefensor convertToEntityAttribute(String s) {
        if ("ARCO".equals(s)) return new Arco();
        else if ("ESPADA".equals(s)) return new Espada();
        else return null;
    }
}
