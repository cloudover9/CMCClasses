/* 
 * File: SearchController.java
 * Description: This class displays the UI and take all user's commands
 * before passing them to the Controller
 * 
 * @author Karld Bai
 * @version Feb 22 2018
 */
import java.util.*;
public class UserInterface{
<<<<<<< HEAD
  private GeneralUser user;
  private UserFuncController ufc;
  private SearchController sc;
  
  
=======
>>>>>>> 2582d9fb58b6d0c170f3f4bc6683ca8fefddf2fc
  /**
   * redirects the user to the homepage
   */
  public void homePage(){
    
  }
  /**
   * takes the view details command and displays the details
   */
<<<<<<< HEAD
  public void viewSchoolDetailsAndTop5(University u){
=======
  public void viewSchoolDetailsAndTop5(){
>>>>>>> 2582d9fb58b6d0c170f3f4bc6683ca8fefddf2fc
    
  }
  /**
   * takes the view saved school command and displays the saved school list
   */
  public void viewSavedSchools(){
    
  }
  /**
   * takes the view saved school details command and displays the details
   */
  public void viewSavedSchoolDetails(University u){
    
  }
  /**
   * 
   */
  public boolean isEmpty(){
  
    return true;
  }
  /**
   * takes the view profile command and displays the profile of the user
   */
  public void viewProfile(){
    
  }
  /**
   * takes the edit file command and redirect the user to the edit page
   */
  public void editProfile(){
    
  }
  /**
   * redirect the user to the homepage and save the changes
   */
  public void submitProfileChanges(){
    
  }
  /**
   * takes the search command and shows the result
   */
<<<<<<< HEAD
  public Collection searchForShools(String schoolName, String state, String location, String control,int studentsLow,
                                      int studentsHigh, int femPercLow, int femPercHigh, int satVLow, int satVHigh, 
                                      int satMLow, int sayMHigh, int costLow, int costHigh, int finAidPercLow, int finAidPercHigh,
                                      int applicantsLow, int applicantsHigh, int admittedLow, int admittedHigh, 
                                      int enrolledLow, int enrolledHigh, int acadScaleLow, int acadScaleHigh, int socLifeScaleLow,
                                      int socLifeScaleHigh, int qualLifeScaleLow, int qualLifeScaleHigh, 
                                      ArrayList<String> emphases){
    
    
=======
  public Collection searchForShools(String schoolName, String state, String location, String control,int students, 
                                      int femPerc, int satM, int cost, int finAidPerc, int applicants, int admitted, 
                                      int enrolled, int acadScale,int socLifeScale, int qualLifeScale, 
                                      String[] emphases){
>>>>>>> 2582d9fb58b6d0c170f3f4bc6683ca8fefddf2fc
    return null;
  }
  /**
   * displays the result of searching
   */
  public void viewSearchedSchools(Collection c){
    
  }
  /*
   *  takes the save to list command and add the school to the saved school list 
   */
  public void saveToSavedSchoolList(University u){
    
  }
  /*
   * removes the selected school
   */
  public void removeSavedSchool(University u){
    
  }
  
<<<<<<< HEAD
}

//para for copy: String schoolName, String state, String location, String control,int students, int femPerc, int satM, int cost, int finAidPerc, int applicants, int admitted, ArrayList<String> emphases
=======
}
>>>>>>> 2582d9fb58b6d0c170f3f4bc6683ca8fefddf2fc
