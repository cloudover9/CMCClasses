/** 
 * File: AccountController.java
 */
import java.util.*;  //Java's ArrayList<ET>




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
    * @param username entered username of user attempting to login
    * @param password entered password of user attempting to login
    * 
    * @return true if user was logged in false if they were not
    */ 
  public boolean login(String username, String password)
  {
    // find a user in the database   
    DBController db =  new DBController();
    Account matchedUser = db.getUser(username);  
    
    // check if the matchedUser is a dummy user, if it is do not CONTINUE
    if(matchedUser.getUsername() == "DummyUser")
    { 
      //The user name and password associated with this account is not registered 
      System.out.println("Error: The username is not registered ");
      return false;
    }
    else if(matchedUser.getPassword() != password)
    {
      //print the username and password do not match an an asociated account
      System.out.println("Error: The username and password do not match");
      return false;
    }
    else { 
      
      this.account = matchedUser;  
      char type = account.getType(); // get the type assocated with this acount 
      
      if(type == 'a') 
      {
        new AdminInterface().homepage(); 
        return true;
      }
      else if(type == 'u')
      {
        new UserInterface().homePage();  
        return true;
      }
      else
      {
        System.out.println("Error: There is something wrong with the account in the database. Please try again.");
        return false;
      }
    }
    
  }
  
  /** The logout method will set the status to false;
    */ 
  public void logout() 
  {
    this.account = null;  
  } 
  /** Reset method will be further implemented using JAVA GUI
    */  
  public void reset()
  {
  } 
  
}