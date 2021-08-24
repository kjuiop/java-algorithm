package com.gig.algorithm.backjon;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Jake
 * @date : 2021-08-24
 */
public class OneStep {

    public static void main(String[] args) {
        int a = solution("one4seveneight");
        System.out.println(a);
        int b = solution("23four5six7");
        System.out.println(b);
        int c = solution("2three45sixseven");
        System.out.println(c);
        int d = solution("123");
        System.out.println(d);
    }

    public static int solution(String s) {

        int length = s.length();
        String[] strArrays = s.split("");

        Map<String, String> alphabet = new HashMap<>();
        alphabet.put("one", "1");
        alphabet.put("two", "2");
        alphabet.put("three", "3");
        alphabet.put("four", "4");
        alphabet.put("five", "5");
        alphabet.put("six", "6");
        alphabet.put("seven", "7");
        alphabet.put("eight", "8");
        alphabet.put("nine", "9");
        alphabet.put("zero", "10");


        if (length < 1 || length > 50) {
            return 0;
        }

        String keyString = "";
        String result = "";
        for (String str : strArrays) {
            if (isInteger(str)) {
                result += str;
            } else {
                keyString += str;
                if (alphabet.containsKey(keyString)) {
                    String an = alphabet.get(keyString);
                    result += an;
                    keyString = "";
                }
            }

        }


        int answer = Integer.parseInt(result);
        return answer;
    }

    static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
