package by.bsu.model;
import org.openqa.selenium.WebDriver;

import java.time.LocalDateTime;
import java.util.Objects;

public class Car {

    private String carFrom;
    private String cityFrom;
    private String placeFrom;
    private String carTo;
    private LocalDateTime takeTime;
    private LocalDateTime delivaryTime;
    private LocalDateTime takeDate;
    private LocalDateTime delivaryDate;



    public Car(String carFrom, String placeFrom,String cityFrom,String carTo,LocalDateTime takeTime , LocalDateTime delivaryTime,LocalDateTime takeDate , LocalDateTime delivaryDate  ) {
        this.carFrom = carFrom;
        this.carTo = carTo;
        this.takeTime = takeTime;
        this.delivaryTime = delivaryTime;
        this.takeDate = takeDate;
        this.delivaryDate = delivaryDate;
        this.placeFrom=placeFrom;
        this.cityFrom=cityFrom;
    }
    public Car(String carFrom,String cityFrom,String placeFrom){
        this.carFrom=carFrom;
        this.cityFrom=cityFrom;
        this.placeFrom=placeFrom;
    }

    public String getCarFrom() {
        return carFrom;
    }

    public void setCarFrom(String carFrom) {
        this.carFrom = carFrom;
    }

    public String getCarTo() {
        return carTo;
    }
    public void setCarTo(String carTo) {
        this.carTo = carTo;
    }


    public String getPlaceFrom() {
        return placeFrom;
    }
    public void setPlaceFrom(String placeFrom){this.placeFrom=placeFrom;}

    public String  getCityFrom() {
        return cityFrom;
    }
    public void setCityFrom(String cityFrom) { this.cityFrom=cityFrom; }

    public LocalDateTime getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(LocalDateTime takeTime) {
        this.takeTime = takeTime;
    }

    public LocalDateTime getDelivaryTime() {
        return delivaryTime;
    }

    public void setDelivaryDate(LocalDateTime delivaryDate) {
        this.delivaryDate = delivaryDate;
    }
    public LocalDateTime getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(LocalDateTime takeDate) {
        this.takeDate = takeDate;
    }

    public LocalDateTime getDelivaryDate() {
        return delivaryDate;
    }

    public void setDelivaryTime(LocalDateTime delivaryDate) {
        this.delivaryDate = delivaryDate;
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
