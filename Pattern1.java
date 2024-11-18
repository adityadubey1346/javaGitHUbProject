/*
 * * 3 * *
   * 2 *
     1
 */

import java.util.Scanner;

class Pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int m=n-(n/2+1);
        System.out.println(m);

    for(int i=n;i>0;i--){
        for(int k=0; k<n-i;k++){
            System.out.print(" ");
        }
        for(int j=i;j>0;j--){
            if(i%2==0){
                // System.out.print();
            }
            // else if(i-j==m){
            //     System.out.print(m+" ");
            // }
            else{
                System.out.print(i+""+j+" ");
            }
        }
        System.out.println();
    }
    }

 }