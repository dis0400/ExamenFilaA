package AAbstractFactory;

public class FactoryArtef {
    public static Artefacto make(String artifactType){
        Artefacto artefacto;
        switch (artifactType.toLowerCase()){
            case "television":
                artefacto = new Television();
                break;
            case "radio":
                artefacto = new Radio();
                break;
            case "batidora":
                artefacto = new Batidor();
            case "refrigerador":
                artefacto = new Refri();
                break;
            case "microondas":
                artefacto = new Microondas();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return artefacto;
    }
}
