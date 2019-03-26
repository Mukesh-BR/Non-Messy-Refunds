package com.example.nonmessyrefunds;

public class Student {

    private int breakfast;
    private int snacks;
    private int lunch;
    private int dinner;

    public Student(){

    }

    public Student(int breakfast, int snacks, int lunch, int dinner) {
        this.breakfast = breakfast;
        this.snacks = snacks;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public int getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    public int getSnacks() {
        return snacks;
    }

    public void setSnacks(int snacks) {
        this.snacks = snacks;
    }

    public int getLunch() {
        return lunch;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public int getDinner() {
        return dinner;
    }

    public void setDinner(int dinner) {
        this.dinner = dinner;
    }
}
