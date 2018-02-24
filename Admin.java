
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
   */
  
    public Admin(String username, String password, boolean active, String firstName, String lastName, char type)
  {
    this.setUsername(username);
    this.setPassword(password);
    this.setActive(active);
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setType(type);
  }
}