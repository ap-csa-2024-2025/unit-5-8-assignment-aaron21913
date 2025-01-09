public class Car
{
  private String make;
  private String model;
  private int year;
  private double mpg;
  private int carID

  private static int nextcarID = 0;

  public Car() 
  {
    this.make = "None";
    this.model = "None";
    this.year = 2000;
    this.mpg = 0.0;
    this.carID = nextCarID;
    nextCarID++;
  }

  public Car(String make, String model, int year, double mpg) 
  {
    this.make = make;
    this.model = model;

    if (year > 2022) 
        {
          this.year = 2022;
        } else if (year < 1885) 
        {
          this.year = 2000;
        } else {
          this.year = year;
        }
        
        if (mpg < 0) 
        {
          this.mpg = 0.0;
        } else {
          this.mpg = mpg;
        }
        this.carID = nextCarID;
        nextCarID++; 
    }

}
