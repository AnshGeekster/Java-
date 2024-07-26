import java.util.*;
import java.lang.*;
public class Occurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0,k=0;
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        sc.close();
        int l=s.length();
        int[] arr=new int[l];
        s=s.toLowerCase();
        for(char j='a';j<='z';j++)
        {
            for(int i=0;i<l;i++)
            {
                char ch=s.charAt(i);
                if(ch==j){
                    c++;
                }
            }
            if (c>0){
                arr[k]=c;
                k++;
                c=0;
            }
        }
        int l1=arr.length;
        for(int m=0;m<l1;m++){
            for(int n=m+1;n<l1;n++){
                if(arr[m]<arr[n]){
                    int temp=arr[m];
                    arr[m]=arr[n];
                    arr[n]=temp;
                }
            }
        }
        for(int p=0;p<l1;p++){
            if(arr[p]!=0){
            System.out.print(arr[p]+" ");
        }

}
}
}
