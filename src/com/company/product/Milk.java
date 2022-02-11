package com.company.product;

public class Milk extends Product{


    public Milk(String type, String model, int quantity) {
        super(type, model, quantity);
    }


     static class Butter{
        public String resept(){
            return "I made with milk";}
    }
    static class Tvorog extends Butter {
        public String resept() {
            return super.resept() + " and I made from butter.";
        }

        static class Cheese {
            public String resept3() {
                return "I am a small.";
            }
        }
    }
}
