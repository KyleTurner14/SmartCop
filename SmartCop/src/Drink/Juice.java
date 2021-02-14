package Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Juice extends Drink
{
    ArrayList<String> fruits = new ArrayList<>();

    public ArrayList<String> getFruits()
    {
        return fruits;
    }

    public void setFruits(ArrayList<String> fruits)
    {
        this.fruits = fruits;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public void setDescription(String description)
    {
        List<String> values = new ArrayList<>();

        // add the values we will include in the description
        values.add(name);
        values.add(carbonated ? "carbonated" : "not carbonated");
        values.add(getFruitsList());

        // build the description string
        StringBuilder sbDesc = new StringBuilder();
        sbDesc.append(values.stream().collect(Collectors.joining(", ")).stripTrailing()).append(".");

        this.description = sbDesc.toString();
    }

    /**
     * This method will return the fruits the juice is made from in a comma seperated list
     * @return A string that contains the fruits in the juice
     */
    public String getFruitsList()
    {
        StringBuilder sbFruits = new StringBuilder();
        sbFruits.append("made from ");
        sbFruits.append(fruits.stream().collect(Collectors.joining(", ")).stripTrailing());

        return sbFruits.toString();
    }
}
