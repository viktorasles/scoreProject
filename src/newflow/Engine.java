/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newflow;

import java.util.ArrayList;

/**
 *
 * @author vikto_000
 */
public class Engine {
    

    
    
    //Atribute
    private ArrayList<Person> enginePersonList;
    //Contstructor to start up the program
    public Engine(){
        enginePersonList = new ArrayList<Person>();
        loadPeopleFromFile();        
    }
    
    private void loadPeopleFromFile(){
        
        ArrayList<String> stringPersonList =  FileHandler.load("people.txt");
        for (String stringPerson : stringPersonList) {
            Person tempPerson = new Person( stringPerson );
            enginePersonList.add(tempPerson);
        }   
    }
    
    public ArrayList<Person> giveMeAllPeopleList( ){
        loadPeopleFromFile();
        return enginePersonList;
    }
    
    
    public void createNewPerson( String name, int adminScore, int analScore,
                int creatScore, int finScore){
        
        Person p = new Person(name, adminScore, analScore, creatScore, finScore);
        //Adding to the list:
        enginePersonList.add(p);
        
        
    }
    
   public String getSelectedPerson_stats( String selected ){
        String result = "EMPTY";
        //I have name comin in = selected    BOB
        //1) Run through my enginePersonList and find selected (bob)
        for (Person tempPerson : enginePersonList) {
             if( tempPerson.getName().equals( selected ) ){ //THEN I have found the person object im looking for
                 //2) Pick out the person                 
                 //3) Make a nice string to send to GUI
               
                 result = tempPerson.getNiceGuiString();
             }
        }       
        return result;
    }
    
    
    
}
