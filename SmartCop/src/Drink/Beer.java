package Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Beer extends Drink
{
    int alcohol;

    public int getAlcohol()
    {
        return alcohol;
    }

    public void setAlcohol(int alcohol)
    {
        this.alcohol = alcohol;
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
        values.add(alcohol + "%");

        // build the description string
        StringBuilder sbDesc = new StringBuilder();
        sbDesc.append(values.stream().collect(Collectors.joining(", ")).stripTrailing()).append(".");

        this.description = sbDesc.toString();
    }
}
