public class Pet
{
    private String PetName, OwnerName, color;
    protected int sexID;
    public static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;

    // Constructor
    public Pet(String name, String ownerName, String color)
    {
        this.PetName = name;
        this.OwnerName = ownerName;
        this.color = color;
    }

    public String getPetName()
    {
        return PetName;
    }

    public String getOwnerName()
    {
        return OwnerName;
    }

    public String getColor()
    {
        return color;
    }

    public void setSex(int sexID)
    {
       if (sexID < 1 || sexID > 4)
       {
           throw new IllegalArgumentException("Invalid sex ID!");
       }
       else
       {
           this.sexID = sexID;
       }
    }

    public String getSex()
    {
        switch (sexID)
        {
            case MALE:
                return "MALE";
            case FEMALE:
                return "FEMALE";
            case SPAYED:
                return "SPAYED";
            case NEUTERED:
                return "NEUTERED";
        }
        return "";
    }

    @Override
    public String toString()
    {
        return getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex();
    }

    public static void main(String[] args)
    {
        //Test for Pet
        Pet pet = new Pet("Spot", "Vincent", "White");
        pet.setSex(4);
        System.out.println(pet.toString());

        //Test for Cat
        Cat cat = new Cat("Cookie", "Valentina", "Brown", "Short");
        cat.setSex(3);
        System.out.println("\n" + cat.toString());

        cat.setBoardStart(2,14,2019);
        cat.setBoardEnd(3,4,2020);
        System.out.println("Boarding date is between start and end date: " + cat.boarding(3,4,2020));

        //Test for Dog
        Dog dog = new Dog("Tart", "Peter", "Black and White", "Medium");
        dog.setSex(2);
        System.out.println("\n" + dog.toString());

        dog.setBoardStart(5, 20, 2018);
        dog.setBoardEnd(7,7,2018);
        System.out.println("Boarding date is between start and end date: " + dog.boarding(3,4,2019));
    }
}
