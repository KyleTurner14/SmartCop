package Drink;

public class Drink
{
    int id;
    boolean carbonated;
    String description;
    String name;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public boolean isCarbonated()
    {
        return carbonated;
    }

    public void setCarbonated(boolean carbonated)
    {
        this.carbonated = carbonated;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
