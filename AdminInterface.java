import dblibrary.project.csci230.*;
/*
 * File:AdminInterface.java
 */

/**
 * All the functionalities which the admin should be able to do
 * @author Ian Bush
 * @version February 22, 2018
 */
public class AdminInterface
{
  private AdminFuncController ad;
  
  /**
   * Constructor for the AdminInterface
   */
  public AdminInterface()
  {
    this.ad = new AdminFuncController();
  }
  
  /**
   * Shows a list of all universities in the system
   */
  public void viewUniversities()
  {
    //ad.viewUniversities();
  }
  
  /**
   * Shows a list of all users in the system (both general and admin)
   */
  public void viewUsers()
  {
    ad.viewUsers();
  }
  
  /**
   * Modifies a university
   * 
   * @param univ The University to modify
   */
  public void editUniversity(University univ)
  {
   
  }
  
  /**
   * Adds a university to the database
   */
  public void addUniversity(University u)
  {
    ad.addUniversity(u);
  }
  
  /**
   * Adds an account to the database
   */
  public void addAccount()
  {
  }
  
  /**
   * Modifies a user
   * @param usr the user to modify
   */
  public void editUser(Account usr)
  {
    
  }
  
  /**
   * Deactivates a user
   * post: the user will be deactivated, and no longer able to access the system
   * @param usr the user to deactivate
   */
  public void deactivate(Account usr)
  {
    
  }
  
  /**
   * Brings the admin to their homepage
   */
  public void homepage()
  {
    System.out.println("Welcome to the Admin Homepage:");
    System.out.println("\nType 1 to Manage Universities");
    System.out.println("Type 2 to Manage Users");
    System.out.println("Type 3 to Logout");
    
  }
}