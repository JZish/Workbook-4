package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void bookRoom_should_increaseBookedSuites() {
        // Arrange
        Hotel theHotel = new Hotel("Eric's amazing Hotel", 10, 50);

        //Act
        theHotel.bookRoom(3, true);

        //Assert
        assertEquals(7, theHotel.getAvailableSuites());
    }

    @Test
    public void bookRoom_should_increaseBookedRooms() {
        // Arrange
        Hotel theHotel = new Hotel("Eric's amazing Hotel", 10, 50);

        //Act
        theHotel.bookRoom(3, false);

        //Assert
        assertEquals(47, theHotel.getAvailableRooms());
    }


    @Test
    public void bookRoom_should_returnFalseIfNoSuitesAvailable() {
        // Arrange
        Hotel theHotel = new Hotel("Eric's amazing Hotel", 10, 50);

        //Act
        boolean success = theHotel.bookRoom(11, true);

        //Assert
        //assertEquals(false, success);
            // OR
        assertFalse(success);
    }
}