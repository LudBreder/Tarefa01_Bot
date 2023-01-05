
import java.time.LocalDate;
import java.util.Scanner;

public class chatbot {
    private String mensagem;

    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        System.out.println("Ola meu nome é Marciano. Vamos conversar?");
        String name = scanner.nextLine();
        Nomeusuario();
        adivinharIdade();
        contar();
        somar();
        subtrair();
        multiplicar();
        dividir();
      //  prova();
       finalizar();
        
        
    }

   static void Nomeusuario() {
        System.out.println("\nQual o seu nome?");
        String name = scanner.nextLine();
        System.out.println("\nOlá, " + name + " Está preparado?!");
        }

    
    static void adivinharIdade() {
        System.out.println("Vou adivinhar sua idade");
        System.out.println("Qual é o resto se dividir sua idade por 3");
        int rem3 = scanner.nextInt();
        System.out.println("Qual é o resto se dividir sua idade 5");
        int rem5 = scanner.nextInt();
        System.out.println("Qual é o resto se dividir sua idade 7");
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Sua idade é " + age);
    }

    static void contar() {
        System.out.println("\nAgora vou mostrar que posso contar até o número que você quiser.");
        System.out.println("Até que número você quer que eu conte?");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }
    static void somar() {
        int a, b, c = 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Agora vou fazer operações matemáticas ");
      System.out.println( "Digite dois números: ");
      a = s.nextInt();
      b = s.nextInt();
      c = a + b;
      System.out.println( "A soma de A e B é: " + c );
        }
    
    static void subtrair() {
        int a, b, c = 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Digite dois números: ");
      a = s.nextInt();
      b = s.nextInt();
      c = a - b;
      System.out.println( "O resultado da subtração de A e B é: " + c );
        }
    
     static void multiplicar() {
        int a, b, c = 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Digite dois números: ");
      a = s.nextInt();
      b = s.nextInt();
      c = a * b;
      System.out.println( "O resultado da multiplicação é: " + c );
        }
     
      static void dividir() {
        int a, b, c = 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Digite dois números: ");
      a = s.nextInt();
      b = s.nextInt();
      c = a/b;
      System.out.println( "O resultado da divisão é: " + c );
        }

   static void finalizar() {
        System.out.println("\nFoi muito bom conversar com você!");
    }
}
