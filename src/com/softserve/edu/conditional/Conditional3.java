//package com.softserve.edu.conditional;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Conditional3 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter HTTP error number: ");
//        String input = bufferedReader.readLine();
//        switch (input.toLowerCase()){
//            case "400":
//                System.out.println("400 Bad Request");
//                break;
//            case "401":
//                System.out.println("401 Unauthorized");
//                break;
//            case "402":
//                System.out.println("402 Payment Required");
//                break;
//            default:
//                System.out.println("there is no information about this error");
//        }
//
//    }
//}
