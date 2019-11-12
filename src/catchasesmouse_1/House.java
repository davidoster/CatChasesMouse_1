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
public class House {
    private String type = "house";
    private String name;
    private Human aHuman ;
    private Animal anAnimal;

    House() {
        System.out.println("This is a " + type);
    }
    
    House(String name) {
        this.name = name;
        System.out.println("This is " + type + ": " + this.name);
        this.setaHumanAndAnAnimal();
    }
    
    private void setaHumanAndAnAnimal() {
        this.aHuman = new Human("Nikos", this);
        this.anAnimal = new Animal("Annette", this);

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
