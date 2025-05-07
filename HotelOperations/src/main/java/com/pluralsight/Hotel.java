package com.pluralsight;

public class Hotel {

    private String name;
    private long numberOfTotalSuites;
    private long numberOfTotalBasicRooms;
    private long bookedSuites;
    private long bookedBasicRooms;

    public Hotel(String name, long numberOfTotalSuites, long numberOfTotalBasicRooms) {
        this.name = name;
        this.numberOfTotalSuites = numberOfTotalSuites;
        this.numberOfTotalBasicRooms = numberOfTotalBasicRooms;
        // Default booked rooms to 0
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, long numberOfTotalSuites, long numberOfTotalBasicRooms, long bookedSuites, long bookedBasicRooms) {
        this.name = name;
        this.numberOfTotalSuites = numberOfTotalSuites;
        this.numberOfTotalBasicRooms = numberOfTotalBasicRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    //public boolean bookRoom(int numberOfTotalBasicRooms, boolean isSuite) {

    //}

    public int getAvailableSuites() {
        return this.numberOfTotalSuites - this.bookedSuites;
    }

    public int getAvailableRooms() {
        return this.numberOfTotalBasicRooms - this.bookedBasicRooms;
    }

    public boolean bookRoom(String roomType, int numRooms) {
        int available = availableRooms.getOrDefault(roomType, 0);

        if (available >= numRooms) {
            availableRooms.put(roomType, available - numRooms);
            return true;
        } else {
            return false;
        }
    }




}
