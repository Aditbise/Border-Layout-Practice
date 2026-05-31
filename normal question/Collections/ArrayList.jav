import java.util.*;
class ArrayList{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        java.util.ArrayList<Integer> alist=new java.util.ArrayList<>();
        System.out.println("Enter the value that you want to put in array list");
        int a=sc.nextInt();
        int n;
        do{
            System.out.println("Do you want to enter one more number? write 1 for y, 0 for n");
            n=sc.nextInt();
            if(n==0) break;
            a=sc.nextInt();
            alist.add(a);
        }while(n!=0);

    }
} 