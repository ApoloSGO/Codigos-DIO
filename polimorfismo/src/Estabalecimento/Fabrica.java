package Estabalecimento;

import equipamentos.Multifuncional.EquipamentoMultifuncional;
import equipamentos.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultifuncional();
        impressora.imprimir();
    }
    
}
