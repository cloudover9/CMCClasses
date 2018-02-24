/**
 * File: AdminFuncController
 * 
 * Description: A controller class that takes care of the "messy" parts of the CMC program for admins
 * 
 * @author Sara Laufers
 * @version February 24, 2018
 */

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
  public AdminFuncController(String username, String password, boolean active, String firstName, String lastName, char type){
    this.admin = new Admin(username, password, active, firstName, lastName, type);
  }
  
  // ================================= METHODS =================================
  /**
   * Adds a user account
   */
  public void addAccount(){
  }
  
  /**
   * View a list of users; opens up a page of users
   */
  public void viewUsers(){
  }
  
  /**
   * Save changes made to an account
   * 
   * @param account the account of the user
   */
  public void saveAccountChanges(Account account){
  }
  
  /**
   * Delete a university
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
  }
  
  /**
   * Adds a University
   * 
   * @param univ the University
   */
  public void addUniversity(University univ){
    
  }
}