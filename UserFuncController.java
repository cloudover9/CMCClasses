import java.util.ArrayList;
/*
 * File: UserFuncController.java
 */

/**
 * Controlls functions for the general user 
 * @author Will Haanen
 * @version February 24, 2018
 */

public class UserFuncController
{
  private DBController db;
  private GeneralUser gu;
  
  public UserFuncController(GeneralUser newUser)
  {
    gu = newUser;
    db = new DBController();
  }
  /*
   * Gets the list of saved schools for a specific general user
   * 
   * @return The list of saved schools
   */
  public ArrayList<University> getSavedSchools()
  {
    return this.getSavedSchools(); 
  }
  
//  /*
//   * Creates a list of recomended schools relevent to a specific university
//   * 
//   * @param university the university that a list of recomended schools will be created for
//   * 
//   * @return The list of reccomended schools 
//   */
//  public ArrayList<University> recSearch(University university)
//  {
//   return null;
//  }
  
  /*
   * Adds a school to the users saved school list
   * 
   * @param university the school to be added to the list
   */
  public void saveToSavedSchoolList(University university)
  {
    db.addSchoolToUserList(gu,university);
  }
  
  /*
   * Removes a specific university from the users saved schools list
   * 
   * @param university the school to be removed from the list
   */
  public void removeSavedSchool(University university)
  {
    
  }
  
  /*
   * Saves changes made to a profile by a user
   * 
   * @param password users password
   * @param firstName users first name
   * @param lastName users last name
   */
  public void submitProfileChanges(String password, String firstName, String lastName)
  {
    gu.setPassword(password);
    gu.setFirstName(firstName);
    gu.setLastName(lastName);
    db.updateAccount(gu); 
  }
  
}