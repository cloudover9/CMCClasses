/*
 * File: AccountInterface.java
 */
 
/** 
 * The class used for logging into CMC
 * 
 * @author Ian Bush
 * @version February 22, 2018
 */
public class AccountInterface
{
  /**
   * Logs a specific user into the system
   * pre: the user is a registered and active user in the system
   * post: the user is logged into the system
   * 
   * @param usr The username of the user
   * @param pass The password of the user
   */
  public void login(String usr, String pass)
  {
  }
  
  /**
   * Logs the user out of CMC
   * pre: the user is already logged into the system
   * post: the user will be logged out of the system
   * 
   */
  public void logout()
  {
  }
}