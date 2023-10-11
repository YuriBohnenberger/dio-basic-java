public class Operadores2 {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";

        System.out.println(resultado);

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        /*
        String resultado = (a==b) ? "verdadeiro" : "falso";

        System.out.println(valor);
        */
    }
}
