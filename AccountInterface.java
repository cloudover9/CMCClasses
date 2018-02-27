import dblibrary.project.csci230.*;
import java.util.Scanner;
/*
 * File:AccountInterface.java
 */

/**
 * The starting terminal in which the user will log into the system
 * @author Ian Bush
 * @version February 23, 2018
 */
public class AccountInterface
{
  private AccountController ac;
  
  /**
   * Constructor 
   */
  public AccountInterface()
  {
    ac = new AccountController();
  }
  
  /**
   * Logs the user in
   * @usr the username of the user
   * @pass the password of the user
   */
  public void login(String usr, String password)
  {
    if (ac.login(usr, password) == true)
    {
      System.out.println("Login successful");
    }
    else
    {
      System.out.println("Please try again");
      this.start();
    }
  }
  
  /**
   * Logs the user out of the system
   * 
   */
  public void logout()
  {
    ac.logout();
    System.out.println("You have been logged out of the system");
  }
  
  /**
   * Resets any fields
   */
  public void reset()
  {
  }
  
  /**
   * Starting point for the user
   */
  public void start()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your username");
    String u = sc.next();
    System.out.println("Now enter your password");
    String p = sc.next();
    this.login(u,p);
  }
}