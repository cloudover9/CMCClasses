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
//    String username = System.in("Enter a username");
//    String password = System.in("Enter the password");
    new AccountController().login(args[0], args[1]);
  }
}