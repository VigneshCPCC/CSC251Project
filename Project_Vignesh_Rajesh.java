import java.util.Scanner;

public class Project_Vignesh_Rajesh
{
   public static void main(String Args[])
   {
      Scanner input = new Scanner(System.in);
      
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      
      System.out.print("Please enter the Policy Number: ");
      policyNumber = input.nextInt();
      
      System.out.print("Please enter the Provider Name: ");
      input.nextLine();
      providerName = input.nextLine();
      
      System.out.print("Please enter the Policyholder’s First Name: ");
      firstName = input.nextLine();
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      lastName = input.nextLine();
      
      System.out.print("Please enter the Policyholder’s Age: ");
      age = input.nextInt();
      
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      input.nextLine();
      smokingStatus = input.nextLine();
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      height = input.nextDouble();
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      weight = input.nextDouble();
      
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
      
      
      
      
   }

}