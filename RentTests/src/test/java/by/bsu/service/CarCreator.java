package by.bsu.service;
import by.bsu.model.Car;
import by.bsu.model.DeliveryDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class CarCreator {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final LocalDate LOCAL_DATE = LocalDate.now();
    public static final String TESTDATA_CAR_CARFROM = "testdata.car.carfrom";
    public static final String TESTDATA_CAR_CITYFROM = "testdata.car.cityfrom";
    public static final String TESTDATA_CAR_PLACEFROM = "testdata.car.placefrom";
    public static final String TESTDATA_CAR_TAKE_TIME="testdata.car.take.time";
    public static final String TESTDATA_CAR_DELIVARY_TIME="testdata.car.delivary.time";
    public static final String TESTDATA_CAR_TAKE_DATE="testdata.car.take.date";
    public static final String TESTDATA_CAR_DELIVARY_DATE="testdata.car.delivary.date";

    public static Car withCredentialsFromProperty(){
        return new Car(TestDataReader.getTestData(TESTDATA_CAR_CARFROM),
                TestDataReader.getTestData(TESTDATA_CAR_CITYFROM),
                TestDataReader.getTestData(TESTDATA_CAR_PLACEFROM),
                TestDataReader.getTestData(TESTDATA_CAR_TAKE_TIME),
                TestDataReader.getTestData(TESTDATA_CAR_DELIVARY_TIME),
                TestDataReader.getTestData(TESTDATA_CAR_TAKE_DATE),
                TestDataReader.getTestData(TESTDATA_CAR_DELIVARY_DATE)
                );
    }
    private static LocalDate getDateWithPlusDays(String plusDaysParamName) {
        return CarCreator.LOCAL_DATE.plusDays(Integer.parseInt(TestDataReader
                .getTestData(plusDaysParamName)));
    }
    private static String getDateStringWithPlusDays(String plusDaysParamName) {
        return getDateString(getDateWithPlusDays(plusDaysParamName));
    }
    private static String getDateString(LocalDate date) {
        return date.format(DATE_FORMATTER);
    }

    public static Car withPastPickUpDate() {
        return (new Car())
                .setCarFrom(TestDataReader.getTestData(TESTDATA_CAR_CARFROM))
                .setCityFrom(TestDataReader.getTestData(TESTDATA_CAR_CITYFROM))
                .setPlaceFrom(TestDataReader.getTestData(TESTDATA_CAR_PLACEFROM))
                .setDelivaryDate(new DeliveryDate(
                        getDateStringWithPlusDays(TESTDATA_CAR_TAKE_DATE),
                        getDateStringWithPlusDays(TESTDATA_CAR_DELIVARY_DATE)));
    }

    public static Car withPickUpPlace() {
        return new Car(TestDataReader.getTestData(TESTDATA_CAR_CARFROM), TestDataReader.getTestData(TESTDATA_CAR_CITYFROM));
    }
    public static Car withouDelivaryDT(){
        return new Car(TestDataReader.getTestData(TESTDATA_CAR_CARFROM), TestDataReader.getTestData(TESTDATA_CAR_CITYFROM),
                TestDataReader.getTestData(TESTDATA_CAR_PLACEFROM), TestDataReader.getTestData(TESTDATA_CAR_TAKE_TIME),
                TestDataReader.getTestData(TESTDATA_CAR_TAKE_DATE));
    }
}
