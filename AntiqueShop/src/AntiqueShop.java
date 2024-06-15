
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAM
 */
public class AntiqueShop {
    public static void main(String[] args) {
            ItemList obj=new ItemList();
            Scanner sc=new Scanner(System.in);
            int choice=0;
            do{
                System.out.println("1. add a new vase");
                System.out.println("2. add a new statue");
                System.out.println("3. add a new painting");
                System.out.println("4. display all items");
                System.out.println("5. find the items by the creator ");
                System.out.println("6. update the item by its index");
                System.out.println("7. remove the item by its index");
                System.out.println("8. display the list of vase items ");
                System.out.println("9. sorts items in ascending order based on their values ");
                System.out.println("10. exit");
                System.out.println("input your choice:");
                choice=sc.nextInt();
                switch(choice){
 					case 1:
// 					         Item tmp=new Vase();
// 					         tmp.input();
// 					         tmp.addItem(ItemList.genRandomVase());
//                                                 ItemList.genRandomVase();
                                                for (int i = 0; i <= 20; i++) {
                                                    obj.addItem(ItemList.genRandomVase());
                                                }
 
 					         break;
 					case 2:
// 					         Item tmp2=new Statue();
// 					         tmp2.input();
// 					        obj.addItem(tmp2);
                                                for (int i = 0; i <= 20; i++) {
                                                    obj.addItem(ItemList.genRandomStatue());
                                                }
 
 					         break;
 				
 					case 3:
// 					         Item tmp3=new Painting();
// 					         tmp3.input();
// 					         obj.addItem(tmp3);
                                            for (int i = 0; i <= 20; i++) {
                                                    obj.addItem(ItemList.genRandomPainting());
                                                }
 
 					         break;
 				
 					case 4:
                                                System.out.println("List of Item:");
                                                obj.displayAll();
                                                
 					         break;
 					case 5:
 					    Scanner scanner=new Scanner(System.in);    
                                            System.out.println("Input creator"); 
                                                String nameOfCreator = scanner.nextLine();
                                                 obj.findItem(nameOfCreator);

 					         break;  
 					case 6:
 					    System.out.println("Vị trí muốn thêm");
                                            Scanner in =new Scanner(System.in);  
                                            int index = in.nextInt();
                                            if (obj.updateItem(index)) {
                                                System.out.println("After updating: ");
                                                obj.displayAll();
                                            } else {
                                                System.out.println("can not update the item");
                                            }
                                            break;
 					case 7:
 					    System.out.println("Vị trí muốn xóa");
                                            Scanner num =new Scanner(System.in);  
                                            int vitri = num.nextInt();
                                            if (obj.removeItem(vitri)) {
                                                System.out.println("After updating: ");
                                                obj.displayAll();
                                            } else {
                                                System.out.println("can not update the item");
                                            }
                                            break;
 					    
 					case 8:
 					         Scanner scannerr=new Scanner(System.in);    
                                                System.out.println("Input type"); 
                                                String type = scannerr.nextLine();
                                                type = type.toLowerCase();
                                                obj.displayByType(type);
 					         break;
 					case 9:
 					        obj.sortValue();
                                                obj.displayAll();
 					        break;                            	                               
                }
            }while(choice<=9);
      
    }
    }

