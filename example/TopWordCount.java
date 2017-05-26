package colletion.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Adminfdf on 26/05/2017.
 */
public class TopWordCount {
    public String handleString(){
        String result= "";
        String input = "Tôi sinh ra đã không thấy được mặt cha. " +
                "Đó là sự tổn thương rất lớn. Tuy vậy, nhưng mỗi khi ở bên mẹ," +
                " tôi cảm thấy thật hạnh phúc… Bàn tay mẹ tần tảo, đầy những vết chai sần. Đôi" +
                " mắt thì quầng đen vì làm việc vất vả. Nhưng tôi biết, vào những ngày " +
                "Tết trong khi mọi người dang vui đùa" +
                " chạy nhảy thì mẹ lại ra ngoài vườn lặng lẽ ngồi khóc. Những giọt nước mắt" +
                " chứa đọng tâm hồn trong sáng, chung thủy của mẹ" ;
        int numberLoop = 0;
        String[]arrayListString = input.split(" ");
        Arrays.sort(arrayListString);
        int flag =0;
        for(int i =0;i<arrayListString.length;i++){
            for(int j =1+i; j<arrayListString.length;j++){
                if(arrayListString[i].contains(arrayListString[j])){
                    flag++;
                }
            }
            if(flag>numberLoop){
                numberLoop =flag;
                result = arrayListString[i];
            }
            flag=0;
        }
        return result+" "+numberLoop;
    }

    public static void main(String[] args) {
        TopWordCount topWordCount = new TopWordCount();
        System.out.println(topWordCount.handleString());

    }
}
