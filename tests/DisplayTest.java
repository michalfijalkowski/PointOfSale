import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class DisplayTest {

    @Test
    void showBill() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(3);
        list.add(2);
        assertEquals(Display.showBill(list), 7.7, 0.001);
        }

    @Test
    void showBill_incorrect() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(10);
        list.add(4);
        assertNotEquals(Display.showBill(list), 15.80);
    }
}