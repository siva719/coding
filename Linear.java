import java.util.*;
public class Linear{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of elements in an array");
        int n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter elment"+(i+1));
            a[i]=s.nextInt();
        }
        System.out.println("enter element to search");
        int key=s.nextInt();
        int res=search(a,key);
        if(res==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found in "+res);
        }

        
        

    }
    public static int search(int [] a,int key){
        for(int i=0;i<a.length;i++){
            if (a[i]==key){
                return i;
            }
        }

        return -1;

    }
}