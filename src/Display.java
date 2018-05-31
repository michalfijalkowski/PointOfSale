import java.util.ArrayList;

public class Display {

    public Display() {

    }
    // Metoda zwracajaca sume cen zeskanowanych produktow i wyswietlajaca ja na ekran
    public static double showBill(ArrayList<Integer> list) {
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += CodeScanner.getPrice(list.get(i));
        }
        System.out.println("Total: " + sum);
        return sum;
    }
    // Metoda wyswietlajaca na ekran nazwe i cene ostatnio zeskanowanego produktu
    public void showDetails(Integer code) {
        System.out.println(CodeScanner.getName(code) + "  " + CodeScanner.getPrice(code));
    }
    // Metoda wyswietlajaca komunikat o braku produktu w bazie danych
    public void showError() {
        System.out.println("Product not found!");
    }
    // Metoda wyswietlajaca komunikat o braku kodu kreskowego
    public void showInvalid() {
        System.out.println("Invalid bar-code!");
    }
}
