/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newflow;

/**
 *
 * @author vikto_000
 */
public class Person {
    
    private String name;
    private int admin;
    private int finisher;
    private int analyst;
    private int creative;

    
    @Override
    public String toString()
    {
        return name + "," + admin + "," + finisher + "," + analyst + "," + creative ;
    }   
    
    public Person( String specialPeopleString ) {        
        String[] splited = specialPeopleString.split(",");
        name = splited[0]; //"Bob"
        admin = Integer.parseInt( splited[1] ); 
        finisher = Integer.parseInt( splited[2] ); 
        analyst = Integer.parseInt( splited[3] ); 
        creative = Integer.parseInt( splited[4] ); 
    }
    
    public Person(String name, int admin, int finisher, int analyst, int creative)
    {
        this.name = name;
        this.admin = admin;
        this.finisher = finisher;
        this.analyst = analyst;
        this.creative = creative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public int getFinisher() {
        return finisher;
    }

    public void setFinisher(int finisher) {
        this.finisher = finisher;
    }

    public int getAnalyst() {
        return analyst;
    }

    public void setAnalyst(int analyst) {
        this.analyst = analyst;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    
  
    public String getNiceGuiString()
    {
        return "\nAdministrator: " + admin + "\n\nAnalyst: " + analyst + "\n\nCreative: " + creative + "\n\nFinisher: " + finisher; 
    }
    
}
