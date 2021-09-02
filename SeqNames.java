package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String name= input.nextLine();
        StringBuilder output = new StringBuilder();
        int size = name.length();
        output.append(name.charAt(0));

        for ( int i=1; i<size; i++){
            if(name.charAt(i)!= name.charAt(i-1)){

                output.append(name.charAt(i));

            }
        }
        System.out.println(output);
    }
}
