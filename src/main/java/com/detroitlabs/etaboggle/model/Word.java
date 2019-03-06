package com.detroitlabs.etaboggle.model;

public class Word {
    private String name;
    private int points;

    public Word(String name, int points) {
        this.name = name;
        this.points = name.length();
    }

    public Word(String name) {
        this.name = name;
        this.points = name.length();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }

        if (!(obj instanceof Word)) {
            return false;
        }

        Word word = (Word) obj;

        return word.name.equalsIgnoreCase(this.name);
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
