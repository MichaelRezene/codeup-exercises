package com.codeup;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter something: ");
        String line = input.nextLine();

        if (StringUtils.isNumeric(line)){
            System.out.println(line + "Is a number");
        }else {
            System.out.println(line + " is not a number");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(line));
        System.out.println("Reversed: " + StringUtils.reverse(line));

    }
}
