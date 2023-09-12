package Factorias;
import Partes.Arquero;
import Partes.Defensor;
import Partes.Atacante;

public abstract class EquipoFactory {
    
    public abstract Arquero crearArquero();
    public abstract Defensor crearDefensor();
    public abstract Atacante crearAtacante();
}
