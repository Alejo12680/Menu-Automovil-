package control;

//Automovil
public class Clasehija1 extends ClasePadre{
    
    private String marca;
    private int modelo;
    private double precio;

    public Clasehija1() {
    }

    public Clasehija1(String placa, int kilometraje, String numSerieMotor,String marca, int modelo, double precio) {
        super(placa,kilometraje, numSerieMotor);
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        
    }
    
    

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return this.modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("AUTOMOVIL");
        sb.append(" *MARCA= ").append(marca);
        sb.append(" *MODELO= ").append(modelo);
        sb.append(" *PRECIO= ").append(precio);
        sb.append('\n');
        return sb.toString();
    }
    
    public void tanquear(){
        System.out.println("*** TANQUEO ***");
        System.out.println("Tanquear solo en Estacion de Servicio Primax CL.98 # 33-2 Ciudad \nGasolineria abierto 24 horas \nconvenio con la empresa, datos del vehiculo.\n");
        
    }
    
    public void consumir_combustible(){
        System.out.println("*** COMBUSTIBLE ***");
        if (getModelo()<2015) {
            System.out.println("El consumo de gasolina es mayor a 40% por la relacion del motor.\n");
            
        }
        else{
            System.out.println("El consumo se reduce al 20% por la relacion del motor.\n");
        }
    }
    
    public void Cambiar_aceite(){
        System.out.println("*** ACEITE ***");
        if (getKilometraje()>50000) {
            System.out.println("Es mayor a 50000km, requiere Cambio de Aceite.\n");
            
        }
        else{
            System.out.println("No requiere cambio de Aceite.\n");
        }
    }
    
    
    
}
