package chapter15.d.string.practice;

import java.nio.charset.StandardCharsets;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods methods = new UseStringMethods();
        String text = "The String class represents character strings.";
        //methods.printWords(text);
        //methods.findString(text, "string");
//        methods.findAnyCaseString(text, "string");
//        methods.countChar(text, 's');
        methods.printContainWords(text, "ss");

    }

    public void printWords(String str){
        String[] arr = str.split(" ");

        for(String val : arr){
            System.out.println("val = " + val);
        }
    }

    public void findString(String str, String findStr){
        System.out.println(findStr + " is appeared at " + str.indexOf(findStr));
    }

    public void findAnyCaseString(String str, String findStr){
        System.out.println(findStr + " is appeared at " + str.toLowerCase().indexOf(findStr));
    }

    public void countChar(String str, char c){
        int count = 0;
        for(char v : str.toCharArray()){
            if(v == c){
                count++;
            }
        }
        System.out.println("char 's' count is "+count);
    }

    public void printContainWords(String str, String findStr){
        String[] arr = str.split(" ");
        for(String val : arr){
            if(val.contains(findStr)){
                System.out.println(val + " contains " + findStr);
                break;
            }
        }
    }
}
