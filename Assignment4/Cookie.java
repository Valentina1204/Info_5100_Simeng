public class Cookie extends DessertItem
{
    public int number;
    public float pricePerDozen;

    public Cookie()
    {
    }

    public Cookie(String name, int number, float pricePerDozen)
    {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public int getCost()
    {
        return Math.round(number * pricePerDozen / 12f);
    }
}
