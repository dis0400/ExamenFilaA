package AInterpreter;

public class Cliente {
    public static void main (String[]args){
        String msg="2 * 3 + 5 + 5 + 5";
        Interpreter parser = new Interpreter(msg);
        System.out.println("msg interpretado: "+parser.evaluateMsg());
    }
}
