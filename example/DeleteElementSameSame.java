package colletion.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Adminfdf on 26/05/2017.
 */
public class DeleteElementSameSame {
    public List<Integer> integerList(){
        int[] input = {2, 3, 3, 1, 5, 2};
        List list = new LinkedList();
        for(int i =0;i<input.length;i++){
            if(!list.contains(input[i]))
                list.add(input[i]);
        }
        Collections.sort(list);
        return  list;

    }
    public void display(){
        for (int i =0; i< integerList().size();i++){
            System.out.print(integerList().get(i)+" ");
        }
    }

    public static void main(String[] args) {
        DeleteElementSameSame dess = new DeleteElementSameSame();
        dess.display();
    }
}
