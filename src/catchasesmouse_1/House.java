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
    private Human aHuman;
    private Animal anAnimal;
    private HousePart housePart1;
    private HousePart housePart2;

    House() {
        System.out.println("This is a " + type);
    }
    
    House(String name) {
        this.name = name;
        System.out.println("This is " + type + ": " + this.name);
        this.setHouseParts();
    }
    
    private void setaHumanAndAnAnimal() {
        this.aHuman = new Human("Nikos", this);
        this.anAnimal = new Animal("Annette", this);
    }
    
    private void setHouseParts() {
        this.housePart1 = new HousePart("indoors", this);
        this.housePart2 = new HousePart("outdoors", this);
        if(housePart1.getName().equals("indoors") || housePart2.getName().equals("indoors")) housePart1.setaHumanAndAnAnimal(this);
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

    public Human getaHuman() {
        return aHuman;
    }

    public void setaHuman(Human aHuman) {
        this.aHuman = aHuman;
    }

    public Animal getAnAnimal() {
        return anAnimal;
    }

    public void setAnAnimal(Animal anAnimal) {
        this.anAnimal = anAnimal;
    }

    public HousePart getHousePart1() {
        return housePart1;
    }

    public void setHousePart1(HousePart housePart1) {
        this.housePart1 = housePart1;
    }

    public HousePart getHousePart2() {
        return housePart2;
    }

    public void setHousePart2(HousePart housePart2) {
        this.housePart2 = housePart2;
    }
    
}
