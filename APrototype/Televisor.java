package APrototype;

public class Televisor implements Itelevisor{
    private String so;
    private String versionSistema;
    private int pulgadas;
    private int resolucion;
    private boolean puertoHDMI;
    private int puertosUSB;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String serialTelevisor;

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getVersionSistema() {
        return versionSistema;
    }

    public void setVersionSistema(String versionSistema) {
        this.versionSistema = versionSistema;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerialTelevisor() {
        return serialTelevisor;
    }

    public void setSerialTelevisor(String serialTelevisor) {
        this.serialTelevisor = serialTelevisor;
    }

    public void showInfo(){
        System.out.println("SO: " + this.getSo());
        System.out.println("Version Sistema: " + this.getVersionSistema());
        System.out.println("Pulgadas: " + this.getPulgadas());
        System.out.println("Resolucion: " + this.getResolucion());
        System.out.println("Puerto HDMI: " + this.isPuertoHDMI());
        System.out.println("Puertos USB: " + this.getPuertosUSB());
        System.out.println("Control Remoto: " + this.isControlRemoto());
        System.out.println("Bluetooth: " + this.isBluetooth());
        System.out.println("Serial Televisor: " + this.getSerialTelevisor());
    }

    @Override
    public Televisor clone() {
        Televisor televisorPrototypeClone = new Televisor();
        televisorPrototypeClone.setSo(this.getSo());
        televisorPrototypeClone.setVersionSistema(this.getVersionSistema());
        televisorPrototypeClone.setPulgadas(this.getPulgadas());
        televisorPrototypeClone.setResolucion(this.getResolucion());
        televisorPrototypeClone.setPuertoHDMI(this.isPuertoHDMI());
        televisorPrototypeClone.setPuertosUSB(this.getPuertosUSB());
        televisorPrototypeClone.setControlRemoto(this.isControlRemoto());
        televisorPrototypeClone.setBluetooth(this.isBluetooth());
        televisorPrototypeClone.setSerialTelevisor(this.getSerialTelevisor());
        return televisorPrototypeClone;
    }
}
