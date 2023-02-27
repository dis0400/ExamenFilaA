package AInterpreter;

public class Multiplicacion extends AbstractExpresion {

    public Multiplicacion(int digit){
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("*")){
            context.aparecioMultiplicacion = true;
            context.input= context.input.substring(digit);
        }
    }
    
}
