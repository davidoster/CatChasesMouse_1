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
public class HousePart {
    private String type = "house part";
    private String name;

    HousePart() {
        System.out.println("This is a " + type);
    }
    
    HousePart(String name) {
        this.name = name;
        System.out.println("This is " + type + ": " + this.name);
    }
    
    HousePart(String name, House aHouse) {
        this.name = name;
        System.out.println("This is " + type + ": " + this.name 
                 + " inside a " + aHouse.getType() + " called, " + aHouse.getName());
    }
    
     public void setaHumanAndAnAnimal(House aHouse) {
        aHouse.setaHuman(new Human("Nikos", aHouse));
        aHouse.setAnAnimal(new Animal("Annette", aHouse));
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
