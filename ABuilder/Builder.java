package ABuilder;

public abstract class Builder {
    protected Paquete paquete;

    public Paquete getPaquete() {
        return paquete;
    }

    public void createPaquete() {
        this.paquete = new Paquete();
    }

    public abstract void buildPipocas();
    public abstract void buildRefresco();
    public abstract void buildChocolate();
    public abstract void buildTieneChocolate();
}
