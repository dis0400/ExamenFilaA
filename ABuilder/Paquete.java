package ABuilder;

public class Paquete {
    private String pipoca;
    private String refresco;
    private String chocolate;

    private boolean tieneChocolate;

    public boolean isTieneChocolate() {
        return tieneChocolate;
    }

    public Paquete setTieneChocolate(boolean tieneChocolate) {
        this.tieneChocolate = tieneChocolate;
        return this;
    }

    public String getPipoca() {
        return pipoca;
    }

    public Paquete setPipoca(String pipoca) {
        this.pipoca = pipoca;
        return this;
    }

    public String getRefresco() {
        return refresco;
    }

    public Paquete setRefresco(String refresco) {
        this.refresco = refresco;
        return this;
    }

    public String getChocolate() {
        return chocolate;
    }

    public Paquete setChocolate(String chocolate) {
        this.chocolate = chocolate;
        return this;
    }

    public void showInfo() {
        System.out.println("Pipocas: " + this.getPipoca());
        System.out.println("Refresco: " + this.getRefresco());
        if(this.isTieneChocolate()){
            System.out.println("Chocolate: " + this.getChocolate());
        }
    }
}
