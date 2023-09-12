package Factorias;
import Partes.Arquero;
import Partes.Defensor;
import Partes.ArqueroMujer;
import Partes.Atacante;
import Partes.AtacanteMujer;
import Partes.DefensorMujer;

public class EquipoFemeninoFactory extends EquipoFactory {

    @Override
    public Arquero crearArquero() {
        
        return new ArqueroMujer();
    }

    @Override
    public Defensor crearDefensor() {
        
        return new DefensorMujer();
        
    }
    @Override
    public Atacante crearAtacante() {
        
        return new AtacanteMujer();
    }
}
