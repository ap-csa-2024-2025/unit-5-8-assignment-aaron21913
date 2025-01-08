public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0;

  // Non-default Dog constructor
  public Dog(String name)
  {
    this.name = name;

    numDogs++;
    this.ID = numDogs * numDogs;
  }
  // Default Dog constructor

  // Setters - instance variables only
  public voi setName(String iName)
  {
    name = iName;
  }
  // Getters - instance variables only
  public String getName()
  {
    return name;
  }
  // method getNumDogs
}
