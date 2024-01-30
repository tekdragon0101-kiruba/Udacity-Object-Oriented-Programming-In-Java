class Main {
    public static void main(String[] args) {
        // create object of ContactManager
        ContactsManager myContactManager = new ContactsManager();

        // create objects of Contacts
        Contact new_contact1 = new Contact();
        new_contact1.name = "Aravind";
        new_contact1.phoneNumber = "6543789622";
        Contact new_contact2 = new Contact();
        new_contact2.name = "Chandru";
        new_contact2.phoneNumber = "9543789322";
        Contact new_contact3 = new Contact();
        new_contact3.name = "Renuka";
        new_contact3.phoneNumber = "7654389633";

        // Add Contact to the myContactManager Object
        myContactManager.addContact(new_contact1);
        myContactManager.addContact(new_contact2);
        myContactManager.addContact(new_contact3);

        // Search the contact in instance or object
        Contact searchContact = myContactManager.searchContact("aravind");
        System.out.println(searchContact.name);
    }
}
