import java.time.LocalDateTime;

public class Triangulo{
    public static void main(String[] args){
        System.out.println("La hora del inicio de el programa es : "+ LocalDateTime.now());
        if (args.length == 0) {
            System.out.println("Se requiere un argumento");
        }else {
        int filas = Integer.parseInt(args[0]);
        for (int i=filas; i>=1; i--)
        {
            for (int n=1; n<=i; n++)
            {
                System.out.print(n);
            }
            System.out.println();

        }
        }
        System.out.println("La hora del final de el programa es : "+ LocalDateTime.now());
    }
}
