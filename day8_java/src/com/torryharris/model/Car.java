package com.torryharris.model;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private int chassisNo;
    private String carName;
    private String fuelType;
    private Float power;
    @Override
    public int compareTo(Car o) {
        return this.getPower().compareTo(o.getPower());
    }

    public Car(int chassisNo, String carName, String fuelType, Float power) {
        this.chassisNo = chassisNo;
        this.carName = carName;
        this.fuelType = fuelType;
        this.power = power;
    }

    public int getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(int chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassisNo=" + chassisNo +
                ", carName='" + carName + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return chassisNo == car.chassisNo && Objects.equals(carName, car.carName) && Objects.equals(fuelType, car.fuelType) && Objects.equals(power, car.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chassisNo, carName, fuelType, power);
    }


}
