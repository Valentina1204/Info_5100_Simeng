import java.util.ArrayList;
import java.util.TreeSet;

public class Mreview implements Comparable<Mreview>
{
    private String title;
    private ArrayList<Integer> ratings;

    public Mreview()
    {
        this.title = "";
        this.ratings = new ArrayList<>();
    }

    public Mreview(String title)
    {
        this.title = title;
        this.ratings = new ArrayList<>();
    }

    public Mreview(String title, int firstRating)
    {
        this.title = title;
        this.ratings = new ArrayList<>();
        ratings.add(firstRating);
    }

    public void addRating(int r)
    {
        ratings.add(r);
    }

    public double aveRating()
    {
        int size = ratings.size(), total = 0;
        for (int i = 0; i < size; i++)
        {
            total += ratings.get(i);
        }

        return ((double)total / size);
    }

    public String getTitle()
    {
        return title;
    }

    public int numRatings()
    {
        return ratings.size();
    }

    @Override
    public int compareTo(Mreview mreview)
    {
        if (equals(mreview))
        {
            return 0;
        }

        TreeSet<String> titles = new TreeSet<>();
        titles.add(title);
        titles.add(mreview.getTitle());

        if (titles.first().equals(title))
        {
           return -1;
        }
        else
        {
            return 1;
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        Mreview m = (Mreview)obj;
        return title.equals(m.getTitle());
    }

    @Override
    public String toString()
    {
        return getTitle() + ", average " + aveRating() + " out of " + numRatings() + " ratings";
    }

    public static void main(String[] args)
    {
        Mreview m1 = new Mreview("Hero");
        m1.addRating(4);
        m1.addRating(5);
        m1.addRating(5);
        System.out.println("The average rating for " + m1.getTitle() + " is " + m1.aveRating());
        System.out.println(m1.toString());

        System.out.println();
        Mreview m2 = new Mreview("xyz", 5);
        System.out.println(m2.toString());
        System.out.println(m1.compareTo(m2));

    }
}
