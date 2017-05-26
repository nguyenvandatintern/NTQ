package colletion.example;

import java.util.Arrays;

/**
 * Created by Adminfdf on 26/05/2017.
 */
public class Square {
    public int[]inputArray (){
        int[] inputArray = {-6, -4, 1, 2, 3, 5};
        int[]output = new int[inputArray.length];
        for(int i = 0; i<inputArray.length;i++){
            output[i]= (inputArray[i] * inputArray[i]);
        }
        Arrays.sort(output);
        return output;
    }
    public void displayArray(){
        for(int i =0; i<inputArray().length; i++){
            System.out.print(inputArray()[i]+" ");
        }
    }

    public static void main(String[] args) {
        Square square = new Square();
        square.displayArray();
    }
}
