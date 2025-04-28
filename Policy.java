public class Policy
{
   private int policyNumber;
   private String providerName;
   private static int counter = 0;
   private PolicyHolder person;
   
   
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      counter++;
      person = new PolicyHolder();
      
   }
   
   public Policy(int number, String name, PolicyHolder person)
   {
      policyNumber = number;
      providerName = name;
      counter++;
      this.person = new PolicyHolder(person);
      
   }
   /**
      The getPolicyNumber method displays the policy number.
      @return the policy number
   
   */
   
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   /**
      The getProviderName method displays the provider's name.
      @return the provider's name.
   
   */
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(person);
   }
   
   public static int getCounter()
   {
      return counter;
   }
   /**
      The setPolicyNumber method sets policy number.
      @param policy The policy number.
   
   */
   
   public void setPolicyNumber(int policy)
   {
      policyNumber = policy;
   }
   /**
      The getProviderName method sets provider name.
      @param name The provider name.
   
   */
   public void setProviderName(String name)
   {
      providerName = name;
   }
   
   public String toString()
   {
      return "\nPolicy Number: "+policyNumber+"\nProvider Name: "+providerName+"\n"+person;
   }
   
  
         
   
   
}