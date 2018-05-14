/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;

/**
 *
 * @author Vannak
 */
public class Player {


    private String Name;
    private String Gender;
    private int Age;
    private String Country;
    public int[] Score = new int[5];
    public int WiningCount=0;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }
    
    public Player(){}
    public Player(String Name, String Gender, int Age, String Country) {
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
        this.Country = Country;
    }
}
