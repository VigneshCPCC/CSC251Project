import java.util.Scanner;
import java.io.*;

public class Project_Vignesh_Rajesh
{
   public static void main(String Args[]) throws FileNotFoundException
   {      
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int smokers = 0, nonSmokers = 0;
      
      File inputFile = new File("PolicyInformation.txt");
      Scanner file = new Scanner(inputFile);
      //use inputFile.close();
      while(file.hasNext())
      {
      
         policyNumber = file.nextInt();
         
         file.nextLine();
         providerName = file.nextLine();
         
         firstName = file.nextLine();
         
         lastName = file.nextLine();
         
         age = file.nextInt();
         file.nextLine();
         smokingStatus = file.nextLine();
         if (smokingStatus.equals("smoker"))
         {
            smokers++;
         }
         else
         {
            nonSmokers++;
         }
         height = file.nextDouble();
         
         weight = file.nextDouble();
         
         Policy insurance = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
         
         System.out.println("Policy Number: "+insurance.getPolicyNumber());
         System.out.println("Provider Name: "+insurance.getProviderName());
         System.out.println("Policyholder’s First Name: "+insurance.getFirstName());
         System.out.println("Policyholder’s Last Name: "+insurance.getLastName());
         System.out.println("Policyholder's Age: "+insurance.getAge());
         System.out.println("Policyholder’s Smoking Status:: "+insurance.getSmokingStatus());
         System.out.println("Policyholder's Height: "+insurance.getHeight());
         System.out.println("Policyholder's Weight: "+insurance.getWeight());
         
         System.out.println("Policyholder's BMI: "+insurance.getBMI());
         
         System.out.println("Policy Price: "+insurance.getReturnPrice());
         System.out.println();
       }
         file.close();
         System.out.println("The number of policies with a smoker is: " + smokers);
         System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
         
      
      
      
      
   }

}