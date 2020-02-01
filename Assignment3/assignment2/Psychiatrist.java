public class Psychiatrist
{
    public void examine(Moody moody)
    {
        System.out.println("How are you feeling today? ");
        moody.queryMood();
    }

    public void observe(Moody moody)
    {
        System.out.print("Observation: ");
        System.out.println(moody.toString());
        System.out.print("\n");
    }
}
