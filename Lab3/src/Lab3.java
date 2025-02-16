import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Input numbers: ");
		int num1 = Scanner.nextInt();
		int num2 = Scanner.nextInt();
		int num3 = Scanner.nextInt();
		int maxnum = Math.max(num1,Math.max(num2,num3));
	    System.out.println("The greatest number among " + num1 + ", " + num2 + " and " + num3 + " is " + (maxnum));
	    
	    
	    
	    
	    
	    System.out.print("Input day of the week: ");
	    Scanner Scanner2 = new Scanner(System.in);
	    int num4 = Scanner2.nextInt();
	    switch (num4) {
	    	case 1:
	    		System.out.println("Day " + num4 + " of the week is Monday");
	    		break;
	    	case 2:
	    		System.out.println("Day " + num4 + " of the week is Tuesday");
	    		break;
	    	case 3:
	    		System.out.println("Day " + num4 + " of the week is Wednesday");
	    		break;
	    	case 4:
	    		System.out.println("Day " + num4 + " of the week is Thursday");
	    		break;
	    	case 5:
	    		System.out.println("Day " + num4 + " of the week is Friday");
	    		break;
	    	case 6:
	    		System.out.println("Day " + num4 + " of the week is Sathurday");
	    		break;
	    	case 7:
	    		System.out.println("Day " + num4 + " of the week is Sunday");
	    		break;
	   	    }
	    
	}

}


