/** 
  * File: GeneralUser.java
  */

import java.util.*; //Java's ArrayList<ET>
//package cmcclasses

/**
 * GeneralUser is a class that is extends Account.
 *
 * @author  Nimco Hussein
 * @version February 22, 2018
 */
public class GeneralUser extends Account
{

  
  /** A constructor that creates a GeneralUser object
  * @param String firstName
  * @param String  lastName
  * @param Boolean  active
  * @param Char     type
  * @param String   password
  */
  public GeneralUser(String firstName, String lastName, boolean active,char type, String password)
  {
    super.setFirstName(firstName);
    super.setLastName(lastName);
    super.setActive(active);
    super.setType(type);
    super.setPassword(password);
  }
  
  /** Returns the list of saved schools 
  * @return ArrayList<String>   list of saved schools of a General User
  */ 
  public ArrayList<String> getSavedSchools()
  {
    return null;
  }
  
}