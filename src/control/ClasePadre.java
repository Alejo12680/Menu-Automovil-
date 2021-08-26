package control;

//vehiculo
public class ClasePadre implements ClaseInterface{
    protected String placa;
    protected int kilometraje;
    protected String numSerieMotor;
    
    public ClasePadre(){
        
    }

    public ClasePadre(String placa, int kilometraje, String numSerieMotor) {
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.numSerieMotor = numSerieMotor;
    }
    
    

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKilometraje() {
        return this.kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getNumSerieMotor() {
        return this.numSerieMotor;
    }

    public void setNumSerieMotor(String numSerieMotor) {
        this.numSerieMotor = numSerieMotor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" *PLACA= ").append(placa);
        sb.append(" *KILOMETRAJE= ").append(kilometraje);
        sb.append(" *SERIE DE MOTOR= ").append(numSerieMotor);
        sb.append(' ');
        return sb.toString();
    }
    
    

    @Override
    public void tanquear() {
        System.out.println("");
    }

    @Override
    public void consumir_combustible() {
        System.out.println("");
    }

    @Override
    public void Cambiar_aceite() {
        System.out.println("");
    }
    
    
}

