package web.model;

import java.util.Objects;

public class Car {
    private String carBrand;
    private String carModel;
    private Integer yearOfRelease;

    public Car(String carBrand, String carModel, Integer yearOfRelease) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearOfRelease = yearOfRelease;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) { this.carModel = carModel; }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car
                = (Car) o;
        return Objects.equals(carBrand, car.carBrand) && Objects.equals(carModel, car.carModel) && Objects.equals(yearOfRelease, car.yearOfRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carModel, yearOfRelease);
    }
}
