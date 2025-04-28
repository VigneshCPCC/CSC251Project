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
         
         Policy insurance = new Policy(policyNumber, providerName, new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight));
         
         System.out.print(insurance);
         System.out.println();
       }
         file.close();
         System.out.println("There were "+Policy.getCounter()+" Policy objects created.");
         System.out.println("The number of policies with a smoker is: " + smokers);
         System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
         
      
      
      
      
   }

}