package estabelecimento;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;


public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();

        impressora.imprimir();

        
    }
    
}
