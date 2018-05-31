import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    int c = 1;

    public static void main(String[] args)throws FileNotFoundException {
        int c = 1;
        CodeScanner s = new CodeScanner();
        while (c == 1) {


            System.out.println("Podaj barcode");
            Scanner in = new Scanner(System.in);
            int code = in.nextInt();
            s.newProduct(code);

        }
    }

}




