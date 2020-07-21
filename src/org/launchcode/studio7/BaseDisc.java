package org.launchcode.studio7;

public abstract class BaseDisc{

    private String labelName;

    public BaseDisc (String name) {
        this.labelName = name;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String name) {
        this.labelName = name;
    }

    public abstract void getInfo();
}
