import java.util.Scanner;
class StudentGrade
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Five Subject Marks");
                System.out.println("Enter the no. of Physics");
                int m1 = input.nextInt();
                System.out.println("Enter the no. of Chemistry");
                int m2 = input.nextInt();
                System.out.println("Enter the no. of Mathematics");
                int m3 = input.nextInt();
                System.out.println("Enter the no. of English");
		int m4 = input.nextInt();
                System.out.println("Enter the no. of Computer");
		int m5 = input.nextInt();
		int tot = m1+m2+m3+m4+m5;
		float per = tot/5;
		System.out.println("Total marks is "+tot);
		System.out.println("Percentage is "+per+"%");	
		if(per>=90)
			System.out.println("Grade A");
		else if(per>=80)
			System.out.println("Grade B");
		else if(per>=70)
			System.out.println("Grade C");
		else if(per>=60)
			System.out.println("Grade D");
		else if(per>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}