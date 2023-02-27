package ASingleton;

import java.util.ArrayList; 

public enum Peaje {
    peaje;

    ArrayList<Vehiculo> vehiculosRegistrados = new ArrayList<>();
    int peajeCobrado = 0;


    public void cobrarPeaje(Vehiculo vehiculo){
        switch (vehiculo.getMarca().toLowerCase()){
            case "toyota":
                peajeCobrado += 5;
                System.out.println("Al auto marca Toyota se le cobro 5");
                break;
            case "nissan":
                peajeCobrado += 8;
                System.out.println("Al auto marca Nissan se le cobro 8");
                break;
            case "tesla":
                peajeCobrado += 4;
                System.out.println("Al auto marca Tesla se le cobro 4");
                break;
            default:
                peajeCobrado += 3;
                System.out.println("Al auto marca Desconocida se le cobro 3");
                break;
        }


        vehiculosRegistrados.add(vehiculo);
    }

    public void verPeajeRecaudado(){
        System.out.println("Hasta el momento se recaudo " + peajeCobrado + " de " + vehiculosRegistrados.size() + " vehiculos");
    }

    public void verVehiculosQuePasaron(){
        System.out.println("Pasaron en total " + vehiculosRegistrados.size() + " vehiculos");
        for(int i = 0; i < vehiculosRegistrados.size(); i ++){
            System.out.println("Vehiculo " + (i+1));
            System.out.println("- Placa: " + vehiculosRegistrados.get(i).getPlaca());
            System.out.println("- Marca: " + vehiculosRegistrados.get(i).getMarca());
            System.out.println("- Color: " + vehiculosRegistrados.get(i).getColor());
        }
    }
}
