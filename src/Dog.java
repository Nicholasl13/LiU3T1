public class Dog
{
    // -- Instance variables: these are the attributes (data) of each Cat object
    private String name;
    private int age;
    private boolean isSleeping;

    /** This is the constructor to create a Dog object */
    public Dog(String dogName, int dogAge, boolean sleeping)
    {
        name = dogName;
        age = dogAge;
        isSleeping = sleeping;
    }

    /** Returns the value of isSleeping */
    public boolean asleep()
    {
        return isSleeping;
    }

    /** Returns the Dog's name */
    public String getName()
    {
        return name;
    }

    /** Returns the Dog's age */
    public int getAge()
    {
        return age;
    }
}