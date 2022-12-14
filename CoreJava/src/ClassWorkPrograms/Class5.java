package ClassWorkPrograms;
/*Returning a value
 ===================
 -> the compiler will be coming back to the calling method in
 below mention scenarios
 1)after executing all the statements which are present inside a method
 2)if the compiler came across the return statement it will immediatly come
 back to the calling method
 3)if there is an exception(to be disscused in exception handling)
 
 keypoints
 =========
1)the return type of a method & return value shud be compatible
2)it is not mandatory to write a return statement inside a void method
3)but if we want to write a return statement inside a void method we can write 
  BUT we should not return anything.
4)except void methods for all other methods 100% we need to write areturn statement.
if we are not writing a return statement for a non void methods we will be getting 
an COMPILE TIME ERROR.
5)it is not mandatory to write return statement as last statement inside a method.But always 
return statement should be the LAST EXECUTABLE statement.
6)Method return types can be  */

public class Class5 {
	void meth1()
	{
		System.out.println("meth1() called");
		System.out.println(10);
		return;
	}
	int meth2(int a,int b)
	{
		System.out.println("meth2() called");
		System.out.println(a+b);
		return a;
	}
	int meth3()
	{
		System.out.println("meth3() called");
		return 'A';
	}
	int meth4(int a) {
		System.out.println("meth4() called");
		System.out.println("a value :"+a);
		return a+5;
	}
	char meth5()
	{
		System.out.println("meth5() called");
		return 65;
	}
	int meth6(int a)
	{
		System.out.println("meth6() called");
		if(a<=10)
		{
			System.out.println("if block executed");
		return a+10;
		//System.out.println("Hi");//Compile time error because it is unreachable code.
		}
		else
		{
			System.out.println("else block executed");
			return a+20;
			//System.out.println("Hello"); //Compile time error because it is unreachable code
		}
	}
	
	
	public static void main(String[] args) {
	System.out.println("Start");
	Class5 obj=new Class5();
	obj.meth1();
	System.out.println("--------------------------");
	obj.meth2(99,1);
	System.out.println("---------------------------");
	System.out.println("meth3() is returning ==>"+obj.meth3());//65
	System.out.println("--------------------------");
	System.out.println("meth4() is returning ==>"+obj.meth4('A'));//70
	System.out.println("--------------------------");
	System.out.println("meth5() is returning ==>"+obj.meth5());
	System.out.println("--------------------------");
	System.out.println("meth6() is returning ==>"+obj.meth6(5));//
	System.out.println("end");
	
}
	
}
