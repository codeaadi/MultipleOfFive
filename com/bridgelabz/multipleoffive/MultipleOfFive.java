package com.bridgelabz.multipleoffive;

public class MultipleOfFive {

    public static void main(String[] args) {
        int[] arr = {2,5,6,20,7,45};
        int sum=0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]%5==0){
                sum =sum+arr[i];
            }
            System.out.println(sum);
            }
        }
    }

