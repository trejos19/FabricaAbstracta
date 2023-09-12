import Factorias.EquipoFactory;
import Factorias.EquipoFemeninoFactory;
import Factorias.EquipoMasculinoFactory;
import Partes.Defensor;
import Partes.Arquero;
import Partes.Atacante;

public class App {
    public static void main(String[] args) throws Exception {
       crearEquipo(new EquipoMasculinoFactory());
       crearEquipo(new EquipoFemeninoFactory());
    }
    public static void crearEquipo (EquipoFactory factory){
        Arquero arquero = factory.crearArquero();
        Defensor defensor = factory.crearDefensor();
        Atacante atacante = factory.crearAtacante();

        System.out.println("--------------Un Equipo Fue Creado-----------------");
        System.out.println(arquero.saqueArco());
        System.out.println(defensor.Barrida());
        System.out.println(atacante.cabezazoDefensivo());
        System.out.println("---------------------------------------------------");

    }
}
