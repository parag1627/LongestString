package org.example;

public class Main {
    public static void main(String[] args) {
        String str = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using 'Content here, content here', making it look like readable English";

        String ans = findLongestWord(str);
        System.out.println("Longest word is :"+ ans);
    }

    public static String findLongestWord(String str){
        String[] words = str.split("\\s+");
        String longestWord=  "";
         for(String word : words){
             if(word.length() >longestWord.length()){
                 longestWord = word;
             }

         }

        return longestWord;
    }

}

//    Create a function to return the longest word in a string.
//        Input: “dummy text of the printing and typesetting industry.”
//        Output: typesetting
//        Input: “It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using 'Content here, content here', making it look like readable English”
//        Output: distributionqqqqqqqqqqqqqqqqqqq