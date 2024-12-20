package Allprogram;

public class Staticvariablemethod {
	private static int count=45;//static variable
    public static void print()//static method
    {
    	System.out.println("Number of count"+count);
    }
	public static void main(String[] args) {
		{
			Staticvariablemethod obj=new Staticvariablemethod();
			obj.print();//static method
			System.out.println(obj.count);
		}
		// TODO Auto-generated method stub

	}

}
