public class Candy extends DessertItem
{
    public float weight;
    public float pricePerPound;

    public Candy()
    {
    }

    public Candy(String name,float weight,float pricePerPound)
    {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    public float getWeight()
    {
        return weight;
    }


    @Override
    public int getCost()
    {
        return Math.round(weight * pricePerPound *1f);
    }
}
