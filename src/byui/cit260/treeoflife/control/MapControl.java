/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.control;

import byui.cit260.treeoflife.model.Map;

/**
 *
 * @author Erickson
 */
public class MapControl {

   public static Map createMap() {
       System.out.println("*** called createMap() ***");
       return null;
    }

    public static void moveCharactersToStartingLocation(Map map) {
        System.out.println("*** called moveActorsToStartingLocation() ***");
    }
    
    public static class MapControlException extends Exception {

     public MapControlException() {
  }
  }
    
}
