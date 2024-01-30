package spacechallenge;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
            // create the simulation object
            Simulation check = new Simulation();

            // Phase 1 U1
            System.out.println("Phase 1 for U1 Rockets: ");
            ArrayList<Item> itemsPhase1u1 = check.loadItems("phase-1.txt");
            ArrayList<Rocket> U1RocketsP1 = check.loadU1(itemsPhase1u1);
            long totalCostU1P1 = check.runSimulation(U1RocketsP1);
            System.out.println("Cost for phase 1 : " + NumberFormat.getCurrencyInstance(Locale.US).format(totalCostU1P1));
            System.out.println("==========================================================");

            // Phase 2 U1
            System.out.println("Phase 2 for U1 Rockets: ");
            ArrayList<Item> itemsPhase2u1 = check.loadItems("phase-2.txt");
            ArrayList<Rocket> U1RocketsP2 = check.loadU1(itemsPhase2u1);
            long totalCostU1P2 = check.runSimulation(U1RocketsP2);
            System.out.println("Cost for phase 2 : " + NumberFormat.getCurrencyInstance(Locale.US).format(totalCostU1P2));
            System.out.println("==========================================================");
            System.out.println();

            // Phase 1 U2
            System.out.println("Phase 1 for U2 Rockets: ");
            ArrayList<Item> itemsPhase1u2 = check.loadItems("phase-1.txt");
            ArrayList<Rocket> U2RocketsP1 = check.loadU2(itemsPhase1u2);
            long totalCostU2P1 = check.runSimulation(U2RocketsP1);
            System.out.println("Cost for phase 1 : " + NumberFormat.getCurrencyInstance(Locale.US).format(totalCostU2P1));
            System.out.println("==========================================================");


            // Phase 2 U2
            System.out.println("Phase 2 for U2 Rockets: ");
            ArrayList<Item> itemsPhase2u2 = check.loadItems("phase-2.txt");
            ArrayList<Rocket> U2RocketsP2 = check.loadU2(itemsPhase2u2);
            long totalCostU2P2 = check.runSimulation(U2RocketsP2);
            System.out.println("Cost for phase 2 : " + NumberFormat.getCurrencyInstance(Locale.US).format(totalCostU2P2));
            System.out.println("==========================================================");

            // Results of two Rockets
            System.out.println("Simulation Results: ");
            System.out.println("Total cost for fleet of U1 Rockets: " + NumberFormat.getCurrencyInstance(Locale.US).format(totalCostU1P1 + totalCostU1P2));
            System.out.println("Total cost for fleet of U2 Rockets: " + NumberFormat.getCurrencyInstance(Locale.US).format(totalCostU2P1 + totalCostU2P2));
    }
}