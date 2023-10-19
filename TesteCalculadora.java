public class TesteCalculadora {
    public static void main (String[] args){
        var calc = new Calculadora();
        System.out.println(calc.somar(2, 3));
        System.out.println(calc.somar(2.1f, 3.5f));
        System.out.println(calc.somar("5", "3"));
    }
}
