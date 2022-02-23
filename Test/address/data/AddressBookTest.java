package address.data;


import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    static AddressBook ab = new AddressBook();
    AddressEntry ae = new AddressEntry("first", "last", "street", "city", "state", 0, "phone", "email");

    @Test
    void addTest() {
        ab.add(ae);
        assertTrue(ab.addressEntryList.contains(ae));
    }

    @Test
    void findTest() {
        List<AddressEntry> index = new ArrayList<>();
        index = ab.find(ae.getLastName());
        if (index.size() != 0)
        {
            assertTrue(ab.addressEntryList.contains(index.get(0)));
        } else {
            assertTrue(false);
        }

    }

    @Test
    void removeTest(){
        ab.remove(ae);
        assertEquals(0, ab.addressEntryList.size());
    }


}