package com.kpi.javaLabs.laboratory4.Model;
import java.util.Random;

public class Dot {
    Random random = new Random();
    int x;
    int y;

    public Dot(){
        this.x = random.nextInt(100+100)-100;
        this.y = random.nextInt(100+100)-100;
    }

    @Override
    public String toString() {
        return String.format("( x = " + x + "| y = " + y + " )");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dot dot = (Dot) obj;
        if (x != dot.x)
            return false;
        if (y != dot.y)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
