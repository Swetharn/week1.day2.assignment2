package week1.day2;

public class MyCalculator {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
Calculator calculate=new Calculator();

System.out.println("The addition of three number is:: "+calculate.add(3, 4, 5));
System.out.println("The difference between two number is:: "+calculate.sub(7, 4));
System.out.println("The multiplication of two number is:: "+calculate.multiply(6, 8.5));
System.out.println("The division of two number is:: "+calculate.divide(6.4f, 4f));

	
	}

}
