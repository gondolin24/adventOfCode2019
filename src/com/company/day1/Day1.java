package com.company.day1;

import com.company.utils.AdventUtils;

import java.io.Console;
import java.io.IOException;

public class Day1 {

    public Day1(){

    }


    public void runMePartOne() throws Exception{
      int sum =   AdventUtils.getFile("D:\\codingStuff\\adventOfCode2019\\src\\com\\company\\day1\\inputs.txt")
               .mapToInt(num-> calcFuelNeeded(Integer.valueOf(num))).sum();
      System.out.println(sum);
    }

    private int calcFuelNeeded(int mass){
        double floor = Math.floor(mass/3);
        return   ((int)floor) - 2;
    }

    public void runMePartTwo() throws IOException {
        int sum =   AdventUtils.getFile("D:\\codingStuff\\adventOfCode2019\\src\\com\\company\\day1\\inputs.txt")
                .mapToInt(num-> fuelMe(Integer.valueOf(num))).sum();
        System.out.println(sum);
    }

    private int fuelMe(int current){

        int fuelNeeded = calcFuelNeeded(current);
        if(fuelNeeded<=0){
            return 0;
        }else{
        return fuelNeeded + fuelMe(fuelNeeded);
        }

    }

}
