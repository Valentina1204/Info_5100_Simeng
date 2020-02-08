public class IceCream extends DessertItem
{
    public float costOfIceCream;

    public IceCream()
    {
    }

    public IceCream(String name, float costOfIceCream)
    {
        super(name);
        this.costOfIceCream = costOfIceCream;
    }

    @Override
    public int getCost()
    {
        return Math.round(costOfIceCream);
    }
}
