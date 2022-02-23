package address.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressEntryTest {


    @Test
    void setGetStreet() {
        AddressEntry ae = new AddressEntry();
        ae.setStreet("test");
        assertEquals("test", ae.getStreet());
    }

    @Test
    void setGetCity() {
        AddressEntry ae = new AddressEntry();
        ae.setCity("test");
        assertEquals("test", ae.getCity());
    }

    @Test
    void setGetState() {
        AddressEntry ae = new AddressEntry();
        ae.setState("test");
        assertEquals("test", ae.getState());
    }

    @Test
    void setGetZip() {
        AddressEntry ae = new AddressEntry();
        ae.setZip(999);
        assertEquals(999, ae.getZip());
    }

    @Test
    void setGetPhone() {
        AddressEntry ae = new AddressEntry();
        ae.setPhone("test");
        assertEquals("test", ae.getPhone());
    }
}

