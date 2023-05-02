package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int vegBasePrice=300;
    private int nonVegBasePrice=400;

    private int extraCheese =80;
    private int extraVegTopping=70;
    private int extraNonVegTopping=120;
    private int paperBag=20;
    private boolean cheeseToBeAdded=false;
    private boolean toppingsToBeAdded=false;
    private boolean isPaperbagAdded=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price=vegBasePrice;
        }
        else{
            this.price=nonVegBasePrice;
        }
        basePrice=this.price;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        // your code goes here
        if(!cheeseToBeAdded) {
            this.price += 80;
            cheeseToBeAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsToBeAdded) {
            if (isVeg) {
                this.price += 70;
                toppingsToBeAdded = true;
            } else {
                this.price += 120;
                toppingsToBeAdded = true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
      if(!isPaperbagAdded) {
          this.price += 20;
          isPaperbagAdded = true;
      }
    }

    public String getBill(){
        // your code goes h
        this.bill="";

        bill+="Base Price Of The Pizza: " +basePrice+ "\n";
        if(this.cheeseToBeAdded) {
            this.bill += "Extra Cheese Added: "+ extraCheese+"\n";
        }
        if(toppingsToBeAdded) {
           if(this.isVeg)
           this.bill += "Extra Toppings Added: "+extraVegTopping+"\n";
           else
            this.bill+="Extra Toppings Added: "+extraNonVegTopping+"\n";
        }
        if(isPaperbagAdded){
           this.bill+="Paperbag Added: "+paperBag+"\n";
        }
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
