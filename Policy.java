public class Policy
{
   private int policyNumber;
   private String providerName;
   
   
   public Policy()
   {
      policyNumber = 0;
      providerName = null;
      
   }
   
   public Policy(int number, String name)
   {
      policyNumber = number;
      providerName = name;
      
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
   /**
      The setFirstName method sets first name.
      @param name The first name.
   
   */
   
   
   
   
   
   
}