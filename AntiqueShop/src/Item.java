/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author LAM
 */
public class Item {
    Scanner sc = new Scanner(System.in);
    int value;
    String creator;
    public Item(){
        
    }
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
    
    public void input(){
        while(true){
            try{
                System.out.println("Input value: ");
                value = Integer.parseInt(sc.nextLine());
                System.out.println("Input creator: ");
                creator = sc.nextLine();
                creator = creator.trim();
                if(value<0){
                    throw new Exception("Invalid value");
                }
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Please enter a valid value.");
            }
        }
    }
}
