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
    new AccountController().login(args[0], args[1]);
  }
}