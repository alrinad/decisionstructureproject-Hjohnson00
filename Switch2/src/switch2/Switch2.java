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
          out.println("You find a bottle on the ground,"
                  + " Drink it? Leave it there? or YEET it?");
            String decision = db.nextLine();
            String response;
            
            //switch statement
            switch(decision){
                case "drink it": 
                    response = "Congrats you died of poison";
                    break;
                case "leave it there": 
                    response = "Really? Why is your life so boring?";
                    break;
                case "YEET it":
                    response = "You YEET the bottle leading to you getting a "
                            + "overload of confidence for the rest of your life";
                    break;
                default: 
                    response = "Invaled, type drink it, leave it "
                            + "there, or YEET it.";
                    break;
            }
                 
        out.println(response);
            }
    }
    

