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
  public static String loadFileAsString(String path){
  StringBuilder builder = new StringBuilder();

  //Get file from resources folder
  FileReader file = null;
  try {
    file = new FileReader(Utils.class.getClass().getResource(path).getFile());
  } catch (FileNotFoundException e1) {
    e1.printStackTrace();
  }
  if(file != null) {
    try {
      BufferedReader br = new BufferedReader(file);
      String line;
      while((line = br.readLine()) != null) {
        builder.append(line + "\n");
      }
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
  return builder.toString();
} 
   
   
}
