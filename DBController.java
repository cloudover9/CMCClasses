import java.util.ArrayList;
/*
 * File:DBController.java
 */

/**
 * Performs all the messy work needed for accessing and modifiying the databse
 * @author Ian Bush
 * @version February 22, 2018
 */
public class DBController
{
  /**
   * Constructor
   */
  public DBController()
  {
  }
  
  /**
   * Returns the list of all universities in the database
   * @return all of the universities in the system
   */
  public ArrayList<University> getUniversities()
  {
    return null;
  }
  
  /**
   * Returns a list of all users in the databse
   * @return all of the users in the system
   */
  public ArrayList<String> getAccounts()
  {
    return null;
  }
  
  /**
   * Finds the user in the database with the matching username
   * return: the account with the matching username
   * @param usr the username of the specific user
   */
  public void getUser(String usr)
  {
    //method is stated as void rather than Account, as Account has not been created yet
  }
  
  /**
   * Adds the specified university to the school list of the specified user
   * post: the University will be added to the user's school list
   * @param usr the User whose list will now include the selected university
   * @param univ the University which will be added to the User's school list
   */
  public void addSchoolToUserList(String usr, University univ)
  {
    //it will be a GeneralUser, not String
  }
  
  /** 
    * Adds a new university to the database
    * post: a new University will be added to the database 
    * @univ the University to add to the database
    */
  public void addNewUniversity(University univ)
  {
  }
  
  /**
   * Adds a new account to the database
   * post: a new Account will add to the database
   * @param acc the account to add to the database
   */
  public void addAccount(String acc)
  {
  }
  
  /**
   * Modifies an account
   * @param acc the account to modify
   */
  public void updateAccount(String acc)
  {
  }
  
  /**
   * Modifies a univeristy
   * @param univ the University to modify
   */
  public void updateUniversity(University univ)
  {
  }
}