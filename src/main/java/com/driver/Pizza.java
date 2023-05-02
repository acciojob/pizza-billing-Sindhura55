package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;

    private int extraCheese =80;
    private int extraVegTopping=70;
    private int extraNonVegTopping=120;
    private int paperBag=20;
    private boolean cheeseToBeAdded=false;
    private boolean toppingsToBeAdded=false;
    private boolean isPaperbagAdded=false;
    private boolean addTakeaway=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePrice=this.price;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        // your code goes here
                this.price += 80;
                cheeseToBeAdded = true;

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            this.price += 70;
            toppingsToBeAdded = true;
            }
        else{
                this.price+=120;
                toppingsToBeAdded=true;
            }

    }

    public void addTakeaway(){
        // your code goes here

            this.price+=20;
            isPaperbagAdded=true;
    }

    public String getBill(){
        // your code goes h
        this.bill="";

        bill+="Base Price Of The Pizza: " +basePrice+ "\n";
        if(cheeseToBeAdded) {
            this.bill += "Extra Cheese Added: " + extraCheese + "\n";
        }
        if(toppingsToBeAdded) {

           this.bill += "Extra Toppings Added: " + extraVegTopping + "\n";
        }
        if(isPaperbagAdded){
           this.bill+="Paperbag Added: "+paperBag+"\n";
        }
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
