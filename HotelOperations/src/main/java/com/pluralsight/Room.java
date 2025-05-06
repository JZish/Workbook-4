package com.pluralsight;

public class Room {

    //create the instance variables
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //constructor to instantiate a room
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    //create derived methods

    //method to check if the room is available
    //based on if it is clean and occupied
    public boolean isAvailable(){

//        if(!this.isOccupied() && !this.isDirty()){
//            return true;
//        }
//
//        return false;

        return !this.isDirty() && !this.isOccupied();
    }

    public boolean checkIn(){
        if (this.isAvailable()) {
            this.isOccupied() = true;
            this.isDirty() = true;
            System.out.println("Checked in");
        } else {
            System.out.println("Unavailable");
        }
    }

    public void checkOut(){
        this.cleanRoom();
        this.isOccupied = false;
    }

    public void cleanRoom(){
        this.isDirty = false;
    }

    //create getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }


}