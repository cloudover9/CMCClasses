/*
 * File: Admin.java
 */

/**
 * Creates an admin 
 * @author Will Haanen
 * @version February 24, 2018
 */

public class Admin extends Account
{
  
  /*
   * Creates an account whose type is Admin
   * 
   * @param username the username of the admin
   * @param password the password of the admin
   * @param active the status of the admin
   * @param firstName the first name of the admin
   * @param lastName the last name of the admin
   */
  
    public Admin(String username, String password, char active, String firstName, String lastName)
  {
    this.setUsername(username);
    this.setPassword(password);
    this.setActive(active);
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setType('a');
  }
}