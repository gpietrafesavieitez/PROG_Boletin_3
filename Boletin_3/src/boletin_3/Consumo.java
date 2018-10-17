package boletin_3;

public class Consumo {
    
    //Atributos
    private float km, litros, vMed, pGas;
    
    //Constructores
        //Sin parámetros
        public Consumo(){
            km = 0;
            litros = 0;
            vMed = 0;
            pGas= 0;
        }
        
        //Con parámetros
        public Consumo(float km, float litros, float vMed, float pGas){
            this.km = km;
            this.litros = litros;
            this.vMed = vMed;
            this.pGas = pGas;
        }
    
    //Métodos
        //Getters
        public float getTempo(){
            return km / vMed;
        }

        public float consumoMedio(){
            return km / 100;
        }

        public float consumoEuros(){
            return (km * pGas) / 100;
        }

        //Setters
        public void setKms(float km){
            this.km = km;
        }

        public void setLitros(float litros){
            this.litros = litros;
        }

        public void setMed(float vMed){
            this.vMed = vMed;
        }

        public void setPGas(float pGas){
            this.pGas = pGas;
        }
        
}
