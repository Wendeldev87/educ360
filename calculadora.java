import java.util.Scanner;

    public class Calculadora {
        
        public static void main(String[] args) {
          float numA, numB, mostrar;
          Scanner ler = new Scanner(System.in);
            System.out.println("INFORMEO PRIMEIRO NÚMERO: ");
            numA =ler.nextDouble();
            System.out.println("INFORME O SEGUNDO NÚMERO: ");
            numB = ler.nextDouble();
            Operacoes calcula = newOperacoes();
            //mostrar = calcula.soma(numA, numB);
            System.out.println("A SOMA DEU: "+calcula.soma(numA, numB));
            
          }
    }