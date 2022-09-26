package com.datastructure.javaInterview;

public class PrimeNumberSeries {
    public static void main(String[] args) {
        int n=1;

        int num=1;
        int factor_count=0;
        if (num>1){
            for (int i=1; i<=num; i++){
                if (num%i==0){
                    factor_count++;
                }
            }
            if (factor_count==2){
                System.out.println("prime number");
            }
            else {
                System.out.println("not prime");
            }
        }else{
            System.out.println("not prime");
        }
    }
}
