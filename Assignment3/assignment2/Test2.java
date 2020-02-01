public class Test2
{
    public static void main(String[] args)
    {
        Psychiatrist psychiatrist = new Psychiatrist();
        Moody moody1 = new Sad();
        Moody moody2 = new Happy();
        psychiatrist.examine(moody2);
        psychiatrist.observe(moody2);

        psychiatrist.examine(moody1);
        psychiatrist.observe(moody1);
    }
}
