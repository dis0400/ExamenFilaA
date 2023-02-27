package AAbstractFactory;

public class Cliente {
    public static void main(String[] args) {
        Artefacto television = FactoryArtef.make("television");
        television.setPrecio(1500);
        System.out.println(television.getPrecio());

        Artefacto radio = FactoryArtef.make("radio");
        radio.setPrecio(200);
        System.out.println(radio.getPrecio());

        Artefacto batidora = FactoryArtef.make("batidora");
        batidora.setPrecio(50);
        System.out.println(batidora.getPrecio());

        Artefacto refrigerador = FactoryArtef.make("refrigerador");
        refrigerador.setPrecio(100);
        System.out.println(refrigerador.getPrecio());

        Artefacto microondas = FactoryArtef.make("microondas");
        microondas.setPrecio(190);
        System.out.println(microondas.getPrecio());


    }
}
    

