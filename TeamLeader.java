/**
Mohammed Raza
CSC 162 - Lab3 # 3 (class3)
*/

public class TeamLeader extends ProductionWorker
{
   private double bonus;
   private double hrsreq;
   private double hrsatt;

   public TeamLeader()
   {

	   super();

	   bonus = 0;
	   hrsreq = 0;
	   hrsatt = 0;

   }


   public TeamLeader(String n, String i, String d, int s, double pr, double b, double hr, double ha)
   {

	  super(n,i,d,s,pr);

	  bonus = b;
	  hrsreq = hr;
	  hrsatt = ha;
   }


   public void setMonthlyBonus(double b)
   {
      bonus = b;
   }


   public void setRequiredTrainingHours(double hr)
   {
      hrsreq = hr;
   }

   public void setTrainingHoursAttended(double ha)
   {
      hrsatt = ha;
   }

   public double getMonthlyBonus()
   {
      return bonus;
   }

   public double getRequiredTrainingHours()
   {
      return hrsreq;
   }

   public double getTrainingHoursAttended()
   {
      return hrsatt;
   }

   public String toString()
   {
	   String str = " ";
	   return str;
   }


}
