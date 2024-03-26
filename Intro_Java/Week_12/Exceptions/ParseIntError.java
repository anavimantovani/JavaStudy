/**
   This program demonstrates how the Integer.parseInt
   method throws an exception.
*/

//If you handle multiple catches for a try, and some of the exceptions are related to another
//through inheritance, then you must handle the more specialized exception before the more
//generalized exception

public class ParseIntError
{
   public static void main(String[] args)
   {
       String str = "abcde";
       int number;

       try
       {
          number = Integer.parseInt(str);
       }
       /*catch (NumberFormatException e)
       { 
          System.out.println("Conversion error: " +
                             e.getMessage());
       }*/
       
     //number format exception has already been caught
       // do the specialized class firs and then the general
       catch (NumberFormatException e)
       { 
          System.out.println(str + " is not a number");
       }
       
       catch(IllegalArgumentException e)
       {
    	   System.out.println("Bad Number format");
    	   
    	   
       }
       
       
   }
}