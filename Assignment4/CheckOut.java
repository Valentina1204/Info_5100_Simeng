import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CheckOut implements DessertShoppe
{
    public ArrayList<DessertItem> dessertItems;

    public CheckOut()
    {
        dessertItems = new ArrayList<DessertItem>();
    }

    public int numberOfItems()
    {
        return dessertItems.size();
    }

    public void enterItem(DessertItem item)
    {
        dessertItems.add(item);
    }

    public void clear()
    {
        dessertItems.clear();
    }

    public int totalCost()
    {
        int totalCost = 0;
        for (DessertItem e : dessertItems)
        {
            totalCost += e.getCost();
        }
        return totalCost;
    }

    public int totalTax()
    {
        return Math.round(totalCost() * taxRate);
    }

    @Override
    public java.lang.String toString()
    {
        String toString = "";

        // Page represents the total page of receipt, p represents the current page
        int page = (int)Math.ceil((double)numberOfItems() / maxSizeOfItem), p = 1;
        while (p <= page)
        {
            System.out.println("\n           " + storeName + "            ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - -");
            System.out.println("                " + p + " / " + page + "        ");
            for (int i = (p - 1) * maxSizeOfItem; i < p * maxSizeOfItem && i < numberOfItems(); i++)
            {
                DessertItem e = dessertItems.get(i);
                if (e.getClass().getSimpleName().equals("Candy"))
                {
                    System.out.println(((Candy) e).weight + " lbs. @ " + ((Candy) e).pricePerPound / 100f + " /lb.");
                }
                else if (e.getClass().getSimpleName().equals("Cookie"))
                {
                    System.out.println(((Cookie) e).number + " @ " + ((Cookie) e).pricePerDozen / 100f + " /dz.");
                }
                else if (e.getClass().getSimpleName().equals("Sundae"))
                {
                    System.out.println(((Sundae) e).toppingName + " with");
                }

                String n = e.getName();
                // Check whether name's length is greater than first string's length 35 in String format
                //
                if (n.length() <= 35)
                {
                    String line = String.format("%1$-35s %2$5s", n, centsToDollarsAndCents(e.getCost()));
                    System.out.println(line);
                }
                // If name's length is greater than 35, than split name into a String ArrayList and print each String until
                // the last String, finally print the last String and cost
                //
                else
                {
                    ArrayList<String> list = new ArrayList<String>();
                    Pattern pattern = Pattern.compile("\\b.{1," + 34 + "}\\b\\W?");
                    Matcher matcher= pattern.matcher(n);
                    while (matcher.find())
                    {
                        list.add(matcher.group());
                    }

                    for (int j = 0; j <list.size() - 1; j++)
                    {
                        System.out.println(list.get(j));
                    }

                    String line = String.format("%1$-35s %2$5s", list.get(list.size() - 1), centsToDollarsAndCents(e.getCost()));
                    System.out.println(line);
                }
            }
            p++;
        }

        String tax = String.format("%1$-30s %2$10s","Tax",centsToDollarsAndCents(totalTax()));
        System.out.println("\n");
        System.out.println(tax);
        String Cost = String.format("%1$-30s %2$10s","Total cost",centsToDollarsAndCents(totalCost()));
        System.out.println(Cost);
        return toString;
    }

    @Override
    public String centsToDollarsAndCents(int cents)
    {
        String s = "" + cents / 100f + "";
        return s;
    }
}
