package Factorias;
import Partes.Defensor;
import Partes.DefensorHombre;
import Partes.Atacante;
import Partes.AtacanteHombre;
import Partes.Arquero;
import Partes.ArqueroHombre;

public class EquipoMasculinoFactory extends EquipoFactory {

    @Override
    public Arquero crearArquero() {
        // TODO Auto-generated method stub
        return new ArqueroHombre();
    }

    @Override
    public Defensor crearDefensor() {
        // TODO Auto-generated method stub
        return new DefensorHombre();
    }

    @Override
    public Atacante crearAtacante() {
        // TODO Auto-generated method stub
        return new AtacanteHombre();
    }
    
}
