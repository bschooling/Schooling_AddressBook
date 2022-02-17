package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.io.*;
import java.util.Scanner;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu class
 **/

class AddressBookApplication {

    public static void main(String args[]) {

        AddressBook ab = new AddressBook();
        try {
            ab.init("src/address/AddressInputDataFile.txt");
        } catch (Exception ex) {
            System.out.println("Failed to Read File");
        }
        ab.list();





        /*
        //create instance of menu
        Menu myMenu = new Menu();

        //Display to standard output all of the Menu prompts
        System.out.println(myMenu.prompt_FirstName());

        System.out.println(myMenu.prompt_LastName());

        System.out.println(myMenu.prompt_Street());

        System.out.println(myMenu.prompt_City());

        System.out.println(myMenu.prompt_State());

        System.out.println(myMenu.prompt_Zip());

        System.out.println(myMenu.prompt_Telephone());

        System.out.println(myMenu.prompt_Email());
         */

    }

}