package Allprogram;
class Baseclass
{
	int parentNum=10;
}
class Subclass1 extends BaseClass
{
	int childNum1=1;
	public int parentNum;
}
class SubClass2 extends Baseclass
{
	int childNum2=2;
}
//hierichal inheritence that type off inheritance that allows multiple class to 
//inherit from a single parent class
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		Subclass1 childobj1= new Subclass1();
		Subclass1 childobj2= new Subclass1();
		Subclass1 childobj3= new Subclass1();
		System.out.println("parentNum*+childNum1="+childobj1.parentNum*childobj1.childNum1);
		System.out.println("parentNum*+childNum2="+childobj1.parentNum*childobj2.childNum2);
		System.out.println("parentNum*+childNum3="+childobj1.parentNum*childobj3.childNum);
	}
}
	}
		// TODO Auto-generated method stub

	}

}
