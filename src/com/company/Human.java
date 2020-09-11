package com.company;

public class Human {
    public static void main(String[] args){
        Human human = new Human();
        human.description();
    }

    public void description(){
        Leg leg = new Leg();
        Head head = new Head();
        Hand hand = new Hand();
        hand.setHandLength(10);
        head.setVolume(300);
        leg.setLegLength(20);

        System.out.println("Моя в длину: " + hand.getHandLength() + "\nМоя нога в длину: " + leg.getLegLength() + "\nОбъем моей головы: " + head.getVolume());
    }

    private class Leg{
        private int LegLength = 0;
        public int getLegLength() {return LegLength;}
        public void setLegLength(int length){this.LegLength = length;}
    }

    private class Head{
        private int volume = 0;

        public int getVolume() {return volume;}
        public void setVolume(int volume) {this.volume = volume;}
    }

    private class Hand{
        private int HandLength = 0;

        public int getHandLength() {return HandLength;}
        public void setHandLength(int HandLength) {this.HandLength = HandLength;}
    }
}

