/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catchasesmouse_1;

/**
 *
 * @author George.Pasparakis
 */
public class Animal {
    private String type = "animal";
    private String name;

    Animal() {
        System.out.println("This is a " + type);
    }
    
    Animal(String name) {
        this.name = name;
        System.out.println("This is " + type + ": " + this.name);
    }
    
    Animal(String name, House aHouse) {
        this.name = name;
        System.out.println("This is " + type + ": " + this.name 
                 + " inside a " + aHouse.getType() + " called, " + aHouse.getName());
    }
            

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return this.type;
    }
}
