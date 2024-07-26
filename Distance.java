import java.util.Scanner;
public class Distance
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float g= 9.81f;
        System.out.println("Enter the time in seconds: ");
        int X=sc.nextInt();
        sc.close();
        float d= (0.5f)*g*X*X;
        System.out.println(d+" meters");
    
    }
}
