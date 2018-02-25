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
  
  /**A constructor that creates an AccountController object 
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
    // find a user in the database   
    DBController db =  new DBController();
    Account matchedUser = db.getUser(username);  
    
    
    if(matchedUser.getUsername() == username && matchedUser.getPassword() == password)
    {
      char type = matchedUser.getType(); // get the type assocated with this acount 
      
      if(type == 'u') // also create an interface 
      {
      this.account = new GeneralUser(matchedUser.getFirstName(), matchedUser.getLastName(),matchedUser.getActive(), matchedUser.getUsername(),matchedUser.getPassword());
      
      }
      else if(type == 'a')
      {
       this.account = new Admin(matchedUser.getUsername(), matchedUser.getPassword(),matchedUser.getActive(),matchedUser.getFirstName(), matchedUser.getLastName());  
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