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
  
  /**A contrusctor that creates an AccountController object 
   */
  public AccountController()
  {
     
  }
  
  /**Log in method takes username and pssword and return true or false, if the information belongs to an account
   * If the credentials that are added are verified, then based on the type a GeneralUser or Admin object 
   * will be created
   * 
   * @param String    username
   * @param String    password
   * 
   * @return boolean  true or false
   */ 
  public boolean login(String username, String password)
  {
    
    if(account.getUsername() == username && account.getPassword() == password)
    {
      char type = account.getType(); // get the type 
      
      if(type == 'u')
      {
      Account user = new GeneralUser(account.getFirstName(), account.getLastName(),account.getActive(), account.getType(),account.getPassword());
      
      }
      else if(type == 'a')
      {
       Account admin = new Admin(account.getUsername(), account.getPassword(),account.getActive(),account.getFirstName(), account.getLastName());  
      }
      return true; 
    }
    else
    {
      return false;
    }   
  }
  
  /** The logout method will set the accounts to null. 
  */ 
  public void logout() 
  {
     this.account = null;
    
  }
  
  /** GUIIIII IMPLEMENTATION
   */  
  public void reset()
  {
    
  } 
  
}