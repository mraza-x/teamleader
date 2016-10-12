/**
Mohammed Raza
CSC 162 - Lab3 # 3 (class2)
*/

public class ProductionWorker extends Employee
{
   public int shift;
   public double payrate;

   public ProductionWorker()
   {   super();

	   shift = 0;
	   payrate = 0;
   }


   public ProductionWorker(String n, String i, String d, int s, double pr)
   {  super(n,i,d);

	  shift = s;
	  payrate = pr;
   }


   public void setShift(int s)
   {
      shift = s;
   }


   public void setPayRate(double pr)
   {
      payrate = pr;
   }



   public int getShift()
   {
      return shift;
   }



   public double getPayRate()
   {
      return payrate;
   }

   public String toString()
   {
	   String str = " ";
	   return str;
   }


}
