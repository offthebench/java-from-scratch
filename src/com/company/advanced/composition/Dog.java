package com.company.advanced.composition;

public class Dog {
    private BreedType breed;
    private int cost;
    private Muzzle muzzle;

    public BreedType getBreed() {
        return breed;
    }

    public void setBreed(BreedType breed) {
        this.breed = breed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Muzzle getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(Muzzle muzzle) {
        this.muzzle = muzzle;
    }

    public static void main(String[] args) {
        System.out.print(BreedType.ALSATIAN.ordinal());
    }
}
