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
public class Human {
    private String type = "human";
    private String name;

    Human() {
        System.out.println("This is a " + type);
    }
    
    Human(String name) {
        this.name = name;
        System.out.println("This is " + type + ": " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
