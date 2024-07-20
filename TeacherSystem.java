  // WRITE A JAVA CODE THAT WILL ALLOW THE TEACHER TO INSERT OR 
  // ENTER MARKS AND DISPLAYES OUT THE LEVEL/// E.G OUTSTANDING ACHIEVEMENT

import java.util.Scanner;

public class TeacherSystem{
    
     public static void main(String[] args){
        
      Scanner input = new Scanner(System.in);
        
       System.out.println("WELCOME TEACHER");
       System.out.println("Enter Marks to display the level of the Achievement");
       int value = input.nextInt();

        if(value >= 0 && value <=29){
          System.out.println("Not Achieved");

        }
      
         else
         if(value >= 30 && value <= 39){
          System.out.println("Elementary Achievement");

        }
        else
        if(value >= 40 && value <=49){
          System.out.println("Moderate Achievement");

        }

        else
        if(value >= 50 && value <= 59){
          System.out.println("Adequate Achievement");

        }

        else
        if(value >= 60 && value <= 69){
          System.out.println("Substantial Achievement");

        }

        else
        if(value >= 70 && value <= 79){
          System.out.println("Maritorious Achievement");

        }

         else
        if(value >= 80 && value <= 100){
          System.out.println("Outstanding Achievement");

        }

     }
     
  
  }