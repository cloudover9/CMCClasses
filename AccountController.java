/** 
  * File: AccountController.java
  */
import java.util.*;  //Java's ArrayList<ET>
 
//package cmcclasses

 
/**
 * AccountController is a class that is controlled by Admin and GeneralUser. 
 * The purpose of this class is to validate the login information when a GeneralUser or Admin logs in.
 * 
 *
 * @author  Nimco Hussein
 * @version February 22, 2018
 */
public class AccountController  
{
  private Account account;
  
  /**Log in method takes username and pssword and return true or false, if the information belongs to an account 
   * @param String    username
   * @param String    password
   * 
   * @return boolean  true or false
   */ 
  public boolean login(String username, String password)
  {
    
    if(account.getUsername() == username && account.getPassword() == password)
    {
      return true;
    }
    else
    {
      return false;
    }
       
  }
  
  /** GUIIII IMPLEMENTAITON
  */ 
  public void logout() 
  {
    
  }
  
  /** GUIIIII IMPLEMENTATION
   */  
  public void reset()
  {
    
  } 
  
}