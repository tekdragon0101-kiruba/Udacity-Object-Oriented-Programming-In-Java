package spacechallenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    /*
     * take path to load items to arraylist
     */
    public ArrayList<Item> loadItems(String pathname) {
        ArrayList<Item> itemsAdded = new ArrayList<>();
        File file = new File(pathname);
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String fullItemDescription = fileScanner.nextLine();
                String name = fullItemDescription.substring(0, fullItemDescription.indexOf("="));
                int weight = Integer.parseInt(fullItemDescription.substring(fullItemDescription.indexOf("=") + 1));
                itemsAdded.add(new Item(name, weight));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exists in the path.");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return itemsAdded;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> u1RocketsList = new ArrayList<>();
        U1 u1Rocket = new U1();
        int i = 0;
        while (i < items.size()) {
            if (u1Rocket.canCarry(items.get(i))) {
                u1Rocket.carry(items.get(i));
                i++;
            } else {
                u1RocketsList.add(u1Rocket);
                u1Rocket = new U1();
            }
        }
        u1RocketsList.add(u1Rocket);
        return u1RocketsList;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> u2RocketsList = new ArrayList<>();
        U2 u2Rocket = new U2();
        int i = 0;
        while (i < items.size()) {
            if (u2Rocket.canCarry(items.get(i))) {
                u2Rocket.carry(items.get(i));
                i++;
            } else {
                u2RocketsList.add(u2Rocket);
                u2Rocket = new U2();
            }
        }
        u2RocketsList.add(u2Rocket);
        return u2RocketsList;
    }

    public long runSimulation(ArrayList<Rocket> rockets) {
        long totalBudget = 0;
        int i = 0;
        boolean isExplodeLaunch, isExplodeLand;
        while (i < rockets.size()) {
            isExplodeLaunch = rockets.get(i).launch();
            isExplodeLand = rockets.get(i).land();
            totalBudget += rockets.get(i).getCost();
            if (isExplodeLaunch) {
                System.out.println("Rocket Successfully launched...✅");
                if (isExplodeLand) {
                    System.out.println("Rocket Successfully landed in Mars.✅");
                    i++;
                } else {
                    System.out.println("Rocket Crashed in landing ❌");
                }
            } else {
                System.out.println("Rocket Explode while launching.❌");
            }
            System.out.println("---------------------------------------------");
        }
        return totalBudget;
    }
}