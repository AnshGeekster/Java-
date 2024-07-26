import java.util.Scanner;
import java.lang.*;
public class String_Encryption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine().trim();
        sc.close();
        int l=input.length();
        int i,j;
        String s="";
        for(i=0,j=l-1;i<=j;i++,j--){
            s+=input.charAt(i);
            if(i!=j){
                s+=input.charAt(j);
            }
        }
        System.out.println(s);


    }}
