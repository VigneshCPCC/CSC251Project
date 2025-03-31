public class Policy
{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private int height;
   private int weight;
   
   public Policy()
   {
      policyNumber = 0;
      providerName = null;
      firstName = null;
      lastName = null;
      age = 0;
      smokingStatus = null;
      height = 0;
      weight = 0;
      
   }
   
   public Policy(int number, String name, String fName, String lName, int holderAge, String status, int heightInches, int weightPounds)
   {
      policyNumber = number;
      providerName = name;
      firstName = fName;
      lastName = lName;
      age = holderAge;
      smokingStatus = status;
      height = heightInches;
      weight = WeightPounds;
   }
   
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public int getHeight()
   {
      return height;
   }
   
   public int getWeight()
   {
      return weight;
   }
   
   public void setPolicyNumber(int policy)
   {
      policyNumber = policy;
   }
   
   public void getProviderName(String name)
   {
      providerName = name;
   }
   
   public void getFirstName(String name)
   {
      firstName = name;
   }
   
   public void getLastName(String name)
   {
      lastName = name;
   }
   
   public void getAge(int holderAge)
   {
      age = holderAge;
   }
   
   public void getSmokingStatus(String status)
   {
      smokingStatus = status;
   }
   
   public void getHeight(int holderHeight)
   {
      height = holderHeight;
   }
   
   public void getWeight(int holderWeight)
   {
      weight = holderWeight;
   }
   
   public double getBMI()
   {
      return ((weight*703)/(height*height));
   }
   
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
         total += (getBMI() - 35)^20;
      }
      
      return total;
   }
   
   
   
   
   
   
}