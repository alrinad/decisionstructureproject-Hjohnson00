/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch2;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author johnshun
 */
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //input for decision
        Scanner db = new Scanner(System.in);
          out.println("You find a bottle on the ground what do you do with it,"
                  + " drink it, leave it there, or yeet it?");
            String decision = db.nextLine();
            String response;
            
            
            switch(decision){
                case "drink it": 
                    response = "Congrats you died of poison";
                    break;
                case "leave it there": 
                    response = "Really? Why is your life so boring?";
                    break;
                case "yeet it":
                    response = "You yeet the bottle leading to you getting a "
                            + "overload of confidence for the rest of your life";
                    break;
                default: 
                    response = "Thats a invalid input, type drink it, leave it "
                            + "there, or yeet it.";
                    break;
            }
                 
        out.println(response);
            }
    }
    

