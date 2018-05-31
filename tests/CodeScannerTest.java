import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CodeScannerTest {

    CodeScanner test = new CodeScanner();
    @Test
    void getName_correct() {
        assertEquals(test.getName(3), "Juice");
    }

    @Test
    void getName_incorrect() {
        assertNotEquals(test.getName(5), "Juice");
    }

    @Test
    void getPrice() {
        double price= test.getPrice(5);
        assertEquals(price, 5.0);
    }

    @Test
    void getPrice_incorrect() {
        double price= test.getPrice(3);
        assertNotEquals(price, 5.0);
    }

    @Test
    void correctProduct() {
        assertTrue(test.correctProduct(3));
    }

    @Test
    void correctProduct_incorrect() {
        assertFalse(test.correctProduct(12));
    }
}