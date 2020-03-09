/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infprojekt;

/**
 *
 * @author fv0544
 */
public class Utils {
   public static int parseInt(String number){
    try {
      return Integer.parseInt(number);
    } catch(NumberFormatException e){
      e.printStackTrace();
      return -1;
    }
  } 
}
