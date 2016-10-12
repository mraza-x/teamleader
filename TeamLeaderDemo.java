
import java.util.Scanner;

/**
  Mohammed Raza
  CSC 162 - Lab3 #3 (main)
*/

public class TeamLeaderDemo
{
   public static void main(String[] args)
   {

	  String name1;
	  String id1;
	  String date1;
	  int shift1;
	  double payrate1;
	  double bonus1;
	  double hrsreq1;
	  double hrsatt1;


	  Scanner keyboard = new Scanner(System.in);

	  //***Team Leader 1***

					System.out.println("Team Leader 1: ");

					System.out.print("Name: ");
      				name1 = keyboard.nextLine();

      				System.out.print("ID number: ");
      				id1 = keyboard.nextLine();

      				System.out.print("Hire Date: ");
      				date1 = keyboard.nextLine();

      				System.out.print("Shift (1 for day, 2 for night): ");
      				shift1 = keyboard.nextInt();

      				System.out.print("Pay Rate/Hour: $");
      				payrate1 = keyboard.nextDouble();

      				System.out.print("Monthly Bonus: $");
      				bonus1 = keyboard.nextDouble();

      				System.out.print("Required Training Hours: ");
      				hrsreq1 = keyboard.nextDouble();

      				System.out.print("Training Hours Attended: ");
      				hrsatt1 = keyboard.nextDouble();


      TeamLeader tl1 = new TeamLeader(name1, id1, date1, shift1, payrate1, bonus1, hrsreq1, hrsatt1);

 	  System.out.println(" ");
      System.out.println(" ");


      System.out.println("Name: " +
                         tl1.getName());

	  System.out.println("ID: " +
                         tl1.getEmployeeNumber());

	  System.out.println("Hire Date: " +
                         tl1.getHireDate());

      switch (tl1.getShift())
      {
		  case 1: System.out.println("Day Shift"); break;
		  case 2: System.out.println("Night Shift"); break;
		  default:System.out.println("Invalid Shift");
	  }

      System.out.println("Pay Rate/Hr: $" +
                         tl1.getPayRate());

      System.out.println("Monthly Bonus: $" +
      					 tl1.getMonthlyBonus());

      System.out.println("Required Training Hours: " +
      					 tl1.getRequiredTrainingHours());

      System.out.println("Training Hours Attended: " +
      					 tl1.getTrainingHoursAttended());

      System.out.println(" ");
      System.out.println(" "); //***Team Leader 2 Using set methods***
      System.out.println(" ");

      TeamLeader tl2 = new TeamLeader();

      				System.out.println("Team Leader 2: ");

 					System.out.print("Name: ");
 				 	name1 = keyboard.nextLine();  // *** Professor, this statement for
 				 								  // *** name input will not execute.
 				 								  // *** It skips to the ID number input.
		      		tl2.setName(name1);

		      		System.out.print("ID number: ");
		      		id1 = keyboard.nextLine();
		      		tl2.setEmployeeNumber(id1);

		      		System.out.print("Hire Date: ");
		      		date1 = keyboard.nextLine();
		      		tl2.setHireDate(date1);

		      		System.out.print("Shift (1 for day, 2 for night): ");
		      		shift1 = keyboard.nextInt();
		      		tl2.setShift(shift1);

		      		System.out.print("Pay Rate/Hour: $");
		      		payrate1 = keyboard.nextDouble();
		      		tl2.setPayRate(payrate1);

		      		System.out.print("Monthly Bonus: $");
		      		bonus1 = keyboard.nextDouble();
		      		tl2.setMonthlyBonus(bonus1);

		      		System.out.print("Required Training Hours: ");
		      		hrsreq1 = keyboard.nextDouble();
		      		tl2.setRequiredTrainingHours(hrsreq1);

		      		System.out.print("Training Hours Attended: $");
		      		hrsatt1 = keyboard.nextDouble();
		      		tl2.setTrainingHoursAttended(hrsatt1);

      System.out.println(" ");
      System.out.println(" ");


      System.out.println("Name: " +
	                     tl2.getName());

	  System.out.println("ID: " +
	                     tl2.getEmployeeNumber());

	  System.out.println("Hire Date: " +
	                     tl2.getHireDate());

      switch (tl2.getShift())
      {
		  case 1: System.out.println("Day Shift"); break;
		  case 2: System.out.println("Night Shift"); break;
		  default:System.out.println("Invalid Shift");
	  }

	  System.out.println("Pay Rate/Hr: $" +
                         tl2.getPayRate());

	  System.out.println("Monthly Bonus: $" +
                         tl2.getMonthlyBonus());

	  System.out.println("Required Training Hours: " +
                         tl2.getRequiredTrainingHours());

	  System.out.println("Training Hours Attended: " +
                         tl2.getTrainingHoursAttended());


      System.out.println(" ");
      System.out.println(" ");


   }
}
