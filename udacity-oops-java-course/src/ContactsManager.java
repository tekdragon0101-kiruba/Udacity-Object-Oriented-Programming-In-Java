class ContactsManager {
    // Fields:
    private Contact[] myFriends;
    private int friendsCount;

    // Constructor:
    ContactsManager() {
        this.myFriends = new Contact[500];
        this.friendsCount = 0;
    }

    // Methods:
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equalsIgnoreCase(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
