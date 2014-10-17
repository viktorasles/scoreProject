/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newflow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vikto_000
 */
public class FileHandler {

    public static ArrayList<String> load(String filename) {
        Scanner file_scanner = null;
        ArrayList<String> stringArray = new ArrayList<String>();

        try {
            file_scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException ex) {
            System.out.println(filename + "does not exist");
            ex.printStackTrace();
            return null;
        }

        while (file_scanner.hasNextLine()) {
            stringArray.add(file_scanner.nextLine());
        }

        file_scanner.close();
        return stringArray;
    }

    public static boolean savePerson(ArrayList<String> stringArray, String filename) {
        if (stringArray == null) {
            return false;
        }
        

        try {

            FileWriter fw = new FileWriter(filename, true); //the true will append the new data 
            for (String personline : stringArray) {   //running through the ArrayList.                    
                fw.write(personline + "\n");//appends the string to the file
                fw.close();
            }

        } catch (Exception ex) {  
            System.out.println("Could not save to file!");
            System.out.println(ex.toString());
            ex.printStackTrace();
            return false;  //If something goes wrong false is returned!
        }

        return true;
    }
    
    
    

}
