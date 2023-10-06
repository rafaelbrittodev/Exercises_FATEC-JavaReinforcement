import java.io.IOException;
import java.util.Scanner;

public class Main_001 {
 
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        
        int A = ler.nextInt();
        int B = ler.nextInt();
        int X = A + B;
        System.out.println("X = " + X);
    }
}
