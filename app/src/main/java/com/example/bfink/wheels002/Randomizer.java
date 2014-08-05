package com.example.bfink.wheels002;


import android.widget.ImageView;

/**
 * Created by bfink on 7/1/14.
 */
public class Randomizer {
    int percentOfHigher;
    int percentOfLower;
    double the_number=0.0;
    float startspin=0.0f;
    float endspin=0.0f;
    int test=0;
    float newZero=0.0f;
    float new180=180.0f;

    public Randomizer(int a, int b){
        if(a+b==100) {
            if (a>b){
                this.percentOfHigher = a;
                this.percentOfLower = b;
            }else{
                this.percentOfHigher = b;
                this.percentOfLower = a;
            }
        } else{
            this.percentOfHigher = 50;
            this.percentOfLower = 50;
        }
    }

    public Randomizer(){
        this.percentOfHigher = 50;
        this.percentOfLower = 50;
    }

    public String whoWatchesTheDesk(){

        double d = Math.random();
        this.the_number = d*100;
        if (this.the_number<=this.percentOfHigher){return "Morgan is at the desk";}
        else return "Brandon is at the desk";
    }

    public int getPercentOfHigher(){
        return this.percentOfHigher;
    }

    public int getThe_number(){
        return (int)this.the_number;
    }


}

