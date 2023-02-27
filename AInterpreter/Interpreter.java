package AInterpreter;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends AbstractExpresion {
    private List<AbstractExpresion> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpreter){
                              
        context = new Context(msgToInterpreter.replace(" ",""));
        for ( String charOriginal :  msgToInterpreter.split(" ")) {
            switch (charOriginal){
                case "*":
                    grammar.add(new Multiplicacion(charOriginal.length()));
                    break;
                case "+":
                    grammar.add(new Suma(charOriginal.length()));
                    break;
                default:
                    grammar.add(new Num(charOriginal.length()));
                    break;


            }
        }
    }

    public int evaluateMsg(){
        for (AbstractExpresion expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }


  @Override
  public void interpreter(Context context) {

  }
    
}
