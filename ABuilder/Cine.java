package ABuilder;

public class Cine {
    private Builder builder;

    public Paquete getPaquete() {
        return builder.getPaquete();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createPaquete();
        this.builder.buildPipocas();
        this.builder.buildRefresco();
        this.builder.buildChocolate();
        this.builder.buildTieneChocolate();
    }
}
