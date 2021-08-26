package control;

import java.util.ArrayList;
import java.util.Scanner;


public class ClaseMain {
    static ArrayList<ClasePadre> vehiculos = new ArrayList<ClasePadre>();
    static Scanner consola = new Scanner(System.in);
    
    
    public static void main(String[] args) {
       
        
        int opcion = 0;
       
        do {
            System.out.println("**** Menu Principal ****");
            System.out.println("01. Crear Objeto de Vehiculos:");
            System.out.println("02. Mostrar Datos de los Vehiculos:");
            System.out.println("03. Visualizar Información de Tanqueo:");
            System.out.println("04. Calculo Consumo Combustible:");
            System.out.println("05. Cambio de Aceite:");
            System.out.println("06. Salir, Total de Kilometrajes:");
            System.out.println("Escoge una Opción: ");
            opcion = consola.nextInt();
            
            switch(opcion){
                case 1:
                    Menu();
                    
                    break;
                case 2:
                    System.out.println(vehiculos.toString());
                    break;
                case 3:
                    
                    for (ClasePadre vehiculo: vehiculos) {
                        System.out.println(vehiculo.toString());
                        vehiculo.tanquear();
                        
                    }
//                    ClasePadre auto = new Clasehija1();
//                    auto.tanquear();
//                    
//                    ClasePadre cami = new Clasehija2();
//                    cami.tanquear();
//                    
//                    ClasePadre bus = new Clasehija3();
//                    bus.tanquear();
                    
                    break;
                case 4:
                    
                    for (ClasePadre vehiculo: vehiculos) {
                        System.out.println(vehiculo.toString());
                        vehiculo.consumir_combustible();
                        
                    }

                    
                    break;
                case 5:
                    
                    for (ClasePadre vehiculo: vehiculos) { 
                        System.out.println(vehiculo.toString());
                        vehiculo.Cambiar_aceite();
                    }                       
     
                    break;
                case 6:
                    int j=0;
                     
                    for (ClasePadre i: vehiculos) { 
                        j+=i.getKilometraje();
                    }     
                    System.out.println(j+ " Kilometros en total");
                    System.out.println("Salir del sistema");
                    break;
                default:
                    System.out.println("Digita la opcion correcta");
                
            }
            
        }while (opcion!=6); 
        
        
       
    }
    
    //Metodos Auxiliares
    public static void Menu(){
        int opc = 0;
        String placa;
        int kilometraje=0;
        String numSerieMotor;
        
        String marca;
        int modelo;
        double precio;
        
        int tonelaje = 0;
        int numEjes = 0;
        String tipo;
        
        int numPasajeros = 0;
        String tipoCombustible;
        String tipoCaja;
        
        do {
            System.out.println("Crear un Objeto: ");
            System.out.println("01. Automil");
            System.out.println("02. Camion");
            System.out.println("03. Bus");
            System.out.println("04. Salir");
            opc = consola.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Placa: ");
                    consola.nextLine();
                    placa = consola.nextLine(); 
                    System.out.println("Kilometraje: ");
                    kilometraje = consola.nextInt();
                    System.out.println("Numero de Serie Motor:");
                    consola.nextLine();
                    numSerieMotor = consola.nextLine();
                    System.out.println("Marca: ");
                    marca = consola.nextLine();
                    System.out.println("Modelo: ");
                    modelo = consola.nextInt();
                    System.out.println("Precio: ");
                    precio = consola.nextDouble();
                    Clasehija1 automovil = new Clasehija1(placa, kilometraje, numSerieMotor, marca, modelo, precio);
                    vehiculos.add(automovil);
                    break;
                case 2:
                    System.out.println("Placa: ");
                    consola.nextLine();
                    placa = consola.nextLine();                    
                    System.out.println("Kilometraje: ");
                    kilometraje = consola.nextInt();
                    System.out.println("Numero de Serie Motor:");
                    consola.nextLine();
                    numSerieMotor = consola.nextLine();                    
                    System.out.println("Tonelaje: ");
                    tonelaje = consola.nextInt();
                    System.out.println("Numero de Ejes");
                    numEjes = consola.nextInt();
                    System.out.println("Elige el Tipo--> Remolque, Semiremolque, Tractocamion");
                    consola.nextLine();
                    tipo = consola.nextLine();                    
                    Clasehija2 camiones = new Clasehija2(placa, kilometraje, numSerieMotor, tonelaje, numEjes, tipo);
                    vehiculos.add(camiones);
                    break;
                case 3:
                    System.out.println("Placa: ");
                    consola.nextLine();
                    placa = consola.nextLine();                    
                    System.out.println("Kilometraje: ");
                    kilometraje = consola.nextInt();
                    System.out.println("Numero de Serie Motor:");
                    consola.nextLine();
                    numSerieMotor = consola.nextLine();                   
                    System.out.println("Numero de pasajeros: ");
                    numPasajeros = consola.nextInt();
                    System.out.println("Tipo de Combustible--> Diesel, Corriente");
                    consola.nextLine();
                    tipoCombustible = consola.nextLine();                    
                    System.out.println("Tipo de Caja--> Manual o Automatica");
                    tipoCaja = consola.nextLine();
                    Clasehija3 Buses = new Clasehija3(placa, kilometraje, numSerieMotor, numPasajeros, tipoCombustible, tipoCaja);
                    vehiculos.add(Buses);
                    break;
                case 4:
                    System.out.println("Salir...");
                    break;
                
            }    
        }while (opc!=4);
    }
    
}
