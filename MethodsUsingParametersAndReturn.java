package AllPrograms;

public class AddNumUsingMethodParametersAndReturn {
	
	static void AddMethodParameters(int a, int b) {
		int temp = a+b;
		System.out.println("Method parameters A+B :"+temp);
	}
	
	static int AddReturnType(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddMethodParameters(10,11);
//		AddReturnType(6,5);
		System.out.println("Return Type A+B :"+AddReturnType(6,5));
		
	}

}