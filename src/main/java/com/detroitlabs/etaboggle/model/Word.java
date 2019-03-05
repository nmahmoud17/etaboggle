package com.detroitlabs.etaboggle.model;

public class Word {
    private String name;
    private int points;

    public Word(String name, int points) {
        this.name = name;
        this.points = name.length();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
