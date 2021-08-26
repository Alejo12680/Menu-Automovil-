package control;


//Busetas
public class Clasehija3 extends ClasePadre{
    private int numPasajeros;
    private String tipoCombustible;
    private String tipoCaja;

    public Clasehija3() {
    }

    public Clasehija3(String placa, int kilometraje, String numSerieMotor,int numPasajeros, String tipoCombustible, String tipoCaja) {
        super(placa,kilometraje,numSerieMotor);
        this.numPasajeros = numPasajeros;
        this.tipoCombustible = tipoCombustible;
        this.tipoCaja = tipoCaja;
    }

    public int getNumPasajeros() {
        return this.numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getTipoCombustible() {
        return this.tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCaja() {
        return this.tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("BUSES");
        sb.append(" *No.PASAJEROS= ").append(numPasajeros);
        sb.append(" *TIPO DE COMBUSTIBLE= ").append(tipoCombustible);
        sb.append(" *TIPO DE CAJA= ").append(tipoCaja);
        sb.append('\n');
        return sb.toString();
    }
    
    public void tanquear(){
        System.out.println("*** TANQUEO ***");
        System.out.println("No esta permitido tanquear con pasajeros abordo.\n");
        if ("diesel".equals(getTipoCombustible())) {
            System.out.println("Tanquear en solo estaciones Terpel.\n");
            
        }
        else{
            System.out.println("Tienes gasolina Corriente.\n");
        }
               
    }
    
     public void consumir_combustible(){
         System.out.println("*** COMBUSTIBLE ***");
         if ("diesel".equals(getTipoCombustible())) {
             float galon = getKilometraje()/80;
             System.out.println("Se consume un galon por cada 80km");
             System.out.println("Se consumen "+galon+ " galones por los kilometros que lleva "+ getKilometraje()+"\n");
             
         }
         else{
             float galon = getKilometraje()/70;
             System.out.println("Se consume un galon por cada 70km");
             System.out.println("Se consumen "+galon+ " galones por los kilometros que lleva "+ getKilometraje()+"\n");
         }
         
     }
     
     public void Cambiar_aceite(){
          System.out.println("*** ACEITE ***");
         if (getKilometraje()>3000000 && "diesel".equals(getTipoCombustible())) {
             System.out.println("Programar Cambio de aceite con la empresa\n");
             
         }
         else if (getKilometraje()<4000000 && "corriente".equals(getTipoCombustible())) {
             System.out.println("Programar cambion de aceite con la empresa\n");
             
         }
         
         else{
             System.out.println("No necesita cambio de Aceite\n");
         }
     }
    
    
    
}
