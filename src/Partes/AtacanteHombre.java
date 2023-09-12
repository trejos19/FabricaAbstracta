package Partes;

public class AtacanteHombre implements Atacante {

    public String toString() {
        
        return "Atacante Hombre";
    }

    @Override
    public String patearArco() {
      return "Patea al arco Atacante Hombre";    
        
    }

    @Override
    public String gambetear() {
        
        return "Gambetea Atacante Hombre";
    }

    @Override
    public String cabezazoDefensivo() {
        
        return "Cabezazo defensivo de Atacante Hombre";
    }
    
}
