package com.automationsession.Jun2;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {

        System.out.println("Enter your obtained marks in Math, English and Science ");
        Scanner scanner = new Scanner(System.in);
        double mathScore  = scanner.nextDouble();
        double englishScore = scanner.nextDouble();
        double scienceScore = scanner.nextDouble();
        double totalScore = 300;
        double obtainedScore = mathScore + englishScore + scienceScore;
        double percentage = (obtainedScore/totalScore)*100;

        if(percentage >= 80){
            System.out.println("You obtained grade A");
        }else{

            if(percentage >= 60 && percentage < 80){
                System.out.println("You obtained grade B");
            }else{
                if(percentage >= 40 && percentage < 60) {
                    System.out.println("You obtained grade C");
                }else{
                    System.out.println("Fail");
                }
            }

        }
        System.out.println("Your total score is : "+obtainedScore);
        System.out.println("Your percentahe is : "+percentage);
        scanner.close();
    }
}
