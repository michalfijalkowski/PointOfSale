import java.io.FileNotFoundException;
import java.util.ArrayList;


public class CodeScanner {

    private static Integer[] barCode = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static String[] productName = {"Chocolate", "Milk", "Juice", "Cola", "Nuts", "Apple", "Orange", "Butter", "Bread", "Chips" };
    private static Double[] productPrice = {1.2, 2.00, 3.80, 4.20, 5.0, 2.60, 1.90, 20.90, 3.50, 6.0};
    private ArrayList<Integer> count = new ArrayList<Integer>();

    private Printer printer = new Printer();
    private Display display = new Display();

    public CodeScanner() {

    }
    // Metoda zwracajaca nazwe produktu z bazy danych
    public static String getName(int code) {
        for (int i = 0; i < barCode.length; ++i) {
            if (code == barCode[i]) return productName[i];
        }
        return "";
    }
    // Metoda zwracajaca cene produktu z bazy danych
    public static Double getPrice(int code) {
        for (int i = 0; i < barCode.length; ++i) {
            if (code == barCode[i]) return productPrice[i];
        }
        return 0.0;
    }

    // Metoda sprawdzajaca czy produkt jest w bazie danych
    public boolean correctProduct(int code) {
        for (int i = 0; i < barCode.length; ++i) {
            if (code == barCode[i]) return true;
        }
        return false;
    }

    // Metoda obslugujaca zdarzenie zeskanowania produktu
    // 0 oznacza komunikat 'exit'
    // W razie braku kodu (null) lapany jest wyjatek
    public void newProduct(Integer code) throws FileNotFoundException {
        try {
            if (code == 0) {
                printer.makeRecipt(count);
                count.clear();
            } else {
                if (correctProduct(code)) {
                    display.showDetails(code);
                    count.add(code);
                } else {
                    display.showError();
                }
            }
        } catch (NullPointerException e) {
            display.showInvalid();
        }
    }
}
