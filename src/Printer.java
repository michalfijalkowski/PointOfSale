import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Printer {
    public Printer() {

    }
    // Metoda towrzaca rachunek w pliku bill.txt
    public void makeRecipt(ArrayList<Integer> list) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream("bill.txt"));
        pw.println("RECEIPT");

        for (int i = 0; i < list.size(); i++) {
            pw.println(CodeScanner.getName(list.get(i)) + "  " + CodeScanner.getPrice(list.get(i)));
        }
        pw.println("TOTAL:  " + Display.showBill(list));
        pw.close();
    }
}

