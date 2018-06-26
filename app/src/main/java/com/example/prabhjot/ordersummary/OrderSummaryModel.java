package com.example.prabhjot.ordersummary;

public class OrderSummaryModel {
    private String testName;
    private String serviceType;
    private boolean isFavourite;
    private String provDiag;
    private String remarks;
    private boolean isPriorityRoutine;
    private String description;


    public OrderSummaryModel(String testName, String serviceType, boolean isFavourite, String provDiag, String remarks, boolean isPriorityRoutine, String description) {
        this.testName = testName;
        this.serviceType = serviceType;
        this.isFavourite = isFavourite;
        this.provDiag = provDiag;
        this.remarks = remarks;
        this.isPriorityRoutine = isPriorityRoutine;
        this.description = description;
    }

    public String getTestName() {
        return testName;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public String getProvDiag() {
        return provDiag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setFavourite(boolean favourite) {
        this.isFavourite = favourite;
    }

    public void setProvDiag(String provDiag) {
        this.provDiag = provDiag;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public boolean isPriorityRoutine() {
        return isPriorityRoutine;
    }

    public void setPriorityRoutine(boolean priorityRoutine) {
        isPriorityRoutine = priorityRoutine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}