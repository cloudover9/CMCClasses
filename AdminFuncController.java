/**
 * File: AdminFuncController
 * 
 * Description: A controller class that takes care of the "messy" parts of the CMC program for admins
 * 
 * @author Sara Laufers
 * @version February 24, 2018
 */

import java.util.*;

public class AdminFuncController{
  
  // ================================= INSTANCE VARIABLES =================================
  /** An Admin class named admin */
  private Admin admin;
  
  // ================================= CONSTRUCTORS =================================
  /**
   * Constructs a AdminFuncController which initializes several properties of an Admin
   * 
   * @param username  the name of the admin
   * @param password  the admin's password
   * @param active    the condition of whether the admin is activated or deactivated
   * @param firstName the first name of the admin
   * @param lastName  the last name of the admin
   * @param type      the type of user (in this case it is an admin 'a')
   */
  public AdminFuncController(String username, String password, char active, String firstName, String lastName, char type){
    this.admin = new Admin(username, password, active, firstName, lastName, type);
  }
  
  // ================================= METHODS =================================
  /**
   * Adds a new user account into the Database
   * Note: The active property should be true inside the information list
   * 
   * @param information a list of a user's properties including one that determines if the user is an admin or a general user (type)
   */
  public void addAccount(ArrayList<String> information){ // DONE I THINK!!!!!!!!!!!!!!!
    DBController dbc = new DBController();
    char type = information.get(5).charAt(0);
    if(type == 'a'){
      // new Admin(username, password, active, firstName, lastName, type)
      Admin ad = new Admin( information.get(0),  information.get(1),  information.get(2).charAt(0),  information.get(3),  information.get(4),  type);
      dbc.addAccount(ad);
    }
    else if(type == 'u'){
      // new GeneralUser( firstName, lastName, active, type, password)
      GeneralUser gu = new GeneralUser( information.get(3),  information.get(4),  information.get(2).charAt(0), type,  information.get(1));
      dbc.addAccount(gu);
    }
  }
  
  /**
   * View a list of users; opens up a page of users
   */
  public void viewUsers(){ // NEEDS WORKING ON!!!!!
    // Wait for GUI Implementation
    // Idea: could use the getAccounts() in DBController
    DBController dbc = new DBController();
    ArrayList<String> accountList = dbc.getAccounts();
  }
  
  /**
   * Accesses the Database and saves changes made to an account
   * 
   * @param account the account of the user
   */
  public void saveAccountChanges(Account account){
    DBController dbc = new DBController();
    dbc.updateAccount(account);
  }
  
  /**
   * Deletes a university
   * 
   * @param univ the university to be deleted
   */
  public void delete(University univ){
  }
  
  /**
   * Save changes made to a university
   * 
   * @param univ the university
   */
  public void saveUnivChanges(University univ){
    DBController dbc = new DBController();
    dbc.updateUniversity(univ);
  }
  
  /**
   * Adds a University
   * 
   * @param univ the University
   */
  public void addUniversity(University univ){
    DBController dbc = new DBController();
    dbc.addNewUniversity(univ);
  }
}