package spacechallenge;

public interface SpaceShip {
    /*
     *   return true if probability amount exceed based
     *   on the chance of launch exploding otherwise false
     */
    boolean launch();

    /*
     *   return true if probability amount exceed based
     *   on the chance of landing exploding otherwise false
     */
    boolean land();

    /*
     *   return true,if spaceship carry limit
     *   not exceed when adding new item otherwise false;
     */
    boolean canCarry(Item object);

    /*
     * Update the current carried by the spaceship when each item adding.
     */
    void carry(Item object);

}
