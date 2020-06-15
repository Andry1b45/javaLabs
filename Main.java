package com.kpi.javaLabs.laboratory4;
import com.kpi.javaLabs.laboratory4.Model.Dot;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    public void run(){
        System.out.println("Input amount of points:");
        int pointsAmount = Integer.parseInt(scanner.nextLine());

        HashSet<Dot> dotsSet = new HashSet<>();

        while (dotsSet.size() != pointsAmount){
            dotsSet.add(new Dot());
        }

        System.out.println("All dots: " + dotsSet);

        Iterator<Dot> iterator = dotsSet.iterator();
        double[][] resultArray = new double[pointsAmount][3];

        for(int i = 0; i<dotsSet.size(); i++) {
            Dot point1 = iterator.next();
            double sum = 0;
            int x1 = point1.getX();
            int y1 = point1.getY();

            Iterator<Dot> newIterator = dotsSet.iterator();

            for(int x = 0; x<dotsSet.size(); x++){
                Dot point2 = newIterator.next();
                int x2 = point2.getX();
                int y2 = point2.getY();

                sum += (Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2- y1), 2)));
            }
            resultArray[i][0] = x1;
            resultArray[i][1] = y1;
            resultArray[i][2] = sum;
        }

        System.out.println("\n|  X  |\t  Y  |\t  Sum  |");
        for (int i = 0; i<pointsAmount; i++){
            for (int x = 0; x< 3; x++){
                System.out.printf("%.2f \t", resultArray[i][x]);
            }
            System.out.println("");
        }

        double minimalValue = resultArray[0][2];
        int minimalValueIndex = 0;
        for(int i = 0; i<pointsAmount; i++){
            if(resultArray[i][2] < minimalValue){
                minimalValue = resultArray[i][2];
                minimalValueIndex = i;
            }
        }

        System.out.printf("\nMinimal total length to all dots is in: x = %.2f; y = %.2f; sum = %.2f;",
                resultArray[minimalValueIndex][0], resultArray[minimalValueIndex][1],
                resultArray[minimalValueIndex][2]);
    }






}
