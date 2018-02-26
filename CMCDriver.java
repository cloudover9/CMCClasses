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
    Scanner sc = new Scanner(System.in);
    String username = sc.next("Enter a username");
    String password = sc.next("Enter the password");
    new AccountController().login(args[0], args[1]);
  }
}