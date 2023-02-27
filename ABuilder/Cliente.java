package ABuilder;

public class Cliente {
    public static void main(String[] args) {
        Cine cine = new Cine();
        MegaPaquete megaPaqueteBuilder = new MegaPaquete();
        PMediano paqueteMedianoBuilder = new PMediano();
        Pnormal paqueteNormalBuilder = new Pnormal();


        cine.setBuilder(megaPaqueteBuilder);
        cine.buildProduct();
        Paquete megaPaquete = cine.getPaquete();
        megaPaquete.showInfo();

        cine.setBuilder(paqueteMedianoBuilder);
        cine.buildProduct();
        Paquete paqueteMediano = cine.getPaquete();
        paqueteMediano.showInfo();

        cine.setBuilder(paqueteNormalBuilder);
        cine.buildProduct();
        Paquete paqueteNormal = cine.getPaquete();
        paqueteNormal.showInfo();


        Paquete paquetePersonalizado =
                new Paquete().setPipoca("extragrande")
                        .setRefresco("3 refrescos en vaso")
                        .setTieneChocolate(true)
                        .setChocolate("3 chocolates extragrandes");
        paquetePersonalizado.showInfo();
    }
}
