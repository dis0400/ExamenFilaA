package ASingleton;

public class Cliente {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("754GHB", "mercedes", "gris");
        Vehiculo vehiculo2 = new Vehiculo("456GHB", "chevrolet", "rojo");
        Vehiculo vehiculo3 = new Vehiculo("753GHB", "suzuki", "negro");
        Vehiculo vehiculo4 = new Vehiculo("029GHB", "quantum", "blanco");
        Vehiculo vehiculo5 = new Vehiculo("754HSD", "nissan", "verde");
        Vehiculo vehiculo6 = new Vehiculo("754NUD", "tesla", "azul");

        Peaje.peaje.cobrarPeaje(vehiculo1);
        Peaje.peaje.cobrarPeaje(vehiculo2);
        Peaje.peaje.cobrarPeaje(vehiculo3);
        Peaje.peaje.cobrarPeaje(vehiculo4);
        Peaje.peaje.cobrarPeaje(vehiculo5);
        Peaje.peaje.cobrarPeaje(vehiculo6);

        Peaje.peaje.verPeajeRecaudado();
        Peaje.peaje.verVehiculosQuePasaron();

    }
}
