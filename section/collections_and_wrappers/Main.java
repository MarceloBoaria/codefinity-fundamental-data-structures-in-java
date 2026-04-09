package com.example;

public class Main {
    public static String upgrade_comparing(Integer left_value, Integer right_value) { 
        int comparingResult = left_value.compareTo(right_value);
        String result = "";
        switch (comparingResult) {
            case -1:
                result = "The right value is greater";
                break;
            case 0:
                result = "The values are equal";
                break;
            case 1:
                result = "The left value is greater";
                break;
            default:
                System.out.println("Error");
        }
        return result;
    }
    
    public static void main(String[] args) {
        Integer left_value = 15;
        Integer right_value = 13;

        System.out.println(upgrade_comparing(left_value, right_value));
    }
}