package com.example.atmdependent.Entity;

public class AtmDependentDetails {
    private int atmId;
    private String atmLocationState;
    private String atmLocationCity;
    private String bankName;
    private String atmStatus;
    public String getAtmStatus() {
        return atmStatus;
    }

    public void setAtmStatus(String atmStatus) {
        this.atmStatus = atmStatus;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAtmLocationCity() {
        return atmLocationCity;
    }

    public void setAtmLocationCity(String atmLocationCity) {
        this.atmLocationCity = atmLocationCity;
    }

    public String getAtmLocationState() {
        return atmLocationState;
    }

    public void setAtmLocationState(String atmLocationState) {
        this.atmLocationState = atmLocationState;
    }

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

}
