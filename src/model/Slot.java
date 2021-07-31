package model;

public class Slot {
    private Car parkedCar;
    private Integer slotNumber;


    public Slot(final Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public void assignCar(Car parkedCar) {
        this.parkedCar = parkedCar;
    }

    public void unassignCar() {
        this.parkedCar = null;
    }

    public void setSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public Integer getSlotNumber() {
        return slotNumber;
    }

    public boolean isSlotFree(){
        return this.parkedCar == null;
    }
}
