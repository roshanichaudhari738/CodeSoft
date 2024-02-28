import java.util.*;
public class gradecalculator {
    public static void main(String[] ags)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Five Subject of Marks");
        int m1= sc.nextInt();
        int m2= sc.nextInt();
        int m3= sc.nextInt();
        int m4= sc.nextInt();
        int m5= sc.nextInt();
        int Total=m1+m2+m3+m4+m5;
        float per=Total/5;
        System.out.println("Total marks is:"+Total);
        System.out.println("Percentage marks is:"+per);
        if (per>=90)
            System.out.println("Grade A");
        else if (per>=70)
            System.out.println("Grade B");
        else if (per>=50)
            System.out.println("Grade C");
        else if (per>=40)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
    }
}
