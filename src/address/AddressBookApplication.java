package address;

import address.data.AddressBook;
import address.data.AddressEntry;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu class
 **/

class AddressBookApplication {

    static void initAddressBookExercise(AddressBook ab){

        AddressEntry newAddressOne = new AddressEntry(
                "Anna",
                "Smith",
                "Main St.",
                "Oakland",
                "California",
                94611,
                "(510) 746-1347",
                "annasmith@gmail.com");
        AddressEntry newAddressTwo = new AddressEntry(
                "Caty",
                "Green",
                "Sandy St.",
                "Oakland",
                "California",
                94611,
                "(510) 472-0526",
                "acatygreen@gmail.com");

        ab.add(newAddressOne);
        ab.add(newAddressTwo);

        ab.list();
    }

    public static void main(String args[]) {

        AddressBook ab = new AddressBook();
        initAddressBookExercise(ab);





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