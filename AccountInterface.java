import dblibrary.project.csci230.*;
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
  public AccountInterface()
  {
  }
  
  /**
   * Logs the user in
   * @usr the username of the user
   * @pass the password of the user
   * @return a boolean indicating whether the login was successful
   */
  public boolean login(String usr, String password)
  {
    return true;
  }
  
  /**
   * Logs the user out of the system
   * 
   */
  public void logout()
  {
  }
  
  /**
   * Resets any fields
   */
  public void reset()
  {
  }
}