import java.util.Scanner;
/*
 * File:CMCDriver.java
 */
import java.util.*;
/**
 * The main class for the CMC project
 * @author Ian Bush
 * @version February 25, 2018
 */
public class CMCDriver
{
  public static void main(String [] args)
  {
<<<<<<< HEAD
    Scanner sc = new Scanner(System.in);
    String username = sc.next("Enter a username");
    String password = sc.next("Enter the password");
    new AccountController().login(args[0], args[1]);
=======
    System.out.println("Welcome to CMC");
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your username");
    String u = sc.next();
    System.out.println("Now enter your password");
    String p = sc.next();
    new AccountInterface().login(u, p);
>>>>>>> d28dc909ca353fa30e549b2624d394f18cf1c370
  }
}