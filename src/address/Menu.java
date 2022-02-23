package address;
/** Menu class currently only has static methods to prompt to standard output information about a Contact like name,etc
 **/

class Menu {

    /**
     * Generates the basic Main Menu Prompt
     * @return
     */
    public String menuSelectionPrompt() {
        return
                "**************************\n" +
                "Please enter your menu selection \n" +
                "a) Loading From File\n" +
                "b) Addition \n" +
                "c) Removal \n" +
                "d) Find \n" +
                "e) Listing \n" +
                "f) Quit \n" +
                "*************************";
    }

    /**
     * Filename Entry Prompt
     * @return
     */
    public String fileEntryPrompt() {return "Enter in FileName:";}

    /**
     * Contact Removal Prompt
     * @return
     */
    public String contactRemovePrompt() {return "Enter in full or partial Last Name of the contact to remove:";}

    /**
     * Contacts found prompt
     * @return
     */
    public String foundContactsPrompt() {return "The following entry was found in the address book";}

    /**
     * Remove Contact confirm prompt
     * @return
     */
    public String removeConfirmationPrompt() {return "Hit 'y' to remove the entry or 'm' to return to main menu";}

    /**
     * Remove Contact confirm prompt used for more than one entry found
     * @return
     */
    public String removeMultiConfirmationPrompt() {return "Hit 'y' to remove the entry, 'n' to see next entry, or 'm' to return to main menu";}

    /**
     * Find entry prompt
     * @return
     */
    public String findEntryPrompt() {return "Enter in all or partial of the last name you wish to find";};

    /**
     * Generates FirstName Prompt
     * @return
     */
    public String prompt_FirstName() {return "First Name:";}

    /**
     * Generates LastName Prompt
     * @return
     */
    public String prompt_LastName() {
        return "Last Name:";
    }

    /**
     * Generates Street Prompt
     * @return
     */
    public String prompt_Street() {
        return "Street:";
    }

    /**
     * Generates City Prompt
     * @return
     */
    public String prompt_City() {
        return "City:";
    }

    /**
     * Generates State Prompt
     * @return
     */
    public String prompt_State() {
        return "State:";
    }

    /**
     * Generates Zip Prompt
     * @return
     */
    public String prompt_Zip() {
        return "Zip:";
    }

    /**
     * Generates Telephone Prompt
     * @return
     */
    public String prompt_Telephone() {return "Telephone:";}

    /**
     * Generates Email Prompt
     * @return
     */
    public String prompt_Email() {return "Email:";}

    /**
     * Prompt for when user inputs invalid input
     * @return
     */
    public String invalidEntryPrompt() {return "Invalid User Entry, Try Again";}

}