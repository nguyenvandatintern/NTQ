package colletion.example;

import colletion.ArrayList;
import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Adminfdf on 25/05/2017.
 */
public class Anagrams {
    private int k = 0;
    private String resultArray = "";
    public void handleString() {
        String str = "tea eat apple ate vaja cut java utc";
        String[] s = str.split(" ");
        Arrays.sort(s);
        String strs;
        for (int i = 0; i < s.length; i++) {
            char[] chars = s[i].toCharArray();
            Arrays.sort(chars);
            strs = new String(chars);
            resultArray += strs+" ";
        }
        String[]ss = resultArray.split(" ");
        Arrays.sort(ss);
        List list = new LinkedList();
        for(int i =0;i<ss.length;i++){
            if(!list.contains(ss[i]))
                list.add(ss[i]);
        }
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        Anagrams anagrams = new Anagrams();
        anagrams.handleString();
    }

}
