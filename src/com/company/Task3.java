package com.company;

public class Task3 {
    public static void main(int[] array){
        int[] myList={1,2,3,4,5,6,7,8,9};
        for(int i=0; i<myList.length;i++){
            if( myList[i] % 3 ==0) {
                System.out.println(myList[i]);
            }
        }
    }
}
