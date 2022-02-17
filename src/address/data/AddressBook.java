package address.data;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

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


    public void init(String filename) {
        File input_file = new File(filename);
        Scanner inputScanner = new Scanner (input_file);

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
