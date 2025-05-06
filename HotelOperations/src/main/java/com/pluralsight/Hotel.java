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
    }

    public Hotel(String name, long numberOfTotalSuites, long numberOfTotalBasicRooms, long bookedSuites, long bookedBasicRooms) {
        this.name = name;
        this.numberOfTotalSuites = numberOfTotalSuites;
        this.numberOfTotalBasicRooms = numberOfTotalBasicRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfTotalBasicRooms, boolean isSuite) {

    }




}
