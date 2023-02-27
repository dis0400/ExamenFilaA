package ABuilder;

public class MegaPaquete extends Builder {

    @Override
    public void buildPipocas() {
        paquete.setPipoca("extragrandes");
    }

    @Override
    public void buildRefresco() {
        paquete.setRefresco("3 vasos de gaseosas extragrandes con recarga ilimitada");
    }

    @Override
    public void buildChocolate() {
        paquete.setChocolate("2 chocolates grandes");
    }

    @Override
    public void buildTieneChocolate() {
        paquete.setTieneChocolate(true);
    }
    
}
