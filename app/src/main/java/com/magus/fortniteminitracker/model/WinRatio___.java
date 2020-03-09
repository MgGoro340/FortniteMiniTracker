
package com.magus.fortniteminitracker.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WinRatio___ {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("field")
    @Expose
    private String field;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("valueDec")
    @Expose
    private Double valueDec;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("displayValue")
    @Expose
    private String displayValue;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getValueDec() {
        return valueDec;
    }

    public void setValueDec(Double valueDec) {
        this.valueDec = valueDec;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

}
