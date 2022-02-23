package address.data;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AddressBook {

    TreeSet <AddressEntry> addressEntryList = new TreeSet ();

    /**
     * adds AddressEntry to list
     * @param newEntry
     */
    public void add(AddressEntry newEntry){
        addressEntryList.add(newEntry);
    }

    /**
     * removes entry based on Last Name
     * @param removeName object to remove
     */
    public void remove(AddressEntry removeName) {
        addressEntryList.remove(removeName);
    }

    /**
     * finds all entries with given last name
     * @param findName
     * @return returns the set matching last name
     */
    public List<AddressEntry> find(String findName) {
        List<AddressEntry> index = new ArrayList<>();

        for (AddressEntry i: addressEntryList) {
            if (i.getLastName().contains(findName))
            {
                index.add(i);
            }
        }

        return index;
    }

    /**
     * prints all entries
     */
    public void list(){
        for (AddressEntry i : addressEntryList) {
            System.out.println(i);
        }
    }

    /**
     * Gets a file from user, then stores all entries from it into the addressBook.
     * Throws and exception if no file exists
     * @param filename
     * @throws FileNotFoundException
     */
    public void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner inputScanner = new Scanner (file);

        while (inputScanner.hasNextLine()) {
            AddressEntry newAddress = new AddressEntry(
                    inputScanner.nextLine(),
                    inputScanner.nextLine(),
                    inputScanner.nextLine(),
                    inputScanner.nextLine(),
                    inputScanner.nextLine(),
                    Integer.valueOf(inputScanner.nextLine()),
                    inputScanner.nextLine(),
                    inputScanner.nextLine()
            );
            this.add(newAddress);
        }
    }

}
