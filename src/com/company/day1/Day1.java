package com.company.day1;

import com.company.utils.AdventUtils;

public class Day1 {

    public Day1(){

    }


    public void runMe() throws Exception{
      int sum =   AdventUtils.getFile("D:\\codingStuff\\adventOfCode2019\\src\\com\\company\\day1\\inputs.txt")
               .mapToInt(num-> calcFuelNeeded(Integer.valueOf(num))).sum();
      System.out.println(sum);
    }

    public int calcFuelNeeded(int mass){
        double floor = Math.floor(mass/3);
        return   ((int)floor) - 2;
    }

}
