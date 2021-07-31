package model;

import exceptions.ParkingLotException;

import java.util.*;

public class ParkingLot {
    private static int MAX_LIMIT = 10000;
    private int capacity;
    private Map<Integer, Slot> slots;

    public int getCapacity(){
        return this.capacity;
    }

    public ParkingLot(final int capacity) {
        if(capacity > MAX_LIMIT || 0 > capacity){
            throw new ParkingLotException("Invalid capacity is given for parking lot.");
        }
        this.capacity = capacity;
        this.slots = new HashMap<>();
    }

    public Map<Integer, Slot> getSLots(){
        return this.slots;
    }
}
