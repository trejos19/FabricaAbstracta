package Partes;

public class AtacanteMujer implements Atacante {

    public String toString() {
        
        return "Atacante Mujer";
    }

    @Override
    public String patearArco() {
        
        return "Patea al arco Atacante Mujer";
    }

    @Override
    public String gambetear() {
        
        return "GambeteaAtacante Mujer";
    }

    @Override
    public String cabezazoDefensivo() {
        
        return "Cabezazo defensivo de Atacante Mujer";
    }
    
}
