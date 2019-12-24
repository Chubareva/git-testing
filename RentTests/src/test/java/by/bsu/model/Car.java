package by.bsu.model;
import org.openqa.selenium.WebDriver;

import java.time.LocalDateTime;
import java.util.Objects;

public class Car {

    private String carFrom;
    private String cityFrom;
    private String placeFrom;
    private String carTo;
    private String takeTime;
    private String delivaryTime;
    private String takeDate;
    private DeliveryDate delivaryDate;


    public Car(String carFrom, String cityFrom) {
        this.carFrom = carFrom;
        this.cityFrom = cityFrom;
    }

    public Car(String testData, String data, String s, String testData1, String data1) {
        this.carFrom = carFrom;
        this.carTo = carTo;
        this.takeTime = takeTime;
        this.delivaryTime = delivaryTime;
        this.takeDate = takeDate;
        this.delivaryDate = delivaryDate;
        this.placeFrom=placeFrom;
        this.cityFrom=cityFrom;
    }
    public Car(String carFrom, String cityFrom, String testData, String data, String s, String testData1, String data1){
        this.carFrom=carFrom;
        this.cityFrom=cityFrom;
        this.placeFrom=placeFrom;
    }

    public Car(){

    }

    public String getCarFrom() {
        return carFrom;
    }

    public Car setCarFrom(String carFrom) {
        this.carFrom = carFrom;
        return  this;
    }

    public String getCarTo() {
        return carTo;
    }
    public Car setCarTo(String carTo) {
        this.carTo = carTo;
        return this;
    }


    public String getPlaceFrom() {
        return placeFrom;
    }
    public Car setPlaceFrom(String placeFrom){this.placeFrom=placeFrom;
        return this;}

    public String  getCityFrom() {
        return cityFrom;
    }
    public Car setCityFrom(String cityFrom) { this.cityFrom=cityFrom;
        return this;}

    public String getTakeTime() {
        return takeTime;
    }

    public Car setTakeTime(String takeTime) {
        this.takeTime = takeTime;
        return this;
    }

    public String getDelivaryTime() {
        return delivaryTime;
    }

    public Car setDelivaryDate(DeliveryDate delivaryDate) {
        this.delivaryDate = delivaryDate;
        return this;
    }
    public String getTakeDate() {
        return takeDate;
    }

    public Car setTakeDate(String takeDate) {
        this.takeDate = takeDate;
        return this;
    }

    public DeliveryDate getDelivaryDate() {
        return delivaryDate;
    }

    public Car setDelivaryTime(DeliveryDate delivaryDate) {
        this.delivaryDate = delivaryDate;
        return this;
    }




    @Override
    public String toString() {
        return "Car{" +
                "Pick up location='" + carFrom + '\'' +
                ",drop off location='" + carTo + '\'' +
                ",pick up city='" + cityFrom + '\'' +
                ", pick up place ='" + placeFrom + '\'' +
                ", pick up date='" + takeDate + '\'' +
                ", drop off date='" + delivaryDate + '\'' +
                ", pick up time='" + takeTime + '\'' +
                ", drop off time='" + delivaryTime + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getCarFrom(), car.getCarFrom()) &&
                Objects.equals(getCarTo(), car.getCarTo()) &&
                Objects.equals(getCityFrom(), car.getCityFrom()) &&
                Objects.equals(getPlaceFrom(), car.getPlaceFrom()) &&
                Objects.equals(getTakeDate(), car.getTakeDate()) &&
                Objects.equals(getDelivaryDate(), car.getDelivaryDate()) &&
                Objects.equals(getTakeTime(), car.getTakeTime()) &&
                Objects.equals(getDelivaryTime(), car.getDelivaryTime());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarFrom(), getCarTo(),getTakeTime(),getDelivaryTime(),getDelivaryDate(),getTakeDate(),getPlaceFrom(),getCityFrom());
    }

    public abstract static class AbstractPage
    {
        protected WebDriver driver;

        protected abstract AbstractPage openPage();
        protected final int WAIT_TIMEOUT_SECONDS = 10;

        protected AbstractPage(WebDriver driver)
        {
            this.driver = driver;
        }
    }
}
