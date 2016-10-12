/**
Mohammed Raza
CSC 162 - Lab3 # 3 (class1)
*/

public class Employee
{
   public String name;
   public String id;
   public String date;

   public Employee()
   {
	   name = " ";
	   id = " ";
	   date = " ";
   }

   public Employee(String n, String i, String d)
   {
	  name = n;
	  id = i;
	  date = d;
   }


   public void setName(String n)
   {
      name = n;
   }


   public void setEmployeeNumber(String i)
   {
      id = i;
   }

   public void setHireDate(String d)
   {
      date = d;
   }



   public String getName()
   {
      return name;
   }



   public String getEmployeeNumber()
   {
      return id;
   }


   public String getHireDate()
   {
      return date;
   }


   public void isValidEmpNum()
   {

   }

   public String toString()
   {
	   String str = " ";
	   return str;
   }

}
