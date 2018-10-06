package com;

public class SpiralOrder {

    int a[][] = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};

    int right_max = 4;
    int down_max = 4;
    int left_max = 0;
    int up_max = 1;

    int current_row = 0;
    int current_column = 0;

    public static void main(String args[]){

        new SpiralOrder().goRight();
    }

    public void goRight(){

        if (current_column == 2 && current_row == 2)
            return;
        while (current_column <= right_max){
            System.out.println(a[current_row][current_column]);
            current_column++;
        }
        current_column = right_max;
        current_row++;
        right_max--;
        goDown();
    }

    public void goDown(){

        if (current_column == 2 && current_row == 2)
            return;
        while (current_row <= down_max){
            System.out.println(a[current_row][current_column]);
            current_row++;
        }
        current_row = down_max;
        current_column--;
        down_max--;
        goLeft();
    }

    public void goLeft(){

        if (current_column == 2 && current_row == 2)
            return;
        while (current_column >= left_max){
            System.out.println(a[current_row][current_column]);
            current_column--;
        }
        current_column = left_max;
        current_row--;
        left_max++;
        goUp();
    }

    public void goUp(){

        if (current_column == 2 && current_row == 2)
            return;
        while (current_row >= up_max){
            System.out.println(a[current_row][current_column]);
            current_row--;
        }
        current_row = up_max;
        current_column++;
        up_max++;
        goRight();
    }
}
