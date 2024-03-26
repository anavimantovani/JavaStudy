public class SubClass2 extends SuperClass2
{
   /**
      Constructor
   */
	
	//When you create a sub class obj:
	//super class constructor(default or no-arg constructor) is executed first.
	
	//Use the Super keyword to call the super class constructor
	//To call the super class constructor
	//However, the super must be the first statement in the sub class constructor
	
	//If the subclass does not explicitly call super class constructor, Java
	//will automatically call the superclass default or no arg constructor.
	
	//Inheritance DOES OT WORK reverse
	
   public SubClass2()
   {
      super(10); 
      System.out.println("This is the " +
                 "subclass constructor.");
   }
}