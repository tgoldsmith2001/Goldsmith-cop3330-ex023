/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans;
        System.out.print("Is the car silent when you turn the key? ");
        ans=input.next();
        if(ans.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            ans=input.next();
            if(ans.equals("y")){
                System.out.println("Clean terminals and try starting again");
            }else{
                System.out.println("Replace cables and try again");
            }
        }else{
            System.out.print("Does the car make a slicking noise? ");
            ans=input.next();
            if(ans.equals("y")){
                System.out.println("Replace the battery");
            }else{
                System.out.print("Does the car crank up then fail to start? ");
                ans=input.next();
                if(ans.equals("y")){
                    System.out.println("Check spark plug connections");
                }else{
                    System.out.print("Does the engine start and then die? ");
                    ans=input.next();
                    if(ans.equals("y")){
                        System.out.print("Does your car have fuel injection? ");
                        ans=input.next();
                        if(ans.equals("y")){
                            System.out.println("Get it in for service");
                        }else{
                            System.out.println("Check to ensure the choke is opening and closing");
                        }
                    }else{
                        System.out.println("This should not be possible");
                    }
                }
            }
        }
    }
}