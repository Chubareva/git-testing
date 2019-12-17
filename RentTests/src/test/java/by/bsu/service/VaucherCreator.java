package by.bsu.service;
import by.bsu.model.Vaucher;

import static by.bsu.service.UserCreator.TESTDATA_USER_PASSWORD;

public class VaucherCreator {

    public static final String TESTDATA_VAUCHER_NAME = "testdata.vaucher.name";
    public static final String TESTDATA_VAUCHER_SURNAME = "testdata.vaucher.surname";
    public static final String TESTDATA_VAUCHER_VAUCHERNUMBER = "testdata.vaucher.vauchernumber";

    public static Vaucher withCredentialsFromProperty(){
        return new Vaucher(TestDataReader.getTestData(TESTDATA_VAUCHER_NAME),
                TestDataReader.getTestData(TESTDATA_VAUCHER_SURNAME),
                TestDataReader.getTestData(TESTDATA_VAUCHER_VAUCHERNUMBER));
    }

    public static Vaucher withEmptyName(){
        return new Vaucher("",TestDataReader.getTestData(TESTDATA_VAUCHER_SURNAME),TestDataReader.getTestData(TESTDATA_VAUCHER_VAUCHERNUMBER));
    }

    public static Vaucher withEmptySurname(){
        return new Vaucher(TestDataReader.getTestData(TESTDATA_VAUCHER_NAME),"",TestDataReader.getTestData(TESTDATA_VAUCHER_VAUCHERNUMBER));
    }

    public static Vaucher withEmptyVaucherNumber(){
        return new Vaucher(TestDataReader.getTestData(TESTDATA_VAUCHER_NAME),TestDataReader.getTestData(TESTDATA_VAUCHER_SURNAME),"");
    }
}
