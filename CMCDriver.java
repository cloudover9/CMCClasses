import java.util.Scanner;
/*
 * File:CMCDriver.java
 */

/**
 * The main class for the CMC project
 * @author Ian Bush
 * @version February 25, 2018
 */
public class CMCDriver
{
  public static void main(String [] args)
  {
    System.out.println("Welcome to CMC");
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your username");
    String u = sc.next();
    System.out.println("Now enter your password");
    String p = sc.next();
    new AccountInterface().login(u, p);
  }
}