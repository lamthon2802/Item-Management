/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author LAM
 */
public class Painting extends Item {

    private int height;
    private int width;

    public Painting() {

    }

    public Painting(int value, String creator, int height, int width) {
        super(value, creator);
        this.height = height;
        this.width = width;
//        this.isWatercolour = isWatercolour;
//        this.isFramed = isFramed;
    }
    
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    
//    public boolean isIsWatercolour() {
//        return isWatercolour;
//    }
//    public void setIsWatercolour(boolean isWatercolour) {
//        this.isWatercolour = isWatercolour;
//    }
//    
//    public boolean isIsFramed() {
//        return isFramed;
//    }
//    public void setIsFramed(boolean isFramed) {
//        this.isFramed = isFramed;
    
    public void output() {
        System.out.println("Value:" + value + ", "+ "Creator:"+ creator+", " + "Height:" + height+", "+"Width: " + width);
//        System.out.println("Height: " + height);
//        System.out.println("Width: " + width);
//        System.out.println("Is Watercoulour " + isWatercolour);
//        System.out.println("Is Framed: " + isFramed);

    }
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height: ");
        height = sc.nextInt();
        System.out.println("Input width");
        width = sc.nextInt();
        
    }

}
