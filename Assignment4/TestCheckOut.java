public class TestCheckOut
{
    public static void main(String[] args)
    {
        CheckOut checkOut = new CheckOut();
        checkOut.enterItem(new Candy("Butter Fudge",2.25f,399));
        checkOut.enterItem(new IceCream("Vanilla and Strawberry and Blueberry Ice Cream", 105));
        checkOut.enterItem(new Sundae("Chocolate Ice Cream", 145,"Hot Fudge", 50));
        checkOut.enterItem(new Cookie("Sweet Cookie",4,399));
        checkOut.enterItem(new IceCream("Strawberry Ice Cream", 150));
        checkOut.enterItem(new Cookie("Soda Cookie",5,400));
        checkOut.enterItem(new Candy("Bang Bang Candy",2.5f,420));
        checkOut.enterItem(new Sundae("Blueberry Ice Cream", 125,"Ice Fudge", 60));

        System.out.println("\nNumber of items: " + checkOut.numberOfItems() + "\n");
        System.out.println("Total cost: " + checkOut.totalCost() + "\n");
        System.out.println("Total tax: " + checkOut.totalTax() + "\n");
        System.out.println("Cost + Tax: " + (checkOut.totalCost() + checkOut.totalTax()));
        System.out.println(checkOut);

        checkOut.clear();

        checkOut.enterItem(new IceCream("Watermelon Ice Cream", 150));
        checkOut.enterItem(new Cookie("Soda SoftCookie",4,400));
        checkOut.enterItem(new Candy("Bang Candy",2.5f,320));
        checkOut.enterItem(new Sundae("Cherry Ice Cream", 120,"Ice Fudge", 60));

        System.out.println("\nNumber of items: " + checkOut.numberOfItems() + "\n");
        System.out.println("Total cost: " + checkOut.totalCost() + "\n");
        System.out.println("Total tax: " + checkOut.totalTax() + "\n");
        System.out.println("Cost + Tax: " + (checkOut.totalCost() + checkOut.totalTax()) + "\n");
        System.out.println(checkOut);

    }
}
