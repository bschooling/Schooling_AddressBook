package address.data;
import java.util.ArrayList;

public class AddressBook {

    ArrayList< AddressEntry > addressEntryList = new ArrayList < AddressEntry > ();

    /**
     * adds AddressEntry to list
     * @param newEntry
     */
    public void add(AddressEntry newEntry){
        addressEntryList.add(newEntry);
    }

    /**
     * prints all entries
     */
    public void list(){
        for (AddressEntry i : addressEntryList) {
            System.out.println(i);
        }
    }

}
