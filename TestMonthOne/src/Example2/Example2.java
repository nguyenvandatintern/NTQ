/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 *
 * @author Adminfdf
 */
public class Example2 {

    public int[] arrayA = {1, 5, 3, 12, 54, 7, 45, 8, 9, 32, 4, 5, 23, 41};
    public int[] arrayB = {1, 5, 7, 8};
    int temp = 0;
    int lengthC = arrayA.length - arrayB.length;
    public int[] ArrayC = new int[lengthC];
    int flag = 1;
    private int sumArray = 0;

    public void handleArray() {

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    flag = 2;
                }
                if (arrayA[i] == arrayA[j] && i > j) {
                    ArrayC[temp] = arrayA[i];
                    temp++;
                    flag = 2;
                }
            }
            if (flag == 1) {
                ArrayC[temp] = arrayA[i];
                temp++;
            }
            flag = 1;
        }

    }
    
    public int sumArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        return sumArray;
    }

    public boolean checkArraySame() {
        if (sumArray(arrayB) == sumArray(arrayA)) {
            return true;
        }
        return false;
    }

    public void displayArray() {
        if(checkArraySame()){
            System.out.println("True");
        }
        else System.out.println("False");
    }

    public static void main(String[] args) {
        Example2 arrayExample = new Example2();
        arrayExample.handleArray();
        arrayExample.displayArray();
    }
}
