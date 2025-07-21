package equipamentos.multifuncional;
import equipamentos.digitalizadora.Digitadora;
import equipamentos.impressora.Impressora;
import equipamentos.copiadora.Copiadora;


public class EquipamentoMultifuncional implements Copiadora, Digitadora, Impressora{
    public void copiar(){
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO  VIA EQUIPAMENTO MULTIFUNCIONAL");

    }
    public void imprimir(){
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");

    }

    
}
