
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAM
 */
public class ItemList {

 
    Item[] list; // khởi tạo mảng;
    int numOfItem; // để store khi add thêm giá trị 
    final int MAX = 1000;

    public ItemList() {
        list = new Item[MAX];
        numOfItem = 0;
    }

    public boolean addItem(Item item) { //tạo một hàm kiểm tra việc thêm item 
        if (item == null || numOfItem >= MAX) {
            return false;
        }
        list[numOfItem] = item;
        numOfItem++;
        return true;
    }

    public void displayAll() {
        if (numOfItem == 0) {
            System.out.println("No item");
        }
        for (int i = 0; i <= numOfItem; i++) {
            if (list[i] != null) {
                System.out.print("List[" + i + "]: "); // System.out.print giúp cho viết liền dòng
                list[i].output();
            }
        }
    }

    public static int genRandomInt(int par, int par1) {
        Random rand = new Random();
        return rand.nextInt(par1 - par + 1) + par;
    }
    private static final String[] creators = {
        "Hưng", "Hùng", "Anh", "Bình", "Cường", "Dũng", "Đạt", "Hiếu", "Hoàng", "Khoa",
        "Khôi", "Long", "Minh", "Nam", "Phong", "Quân", "Sơn", "Thắng", "Tiến", "Toàn",
        "Trung", "Tuấn", "Việt", "Vinh", "Vũ", "Tùng", "Thanh", "Thành", "Lâm", "Hải",
        "Bảo", "Chí", "Đức", "Kiên", "Khánh", "Lộc", "Ngọc", "Phúc", "Quang", "Thịnh",
        "Trường", "Văn", "Hào", "Hà", "Thiện", "Nhân", "Tài", "Thảo", "Vũ"
    };
    private static final String[] materials = {
        "Ceramic", "Glass", "Wood", "Metal", "Plastic", "Clay", "Porcelain", "Stone", "Bamboo", "Bronze",
        "Marble", "Steel", "Aluminum", "Copper", "Brass", "Iron", "Concrete", "Fiberglass", "Carbon Fiber", "Acrylic",
        "Resin", "Terracotta", "Silicone", "Rubber", "Vinyl", "Lacquer", "Pewter", "Titanium", "Zinc", "Platinum"
    };
    public static String genRandomCreator() {
        return creators[genRandomInt(0, creators.length - 1)];
    } 
    public static String genRandomMaterial(){
         return materials[genRandomInt(0, materials.length - 1)];
    }
    private static final String[] colors = {"Red", "Blue", "Green", "Yellow", "Orange", "Purple", "White", "Black", "Pink", "Brown",
        "Cyan", "Magenta", "Lime", "Gray", "Silver", "Gold", "Maroon", "Navy", "Teal", "Indigo"};
    public static String genRandomColor(){
         return colors[genRandomInt(0, colors.length - 1)];
    }
     public static Vase genRandomVase() {
        int value = genRandomInt(10, 1000);
        String creator = genRandomCreator();
        int height = genRandomInt(10, 150);
        String material = genRandomMaterial();
        return new Vase(value, creator, height, material);
     }
     public static Statue genRandomStatue() {
        int value = genRandomInt(10, 1000);
        String creator = genRandomCreator();
        int weight = genRandomInt(10, 100);
        String color = genRandomColor();
        return new Statue(value, creator, weight,color );
     }
      public static Painting genRandomPainting() {
        int value = genRandomInt(10, 1000);
        String creator = genRandomCreator();
        int height = genRandomInt(10, 150);
        int width = genRandomInt(10, 150);
        return new Painting(value, creator, height, width);
     }
      public void findItem(String creator){
          boolean found = false; // optional nhưng dùng để kiểm tra có ít nhất 1 giá trị tồn tại và in ra nó trong trường hợp khôgn có thì in ra thông báo không có
          for(int i=0; i< numOfItem; i++){
              if(list[i].getCreator().equals(creator)){
                   list[i].output();
                   found = true;
              }
          }
          
          if(!found){
              System.out.println("Not found");
          }
      }
      public boolean updateItem(int index){
        for(int i=0; i< numOfItem; i++){
          if( index >= 0 && index < numOfItem){ 
              
            list[index].input(); // biến index = i để có thể thay thế ở vị trí mình muốn
              return true; // trả về true khi có thể thêm được
        }
        }
        return false;
    }
      public boolean removeItem(int index){
        if(index >= 0 && index < numOfItem){
            for(int j =index;j<numOfItem; j++){
                list[j]=list[j+1]; // đẩy dồn vị trí lên
               
            }
            numOfItem --; // giảm đi 1 vị trí sau khi xóa
            return true;
        }
        return false;
    }
      public void displayByType(String type) {
        if (type.equals("vase")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Vase) {
                    list[i].output();
                }
            }
        }
        if (type.equals("statue")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Statue) {
                    list[i].output();
                }
            }

        }
        if (type.equals("painting")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Painting) {
                    list[i].output();
                }
            }
        }
    }
      public void sortValue(){
          
          for(int i =0; i<numOfItem-1; i++){
              
              for(int j=0; j < numOfItem -1-i;j++){
                  if(list[j].getValue()>list[j+1].getValue()){
                      Item temp= list[j];
                      list[j] = list[j+1];
                      list[j+1] = temp;
                      
                  }
              }
              
          }
//          list[j].output();
      }
}
