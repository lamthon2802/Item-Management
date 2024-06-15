/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author LAM
 */
public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
    
    }

    public Vase(int value,String creator ,int height, String material  ) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void output() {
        
        System.out.println("Value:" + value + ", "+ "Creator:"+ creator+", " + "Height:" + height+", "+"Material:" + material);
//        System.out.println("Material: " + material);
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a height: ");
       height = sc.nextInt();
        System.out.println("Input a material: ");
        sc = new Scanner(System.in);
       material = sc.nextLine();
    }
    
}
