class Lab4Ex5{
	 public static void main(String args[])	{
		 
		 System.out.println("Height in feet:"+args[0]);
		 double a = Double.parseDouble(args[0]);
		 
		 double b = 0.3*a;
		 
		 System.out.println("Height in meters of corresponding feet:"+b);
		 
		 System.out.println("Height in inches:"+args[1]);
		 double c= Double.parseDouble(args[1]);
		 
		 double d =0.025*c;
		 
		 System.out.println("Height in meters of corresponding inches:"+d);
		 
		 
	 }
	
	
}