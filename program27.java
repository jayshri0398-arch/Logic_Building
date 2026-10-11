import java.util.Scanner;

class program27
{
    public static void main(String A[])
    {
        Scanner scanner = null;
        String sName = null;
        int iAge = 0;
        float fMarks = 0.0;   //Error

        scanner = new Scanner(System.in);
         
        System.out.println("Enter your name : ");
        sName = scanner.next();

        System.out.println("Enter your age : ");
        iAge= scanner.nextInt();

         System.out.println("Enter your marks : ");
        fMarks= scanner.nextFloat();
        
        System.out.println("Welcome " +sName);
        System.out.println("Your age is : "+iAge);
        System.out.println("Your marks : "+fMarks);
    } 
} 



