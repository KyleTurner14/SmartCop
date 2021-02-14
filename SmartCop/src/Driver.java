import Drink.Drink;
import Drink.Juice;
import Drink.Soda;
import Drink.Beer;

import java.util.ArrayList;

public class Driver
{

    /**
     * This method will initialize the demo drinks and print them out
     */
    public static void run()
    {
        ArrayList<Drink> drinks = new ArrayList<>();

        initDemoDrinks(drinks);
        printDrinks(drinks);
    }

    /**
     * This method will initialize the demo drinks in the document
     */
    private static void initDemoDrinks(ArrayList<Drink> drinks)
    {
        Beer beer = new Beer();
        Juice juice = new Juice();
        Soda soda = new Soda();

        // Make a beer object
        beer.setId(1);
        beer.setName("Budweiser");
        beer.setAlcohol(5);
        beer.setCarbonated(true);
        beer.setDescription("");

        // Make a juice object
        juice.setId(2);
        juice.setName("Orange Juice");
        juice.getFruits().add("oranges");
        juice.setCarbonated(false);
        juice.setDescription("");

        // Make a soda object
        soda.setId(3);
        soda.setName("Pepsi");
        soda.setCarbonated(true);
        soda.setCaffeineFree(false);
        soda.setDescription("");

        // Add to arraylist
        drinks.add(beer);
        drinks.add(juice);
        drinks.add(soda);
    }

    /**
     * This method will print the drinks in the arraylist
     */
    public static void printDrinks(ArrayList<Drink> drinks)
    {
        // loop through and print the drinks
        for(Drink drink : drinks)
        {
            System.out.println(drink.getDescription());
        }
    }
}
