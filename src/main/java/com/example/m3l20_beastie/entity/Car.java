package com.example.m3l20_beastie.entity;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Car {

    Long id;
    String brand;
    String modelName;

    public Car(Long id, String brand, String modelName) {
        this.id = id;
        this.brand = brand;
        this.modelName = modelName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//
//        return new EqualsBuilder()
//                .append(id, car.id) // TRUE
//                .append(brand, car.brand) // FALSE
//                .isEquals(); // TRUE or FALSE?
//    }

//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder(17, 37)
//                .append(id)
//                .append(brand)
//                .append(modelName)
//                .toHashCode();
//    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("brand", brand)
                .append("modelName", modelName)
                .toString();
    }
}
