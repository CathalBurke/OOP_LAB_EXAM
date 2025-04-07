package ie.atu;

import java.util.Scanner;

public class Patient {

    public Patient(String given_name, String family_Name, String HSE_Number, int age) {
        Given_name = given_name;
        Family_Name = family_Name;
        this.HSE_Number = HSE_Number;
        Age = age;
    }


    public String getGiven_name(String john) {
        return Given_name;
    }

    public void setGiven_name(String given_name) {
        Given_name = given_name;
    }

    public String getFamily_Name() {
        return Family_Name;
    }

    public void setFamily_Name(String family_Name) {
        Family_Name = family_Name;
    }

    public String getHSE_Number() {
        return HSE_Number;
    }

    public void setHSE_Number(String HSE_Number) {
        this.HSE_Number = HSE_Number;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    String Given_name;
    String Family_Name;
    String HSE_Number ;
    int Age;


   // Scanner sc = new Scanner();



}
