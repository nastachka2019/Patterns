package com.company;

import javafx.util.Builder;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new Coffee.Builder("Cappuccino").setCinnamon(true).setMilk(true).build();
        System.out.println(coffee.getNameOfCoffee() + " " + "comprises:" + " " + coffee.getCinnamon() + " " + coffee.getMilk());
        Coffee coffee1 = new Coffee.Builder("Vegan Coffee").setCinnamon(true).setSoyMilk(true).build();
        System.out.println(coffee1.getNameOfCoffee() + " " + "comprises:" + " " + coffee.getCinnamon() + " "
                + coffee.getSoyMilk());
        Coffee coffee2 = new Coffee.Builder("Sweet Coffee").setSweetSyrup(true).setMilk(true)
                .setSugar(true).build();
        System.out.println(coffee2.getNameOfCoffee() + " " + "comprises:" + " " + coffee.getSweetSyrup() +
                " " + coffee.getMilk() + " " + coffee.getSugar());
    }
}

public class Coffee {
    private String nameOfCoffee;
    private boolean sugar;
    private boolean milk;
    private boolean soyMilk;
    private boolean cinnamon;
    private boolean sweetSyrup;

    public String getNameOfCoffee() {
        return nameOfCoffee;
    }

    public String getSugar() {
        if (sugar == true) {

        }
        return "sugar";
    }

    public String getMilk() {
        if (milk == true) {

        }
        return "milk";
    }

    public String getSoyMilk() {
        if (soyMilk == true) {

        }
        return "soyMilk";
    }

    public String getCinnamon() {
        if (cinnamon == true) {
        }
        return "cinnamon";
    }

    public String getSweetSyrup() {
        if (sweetSyrup == true) {

        }
        return "sweetSyrup";
    }

    private Coffee(Builder builder) {
        this.nameOfCoffee = builder.nameOfCoffee;
        this.sugar = builder.sugar;
        this.milk = builder.milk;
        this.soyMilk = builder.soyMilk;
        this.cinnamon = builder.cinnamon;
        this.sweetSyrup = builder.sweetSyrup;

    }

    static class Builder {
        private String nameOfCoffee;
        private boolean sugar;
        private boolean milk;
        private boolean soyMilk;
        private boolean cinnamon;
        private boolean sweetSyrup;

        public Builder(String nameOfCoffee) {
            this.nameOfCoffee = nameOfCoffee;
        }

        public Builder setSugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public Builder setMilk(boolean milk) {
            this.milk = milk;
            return this;
        }

        public Builder setSoyMilk(boolean soyMilk) {
            this.soyMilk = soyMilk;
            return this;
        }

        public Builder setCinnamon(boolean cinnamon) {
            this.cinnamon = cinnamon;
            return this;
        }

        public Builder setSweetSyrup(boolean sweetSyrup) {
            this.sweetSyrup = sweetSyrup;
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }
}
