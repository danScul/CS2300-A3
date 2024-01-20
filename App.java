import java.util.Scanner;

public class App{

    public static void main(String[] args) throws Exception{
        
        
        System.out.println("Please select a conversion to perform or enter '-1' to end the program."); //prompts user for input
        //print options (with numbers, use num for choosing options)
        System.out.println("1- Millimeters => Feet");
        System.out.println("2- Centimeters => Feet");
        System.out.println("3- Meters => Feet");
        System.out.println("4- Kilometers => Feet");
        
        Scanner sc = new Scanner(System.in);//create a new scannner
        
        int choice = 0;

        do{
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a valid input.");
            }
            
           
            if(choice < 0 || choice > 4) //if the user enters a invalid number, reprompt... 
                System.out.println("Please enter a valid option.");
        }while(choice < 0 || choice > 4);//...and loop
        
        double input = 0; //var to catch the num they want to convert && kill on -1
        
        do{
            System.out.println("Please enter the number you want to convert or enter '-1' to change your conversion: ");
            input = sc.nextDouble();
            if(input == -1)//kill if input -1;
                break;
            else if(choice == 1){
                System.out.println(input + " milimeters converted to feet is " + (input * .00328084) + " feet");
            }
            else if(choice == 2){
                System.out.println(input + " centimeters converted to feet is " + (input * .0328084) + " feet");
            }
            else if(choice == 3){
                System.out.println(input + " meters converted to feet is " + (input * 3.28084) + " feet");
            }
            else if(choice == 4){
                System.out.println(input + " kilometers converted to feet is " + (input * 3280.84) + " feet");
            }
            else{
                System.out.println("Please enter a valid input.");
            }
        }while(input != -1);
            sc.close();
        

        
        
    }
 
}