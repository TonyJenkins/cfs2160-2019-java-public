package com.poppleton.christmas.club;

public class  Member {

    private String name;
    private int contribution;

    public Member (String name) {
        this.name = name;
        this.contribution = 0;
    }

    public Member (String name, int contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getContribution () {
        return contribution;
    }

    public void setContribution (int contribution) {
        this.contribution = contribution;
    }

    public boolean contribute (int amount) {
        if (amount > 0) {
            this.contribution += amount;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString () {
        return "Member: " + this.getName () + ". Contribution: " + this.getContribution () + '.';
    }

    public static void main (String[] args) {

        Member theGrinch = new Member ("The Grinch");
        Member cindyLouWho = new Member ("Cindy Lou Who");

        theGrinch.contribute (0);
        theGrinch.contribute (-1000000);
        cindyLouWho.contribute (100);

        System.out.println (theGrinch);
        System.out.println (cindyLouWho);

    }
}
