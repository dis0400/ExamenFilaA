package AInterpreter;

public class Num extends AbstractExpresion {

    public Num(int digit){
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if(context.huboMultiplicacion){
            context.output = context.output + (Integer.parseInt(context.input.substring(0, digit)));
        }else{
            if(context.primeraexpression || !context.aparecioMultiplicacion){
                context.output = context.output + (Integer.parseInt(context.input.substring(0, digit)));
            }else {
                context.output = context.output * (Integer.parseInt(context.input.substring(0, digit)));
                context.huboMultiplicacion = true;
            }
        }
        context.input = context.input.substring(digit);
        context.primeraexpression = false;
    }
    
}
