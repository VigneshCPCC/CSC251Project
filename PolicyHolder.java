public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   public PolicyHolder(String fName, String lName, int holderAge, String status, double heightInches, double weightPounds)
   {
      firstName = fName;
      lastName = lName;
      age = holderAge;
      smokingStatus = status;
      height = heightInches;
      weight = weightPounds;
   }
   
   
   
   /**
      The getFirstName method displays the first name.
      @return the first name.
   
   */
   
   public String getFirstName()
   {
      return firstName;
   }
   /**
      The getLastName method displays the last name.
      @return the last name.
   
   */
   
   public String getLastName()
   {
      return lastName;
   }
   /**
      The getAge method displays the age.
      @return the age.
   
   */
   
   public int getAge()
   {
      return age;
   }
   
   /**
      The getSmokingStatus method displays the smoking status.
      @return the smoking status.
   
   */
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   /**
      The getHeight method displays the height.
      @return the height.
   
   */
   
   public double getHeight()
   {
      return height;
   }
   /**
      The getWeight method displays the weight.
      @return the weight.
   
   */
   
   public double getWeight()
   {
      return weight;
   }
   
   public void setFirstName(String name)
   {
      firstName = name;
   }
   /**
      The setLastName method sets last name.
      @param name The last name.
   
   */
   
   public void setLastName(String name)
   {
      lastName = name;
   }
   
   /**
      The setAge method sets age.
      @param holderAge the person's age.
   
   */
   
   public void setAge(int holderAge)
   {
      age = holderAge;
   }
   
   /**
      The setSmokingStatus method sets the smoking status.
      @param status The smoking status.
   
   */
   
   public void setSmokingStatus(String status)
   {
      smokingStatus = status;
      
   }
   /**
      The setHeight method sets height.
      @param holderHeight The holder's height.
   
   */
   
   public void setHeight(int holderHeight)
   {
      height = holderHeight;
   }
   /**
      The setWeight method sets weight.
      @param holderWeight The holder's weight.
   
   */
   
   public void setWeight(int holderWeight)
   {
      weight = holderWeight;
   }
   /**
      The getBMI method returns the weight multiplied by 703 and divided by the height squared.
      @return The holder's BMI.
   
   */
   
   public double getBMI()
   {
      return ((weight*703)/(height*height));
   }
   /**
      The getReturnPrice method returns the total with added expenses based on age, smoking status and BMI.
      @return The holder's return price.
   
   */
   
   public double getReturnPrice()
   {
      double total = 600;
      if (age > 50)
      {
         total += 75;
      }
      if (smokingStatus.equals("smoker"))
      {
         total += 100;
      }
      if (getBMI() > 35)
      {
         total += (getBMI() - 35.0)*20.0;
      }
      
      return total;
    }
    
    public String toString()
    {
      if (smokingStatus.equals("false"))
      {
         return "The name of Policy Holder is "+firstName+" "+lastName+". They are "+age+" old, and they do not smoke. "
               +"They are "+height+" inches, and they weight "+weight+" pounds.";
      }
      return "The name of Policy Holder is "+firstName+" "+lastName+". They are "+age+" old, and they do smoke. "
               +"They are "+height+" inches, and they weight "+weight+" pounds.";

    }

}
   