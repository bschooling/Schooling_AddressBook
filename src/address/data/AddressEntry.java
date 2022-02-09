package address.data;

public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    /**
     * AddressEntry constructor
     */
    public AddressEntry() {
        this.firstName = "";
        this.lastName = "";
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = 0;
        this.phone = "";
        this.email = "";
    }

    /**
     * AddressEntry constructor with arguments passed in
     * @param firstName new first name
     * @param lastName new last name
     * @param street new street
     * @param city new city
     * @param state new state
     * @param zip new zip
     * @param phone new phone
     * @param email new email
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * toString function
     * @return object as string
     */
    public String toString() {

        return
                 "First Name: " + this.getFirstName() + '\n'
                + "Last Name: " + this.getLastName() + '\n'
                + "Street: " + this.getStreet() + '\n'
                + "City: " + this.getCity() + '\n'
                + "State: " + this.getState() + '\n'
                + "Zip: " + this.getZip() + '\n'
                + "Phone: " + this.getPhone() + '\n'
                + "Email: " + this.getEmail() + '\n';
    }

    /**
     * FirstName setter
     * @param
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * LastName setter
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Street setter
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * City setter
     * @param city
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * State setter
     * @param state
     */
    public void setState(String state){
        this.state = state;
    }

    /**
     * zip setter
     * @param zip
     */
    public void setZip(int zip){
        this.zip = zip;
    }

    /**
     * Phone setter
     * @param phone
     */
    public void setPhone(String phone){
        this.phone = phone;
    }

    /**
     * Email setter
     * @param email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * First name getter
     * @return firstName
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * LastName getter
     * @return lastName
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * Street getter
     * @return street
     */
    public String getStreet(){
        return this.street;
    }

    /**
     * City getter
     * @return city
     */
    public String getCity(){
        return this.city;
    }

    /**
     * State getter
     * @return state
     */
    public String getState(){
        return this.state;
    }

    /**
     * Zip getter
     * @return zip
     */
    public int getZip(){
        return this.zip;
    }

    /**
     * Phone getter
     * @return phone
     */
    public String getPhone(){
        return this.phone;
    }

    /**
     * Email getter
     * @return email
     */
    public String getEmail(){
        return this.email;
    }
}
