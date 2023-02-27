package APrototype;

public class Cliente {
    public static void main(String[] args) {
        Televisor t1 = new Televisor();
        t1.setSo("android");
        t1.setVersionSistema("11.0");
        t1.setPulgadas(80);
        t1.setResolucion(50);
        t1.setPuertoHDMI(true);
        t1.setPuertosUSB(4);
        t1.setControlRemoto(true);
        t1.setBluetooth(true);
        t1.setSerialTelevisor("10 digitos");
        t1.showInfo();

        Televisor t2 = t1.clone();
        t2.setSerialTelevisor("12 digitos");
        t2.showInfo();

        Televisor t3 = t1.clone();
        t3.setSerialTelevisor("14 digitos");
        t3.showInfo();

        Televisor t4 = t1.clone();
        t4.setSerialTelevisor("9 digitos");
        t4.showInfo();

        Televisor t5 = t1.clone();
        t5.setSerialTelevisor("10 digitos");
        t5.showInfo();
    }
}
