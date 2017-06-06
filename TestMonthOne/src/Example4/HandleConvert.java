/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example4;

import java.util.ArrayList;

/**
 *
 * @author Adminfdf
 */
public class HandleConvert {

    private String resultQS = "";
    private String result = "";
    private ArrayList aList;

    public int inputInteger() {
        //input number size max = 7 =))
        int numberInput = 9967123;
        return numberInput;
    }

    public String coverIntToString() {
        int number = inputInteger();
        int countRow = 1;
        String temp = "";
        String numberString = String.valueOf(number);
        String[] arrayNumberString = numberString.split("");
        aList = new ArrayList();
        for (int i = 0; i < arrayNumberString.length; i++) {
            aList.add(arrayNumberString[i]);
        }
        while (aList.size() > 0) {
            if(checkString().equals("0")){
                aList.remove(0);
                continue;
            }
            if (aList.size() == 7) {
                String str = aList.get(0) + "";
                temp = checkString();
                resultQS += temp + " Million ";

            }
            if (aList.size() == 6) {
                String str = aList.get(0) + "";
                temp = checkString();
                resultQS += temp + " Hundred ";

            }
            if (aList.size() == 5) {
                String str = aList.get(0) + "";
                temp = checkString();
                resultQS += temp + "ty ";

            }
            if (aList.size() == 4) {
                String str = aList.get(0) + "";
                temp = checkString();
                resultQS += temp + " Thousand ";

            }
            if (aList.size() == 3) {
                String str = aList.get(0) + "";
                temp = checkString();
                resultQS += temp + " Hundred ";
            }
            if (aList.size() == 2) {
                String str = aList.get(0) + "";
                temp = checkString();
                resultQS += temp + "ty ";
            }
            if (aList.size() == 1) {
                String str = aList.get(0) + "";
                temp = checkString();
                resultQS += temp;
            }
            aList.remove(0);
            temp = "";
        }
       // System.out.println(resultQS);
        return resultQS;
    }

    public String checkString() {

        String str = aList.get(0).toString();
        if (str.equals("1")) {
            result = "One";
        }
        if (str.equals("2")) {
            result = "Two";
        }
        if (str.equals("3")) {
            result = "Three";
        }
        if (str.equals("4")) {
            result = "Four";
        }
        if (str.equals("5")) {
            result = "Five";
        }
        if (str.equals("6")) {
            result = "Six";
        }
        if (str.equals("7")) {
            result = "Seven";
        }
        if (str.equals("8")) {
            result = "Eigth";
        }
        if (str.equals("9")) {
            result = "Nine";
        }
        if (str.equals("0")) {
            result = "0";
        }
        str ="";
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        HandleConvert handleConvert = new HandleConvert();
        System.out.println(handleConvert.coverIntToString());

    }
}
