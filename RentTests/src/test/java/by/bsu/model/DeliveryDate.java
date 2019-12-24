package by.bsu.model;
import org.openqa.selenium.WebDriver;

import java.time.LocalDateTime;
import java.util.Objects;


public class DeliveryDate {
    private String takeDate;
    private String deliveryDate;


    public DeliveryDate(String takeDate,String deliveryDate){
        this.takeDate=takeDate;
        this.deliveryDate=deliveryDate;
    }



}