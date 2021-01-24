package com.challenges;

import java.util.Scanner;

public class Challenges {

    public static void main(String[] args) {
        eofChallenge();
    }

    // Data Type challenge
    public void dataTypeChallenge(){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++) {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }

    //Query sum challenge.
    public void queryCalculatorChallenge(){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a = 0;
        int b = 0;
        int n = 0 ;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            calculateQuery(a , b , n);
        }
        in.close();
    }

    public static void eofChallenge() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNext()){
                break;
            }
            i++;
            System.out.println(i + " " + scanner.nextLine());
        }
    }


    private static void calculateQuery(int a , int b , int n){
        int sum = a;
        for (int i = 0 ; i < n ; i++){
            sum += (Math.pow(2 , i)) * b ;
            System.out.print(sum + " ");
        }
    }
}






