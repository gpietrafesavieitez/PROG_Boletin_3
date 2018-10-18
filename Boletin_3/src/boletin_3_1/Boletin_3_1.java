package boletin_3_1;

public class Boletin_3_1 {

    public static void main(String[] args) {
       
        Consumo obxConsumo1 = new Consumo();
        obxConsumo1.setLitros(50);
        obxConsumo1.setPGas(1.57f);
        
        Consumo obxConsumo2 = new Consumo(74, 3.42f, 87.5f, 3.66f);
        System.out.println("O consumo medio é de: " + obxConsumo2.consumoMedio() + " litros.");
        obxConsumo2.setLitros(3);
        System.out.println("A velocidade media é de: " + obxConsumo2.getVMed() + " km/h");
    }
    
}