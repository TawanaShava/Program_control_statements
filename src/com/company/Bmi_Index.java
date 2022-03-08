package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bmi_Index {
    public static void main(String[] args) throws IOException{

        float heightTawana , weightTawana, bmiTawana;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The Program will calculate your BMI");
        System.out.println("Enter your height in cm (and press Enter): ");
        heightTawana = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight in kg (and press Enter): ");
        weightTawana = Float.parseFloat(br.readLine());

        bmiTawana = (float) (weightTawana / (Math.pow(heightTawana, 2)));
        System.out.printf("Your BMI is: " + "%2.2f,  \n", bmiTawana);


        if (bmiTawana < 16){
            System.out.println("You are slim/skinny/suffering from starvation");
        } else if ((bmiTawana >= 16)&&(bmiTawana < 16.99)){
            System.out.println("You're emaciated");
        }else if ((bmiTawana >= 17)&&(bmiTawana < 18.49)){
            System.out.println("You're underweight");
        }else if ((bmiTawana >= 18.50)&&(bmiTawana < 22.99)){
            System.out.println("You're in a low range or the norm");
        }else if ((bmiTawana >= 23)&&(bmiTawana < 24.99)){
            System.out.println("You're in the high range of the norm");
        }else if ((bmiTawana >= 25)&&(bmiTawana < 27.49)){
            System.out.println("You're overweight ot pre-obese");
        }else if ((bmiTawana >= 27.50)&&(bmiTawana < 29.99)){
            System.out.println("You're overweight");
        }else if ((bmiTawana >= 30)&&(bmiTawana < 34.99)){
            System.out.println("You've 1st degree obesity");
        }else if ((bmiTawana >= 35)&&(bmiTawana < 39.99)){
            System.out.println("You've 2nd degree obesity");
        }else if ((bmiTawana > 40)){
            System.out.println("You've 3rd degree obesity");
        }








    }

}
