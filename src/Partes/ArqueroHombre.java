package Partes;

public class ArqueroHombre implements Arquero {

    public String toString() {
        
        return "Arquero Hombre";
    }

    @Override
    public String tirarseIzquierda() {
        
        return"Tirarse Izquierda Arquero Hombre";
    }

    @Override
    public String saqueArco() {
        
        return "Saque de Arco Arquero Hombre";
    }

    @Override
    public String tirarseDerecha() {
        
        return "Tirarse a derecha Arquero Hombre";
    }
    
}
