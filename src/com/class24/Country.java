package com.class24;

public class Country {
public String capital, name;
public int population;
    
    Country(){
        System.out.println("I am non argument constructor");
    }
    
    Country(String name, String capital, int population) {
        this.name=name;
        this.capital=capital;
        this.population=population;
    }
    
    
    public void displayInfo() {
        System.out.println(name+" "+capital+" "+population);
    }
    
    public static void main(String[] args) {
    	
    	
//      Country country1=new Country();
//      country1.name="Usa";
//      country1.capital="Washington dc";
//      
//      Country country2=new Country();
//      country2.name="Kazakhstan";
//      country2.capital="Astana";
        
//      System.out.println(country1.name);
//      System.out.println(country1.capital);
//      
//      System.out.println(country2.name);
//      System.out.println(country2.capital);
//      
//      System.out.println(country3.name);
//      System.out.println(country3.capital);
        
        Country country1=new Country("USA", "Washington DC",350000000);
        Country country2=new Country("Kazakhstan", "Astana", 18000000);
        Country country3=new Country();
        
        country1.displayInfo();
        country2.displayInfo();
        country3.displayInfo();
    }
}
