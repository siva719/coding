import java.util.*;
public class Binary {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter elemeent"+(i+1));
            a[i]=s.nextInt();
        }
        System.out.println("enter to search elements");
        int key=s.nextInt();
        int res=Binary(a,key);
        if(res==-1){
            System.out.println("not found");

        }
        else{
            System.out.println("found at"+res);
        }

    }   
    public static int Binary(int [] a,int key){
        int left=0;
        int right=a.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]>key){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    } 
}
