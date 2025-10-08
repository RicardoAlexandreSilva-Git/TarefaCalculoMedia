public class Calculo {
    public static void main(String[] args){
        Valores valores = new Valores();
        double soma= valores.getValor1()+ valores.getValor2()+ valores.getValor3()+ valores.getValor4();
        System.out.println("Vamos calcular a media de 4 notas.");
        System.out.println("Nota 1: "+valores.getValor1());

        System.out.println("Nota 2: "+valores.getValor2());

        System.out.println("Nota 3: "+valores.getValor3());

        System.out.println("Nota 4: "+valores.getValor4());


        System.out.println("A média de notas é: "+soma/4);
    }
}
