public class Dog extends Pet implements Boardable
{
    private String size;
    private Date setStart, setEnd;

    // Constructor
    public Dog(String name, String ownerName, String color, String size)
    {
        super(name, ownerName, color);
        this.size = size;
    }

    public String getSize()
    {
        return size;
    }

    @Override
    public String toString()
    {
        return "DOG: \n" + super.toString() + "\nSize: " + getSize();
    }

    @Override
    public void setBoardStart(int month, int day, int year)
    {
        setStart = new Date(month, day, year);
    }

    @Override
    public void setBoardEnd(int month, int day, int year)
    {
        setEnd = new Date(month, day, year);
    }

    @Override
    public boolean boarding(int month, int day, int year)
    {
        Date boarding = new Date(month, day, year);
        return boarding.lessThan(setEnd) && boarding.greaterThan(setStart);
    }

    private class Date
    {
        int month, day, year;

        public Date (int  month, int day, int year)
        {
            if (month > 0 && month < 13)
            {
                this.month = month;
            }
            else
            {
                throw new IllegalArgumentException("Invalid month!");
            }

            if (day > 0 && day < 32)
            {
                this.day = day;
            }
            else
            {
                throw new IllegalArgumentException("Invalid day!");
            }

            if (year > 999 && year < 10000)
            {
                this.year = year;
            }
            else
            {
                throw new IllegalArgumentException("Invalid year!");
            }
        }

        public boolean lessThan(Date date)
        {
            if (this.year < date.year)
            {
                return true;
            }
            else if (this.year == date.year)
            {
                if (this.month < date.month)
                {
                    return true;
                }
                else if (this.month == date.month && this.day <= date.day)
                {
                    return true;
                }
            }
            return false;
        }

        public boolean greaterThan(Date date)
        {
            if (this.year > date.year)
            {
                return true;
            }
            else if (this.year == date.year)
            {
                if (this.month > date.month)
                {
                    return true;
                }
                else if (this.month == date.month && this.day >= date.day)
                {
                    return true;
                }
            }
            return false;
        }
    }
}
