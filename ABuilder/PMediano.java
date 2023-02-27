package ABuilder;

public class PMediano extends Builder {

    @Override
    public void buildPipocas() {
        paquete.setPipoca("grandes");
    }

    @Override
    public void buildRefresco() {
        paquete.setRefresco("2 vasos de refrescos");
    }

    @Override
    public void buildChocolate() {
        paquete.setChocolate("1 chocolate");
        buildTieneChocolate();
    }

    @Override
    public void buildTieneChocolate() {
        paquete.setTieneChocolate(true);
    }
}