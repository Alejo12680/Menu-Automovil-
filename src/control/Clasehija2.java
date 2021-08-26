package control;


//Camiones
public class Clasehija2 extends ClasePadre{
    private int tonelaje;
    private int numEjes;
    private String tipo;

    public Clasehija2() {
    }

    public Clasehija2(String placa, int kilometraje, String numSerieMotor,int tonelaje, int numEjes, String tipo) {
        super(placa,kilometraje,numSerieMotor);
        this.tonelaje = tonelaje;
        this.numEjes = numEjes;
        this.tipo = tipo;
    }

    public int getTonelaje() {
        return this.tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    public int getNumEjes() {
        return this.numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("CAMIONES");
        sb.append(" *TONELAJE= ").append(tonelaje);
        sb.append(" *No.EJES= ").append(numEjes);
        sb.append(" *TIPO= ").append(tipo);
        sb.append('\n');
        return sb.toString();
    }
    
    public void tanquear(){
        System.out.println("*** TANQUEO ***");
        System.out.println("Tanquear en estaciones de servicio Mobil del Pais\n Presentar carnet de la empresa\n Aplicar descuentos.\n");
        
    }
    
    public void consumir_combustible(){
        System.out.println("*** COMBUSTIBLE ***");
        if (getTonelaje()<10) {
            float galon = getKilometraje()/30;
            System.out.println("Se consume un galon por cada 30km");
            System.out.println("Se consumen "+galon+ " galones por los kilometros que lleva "+ getKilometraje()+"\n");
            
        }
        else{
             float galon = getKilometraje()/20;
             System.out.println("Se consume un galon por cada 20km");
            System.out.println("Se consume "+galon+ " galones por los kilometros que lleva "+ getKilometraje()+"\n");
        }
    }
    
     public void Cambiar_aceite(){
         System.out.println("*** ACEITE ***");
         if (getKilometraje()>200000 && "tractocamion".equals(getTipo())) {
             System.out.println("Programar cambio de aceite\n");
             
         }
         else if (getKilometraje()>=250000 && "remolque".equals(getTipo()) || "semiremolque".equals(getTipo())) {
             System.out.println("Programar Cambio de aceite\n");
             
         }
         
         else{
             System.out.println("No es necesario Cambio de Aceite\n");
         }
     }
    
    
    
    
    
}
