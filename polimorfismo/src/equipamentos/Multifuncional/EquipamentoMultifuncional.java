package equipamentos.Multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("copiando 1");
    }
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando 1");

    }
    @Override
    public void imprimir() {
        System.out.println("imprimir 1");
        
    }
    
}


