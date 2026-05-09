import java.util.Scanner;

class jee{
    public static void main(String [] args){
        //int t;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array :");
        int n= in.nextInt();
        System.out.println("\nEnter the " + n +" elements :");
        int arr[]=new int[n];
        for(int a=0;a<n;a++){
            arr[a]=in.nextInt();
        }
        //int arr[]={4, 3, 7, 2, 6, 1};
        int s=arr[0];
        int c=0;
       
        for(int i: arr){
            if(i<s){
                s=i;
                c++;

            }
        }
        System.out.println(""+c);

    }
}
