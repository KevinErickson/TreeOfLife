/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.control;

/**
 *
 * @author Erickson
 */
public class RankControl {
    
    public boolean  salvationEligible(double value, double thresholdValue){
      if (value >= thresholdValue ) {
        return true;
    }
      return false; 
    }     
   
    public boolean  faithEligible(double value, double thresholdValue){
      if (value >= thresholdValue ) {
        return true;
    }
      return false; 
    } 
    
    public boolean  spiritEligible(double value, double thresholdValue){
      if (value >= thresholdValue ) {
        return true;
    }
      return false; 
    } 
    
    public boolean  rightEligible(double value, double thresholdValue){
      if (value >= thresholdValue ) {
        return true;
    }
      return false; 
    } 
}        
        
        
 
      
    

    
