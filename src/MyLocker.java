import java.util.Scanner;

public class MyLocker {
	public static void main(String[] args) {
		System.out.println("My Lockers");
		System.out.println("Application Developer- Saurabh");
		System.out.println("Please enter option number");
		System.out.println("1.Search");
		System.out.println("2.Add");
		System.out.println("3.Delete");
		System.out.println("4.Exit the application");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("Please enter your first name.");
	    Scanner ch=new Scanner(System.in);
	    String Name=ch.next();
	    System.out.println(Name+", we found your Locker.");
		break;
		case 2: System.out.println("Please enter your first name.");
		Scanner c1=new Scanner(System.in);
		String N=c1.next();
		System.out.println(N+ ", your Locker is created.");
		break;
		case 3: System.out.println("Please enter your first name.");
		Scanner c2= new Scanner(System.in);
		String M=c2.next();
		System.out.println(M+", your locker is deleted.");
		break;
		case 4:
			System.out.println("Thank you for using MyLocker.");
			break;
			default:
				System.out.println("Entered number does not match any listed option");
		}
		}
		
		
	}
