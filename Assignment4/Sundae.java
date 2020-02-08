public class Sundae extends IceCream
{
    public float costOfTopping;
    public String toppingName;

    public Sundae()
    {
    }

    public Sundae(String name, float costOfIceCream, String toppingName, float costOfTopping)
    {
        super(name,costOfIceCream);
        this.toppingName = toppingName;
        this.costOfTopping = costOfTopping;
    }

    @Override
    public int getCost()
    {
        return(Math.round(costOfIceCream + costOfTopping));
    }
}
