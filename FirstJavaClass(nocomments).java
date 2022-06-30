import java.util.Scanner;

public class FirstJavaClass {

	public static void main(String[] args) {
		
		//int, float, char, String, long, double, boolean
		
		int marks = 18;
		float averageMarks = 19.345f;
		char grade = 'A';
		String name = "Vaidansh";
		boolean isValid = false;
		
		long bigNumber = 9653128489745446l;
		
		System.out.println(averageMarks);
		
		//+,-,/,*,%,++,--
		int firstNumber=1234;
		int secondNumber=234;
	
		double sum = (double)firstNumber % (double)secondNumber;
		System.out.println(sum);
		
		int a =12;
		System.out.println(++a);
		System.out.println(a);
		
		//Taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("0000Enter Your name:");
		String name = sc.nextLine();
		
		System.out.println(name);
		
		//CONDITIONAL STATEMENTS
		//CONDITIONAL OPERATORS >,<,>=,<=,==,!=
		int age = 12;
		
		if (age>18) {
			System.out.println("You Can Vote");
		} else {
		System.out.println("You can't Vote");
		}
		
		System.out.println(25!=24);
		
		elseif etc
		
		
		char grade = 'D';
		
		if(grade == 'A'){
			System.out.println("Your Grade is very good");
		}else if(grade == 'B') {
			System.out.println("Very Good, Keep Learning");
		}else if(grade == 'D') {
			System.out.println("Keep Improving");
		}else {
			System.out.println("INVALID GRADE");
		}
		
		//SWITCH CASE
		
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("Your Grade is very Good,Keep Going!!");
			break;
		case 'B':
			System.out.println("Good , Keep learning");
			break;
		case 'C':
			System.out.println("Nice, Keep improving");
			break;
		default:
			System.out.println("WRONG ARGUMENT");
		}
		
//		LOGICAL OPERATORS
		int age = 55;
		
		if (!(age > 18)) {
			System.out.println("YOU CAN VOTE");
		}else {
			System.out.println("YOU CANNOT VOTE");
		}
		       //////////LOOPS///////////
		for,while,do-while
		
		for( ; ; )
		
		for(int i = 0;i < 10; i++) {
			System.out.println("VAIDANSH" + i);
		}

//		WHILE LOOP
		
		int a = 23;
		while(a <= 100) {
			System.out.println(a);
			a++;
		}
		
//		DO WHILE LOOP
		
		int a = 23;
		do {
			System.out.println(a);
			a++;
		}while(a > 100);

//
//		CONTINUE
		
		int a = 23;
		while(a <= 99){
			a++;
			if (a == 65) continue;  
			System.out.println(a);
		}
		
//	                	ARRAYS
		
		23, 12, 56, 34, 99
		
		int marks[] = new int[5];
		marks[0] = 23;
		marks[1] = 12;
		marks[2] = 56;
		marks[3] = 34;
		marks[4] = 99;
		
//		alternative way to add elements
		
		int marks[] = {23, 12, 56, 34, 99, 12, 34};
		
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		int a[][] = new int[2][3];
		int a[][] = {
				{
					1,2
				}, {
					3,4
				}
		        };
		System.out.println(a[0][1]);
		
		System.out.println(average(3, 6));
		System.out.println(average(4, 6));
	}
	
//	method
	
	returnType functionName (arguments) {}
	
	static  int average(int firstNumber, int secondNumber) {
		int sum= firstNumber + secondNumber;
		return sum/2;
	}
		try{
			System.out.println(2/0);
		}catch(Exception e) {
			System.out.println("There was an error");
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("This line has to be printed");
	
	}
}


