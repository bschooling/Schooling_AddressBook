package address;

import address.data.AddressBook;
import address.data.AddressEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu class
 **/

class AddressBookApplication {
    static Menu mainMenu = new Menu();
    static Scanner userInput = new Scanner(System.in);

    public static void main(String args[]) {
        AddressBook ab = new AddressBook();
        boolean quit = false;

        while(!quit)
        {
            System.out.println(mainMenu.menuSelectionPrompt());
            String input = userInput.nextLine();
            switch(input){
                case "a":
                    loadFromFile(ab);
                    break;
                case "b":
                    addEntry(ab);
                    break;
                case "c":
                    removeEntry(ab);
                    break;
                case "d":
                    findEntry(ab);
                    break;
                case "e":
                    ab.list();
                    break;
                case "f":
                    quit = true;
                    break;
                default:
                    System.out.println(mainMenu.invalidEntryPrompt());
                    break;
            }
        }
    }

    /**
     * Asks user for file, and stores data from it
     * throws error if no file could be found and prompts the user
     * @param ab
     */
    public static void loadFromFile(AddressBook ab){
        System.out.println(mainMenu.fileEntryPrompt());
        String filename = userInput.nextLine();
        //fixes path to be read.  Assumes users file is in the src directory
        filename = "src/" + filename;

        try {
            //throws an error if the filename cannot be used to open a file
            ab.readFile(filename);
        } catch (Exception ex) {
            //error prompt
            System.out.println("Failed to Read File");
        }
    }

    public static void addEntry(AddressBook ab) {
        //first name entry
        System.out.println(mainMenu.prompt_FirstName());
        String firstName = userInput.nextLine();

        //last name entry
        System.out.println(mainMenu.prompt_LastName());
        String lastName = userInput.nextLine();

        //Street Entry
        System.out.println(mainMenu.prompt_Street());
        String street = userInput.nextLine();

        //City Entry
        System.out.println(mainMenu.prompt_City());
        String city = userInput.nextLine();

        //State entry
        System.out.println(mainMenu.prompt_State());
        String state = userInput.nextLine();

        //Zip entry
        boolean invalidInput = true;
        int zip = 0;
        while (invalidInput){
            System.out.println(mainMenu.prompt_Zip());
            try{
                // Will throw error if there are values other than integers in input
                zip = Integer.parseInt(userInput.nextLine());
                invalidInput = false;
            } catch(NumberFormatException e) {
                System.out.println("INVALID ZIP: Please insert all numbers");
            }
        }


        //Email entry
        System.out.println(mainMenu.prompt_Email());
        String email = userInput.nextLine();

        //Telephone entry
        System.out.println(mainMenu.prompt_Telephone());
        String phone = userInput.nextLine();

        //creates new entry using user inputs
        AddressEntry ae = new AddressEntry(firstName, lastName, street, city, state, zip, phone, email);
        //adds entry to addressBook
        ab.add(ae);
    }

    public static void removeEntry(AddressBook ab) {
        System.out.println(mainMenu.contactRemovePrompt());
        String lastNameRemove = userInput.nextLine();
        List<AddressEntry> findList = ab.find(lastNameRemove);
        if (findList.size() == 0){
            //No Entry with given last name
            System.out.println("Last Name not found, try again? (y/n)");
            String yn = userInput.nextLine();
            if (yn.equals("y")){
                //calls function again if you want to try again
                removeEntry(ab);
            }else if(yn.equals("n")){
                //leaves to main menu if done
                return;
            }else{
                // If not y or n an error is thrown
                System.out.println(mainMenu.invalidEntryPrompt());
            }
        }
        for (AddressEntry i: findList) {
            System.out.println(i);

            if (findList.size() > 1) {
                System.out.println(mainMenu.removeMultiConfirmationPrompt());
            } else{
                System.out.println(mainMenu.removeConfirmationPrompt());
            }
            switch (userInput.nextLine()){
                case "y":
                    ab.remove(i);
                    break;
                case "n":
                    break;
                case "m":
                    return;
                default:
                    System.out.println(mainMenu.invalidEntryPrompt());
                    break;
            }

        }

    }

    public static void findEntry(AddressBook ab) {
        System.out.println(mainMenu.findEntryPrompt());
        String lastNameFind = userInput.nextLine();
        List<AddressEntry> findList = ab.find(lastNameFind);
        if (findList.size() == 0){
            System.out.println("No Entries found");
        } else {
            if (findList.size() == 1){
                System.out.println("The following entry was found in the address book for the last name containing: " + lastNameFind);
            }else {
                System.out.println("The following " + findList.size() + " entries were found in the address book for the last name containing " + lastNameFind);
            }
            for (AddressEntry i: findList){
                System.out.println(i);
            }
        }

    }
}