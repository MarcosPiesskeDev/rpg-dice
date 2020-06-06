package br.com.example.rpg_dice.util;

import java.util.Random;

public class DiceMethods {

//=============== DICE METHODS =====================

    public int d3(){
        Random r = new Random();
        int rolledDice = 1+r.nextInt(3);
        return rolledDice;
    }

    public int d4(){
        Random r = new Random();
        int rolledDice = 1+r.nextInt(4);
        return rolledDice;
    }

    public int d6(){
        Random r = new Random();
        int rolledDice = 1+r.nextInt(6);
        return rolledDice;
    }

    public int d8(){
        Random r = new Random();
        int rolledDice = 1+r.nextInt(8);
        return rolledDice;
    }

    public int d10(){
        Random r = new Random();
        int rolledDice = 1+r.nextInt(10);
        return rolledDice;
    }

    public int d12(){
        Random r = new Random();
        int rolledDice = 1+r.nextInt(12);
        return  rolledDice;
    }

    public int d20(){
        Random r = new Random();
        int rolledDice = 1+r.nextInt(20);
        return rolledDice;
    }

    public int d100(){
        Random r = new Random();
        int rolledDice = 1+r.nextInt(100);
        return rolledDice;
    }

    public String coinDice(){
        Random r = new Random();
        int coinUp = 1+r.nextInt(6);
        String coinTxt;
        switch(coinUp){
            case 1:
            case 3:
            case 6:
                coinTxt = "Heads!";
                break;
            case 2:
            case 4:
            case 5:
                coinTxt = "Tails!";
                break;
            default:
                coinTxt = "Oh no! You lost your coin!";
        }
        return coinTxt;
    }

    public String compassDice(){
        Random r = new Random();
        int compassDirection = 1+r.nextInt(8);
        String compassTxt;

        switch(compassDirection){
            case 1:
                compassTxt= "North!";
                break;
            case 2:
                compassTxt = "East!";
                break;
            case 3:
                compassTxt = "South!";
                break;
            case 4:
                compassTxt = "West!";
                break;
            case 5:
                compassTxt = "Northeast!";
                break;
            case 6:
                compassTxt = "Southeast!";
                break;
            case 7:
                compassTxt = "Southwest!";
                break;
            case 8:
                compassTxt = "Northwest!";
                break;
            default:
                compassTxt = "Sorry kid, but you're lost....";
        }
        return compassTxt;
    }
}
