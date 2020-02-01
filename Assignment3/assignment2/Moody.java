public abstract class Moody
{
    protected abstract String getMood();
    protected abstract void expressFeelings();
    public void queryMood()
    {
        System.out.println("I feel " + getMood() + " today!");
        System.out.print("\n");
        expressFeelings();
    }
}
