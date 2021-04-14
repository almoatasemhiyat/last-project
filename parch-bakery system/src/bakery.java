import java.util.ArrayList;
import java.util.Scanner;

public class bakery {
    public static void main(String[] args) {
        ArrayList<ProductItem> array = new ArrayList<>();
        init(array);
        while(true){
            mainMenu();
            int choose = chooseFunction();
            switch(choose){
                case 1:
                    showItemList(array);
                    break;
                case 2:
             addItem(array);
                    break;
                case 3:
                    deleteItem(array);
                    break;
                case 4:
                    updataItem(array);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("No such feature");
                    break;
            }
        }

    }

    public static void  updataItem(ArrayList<ProductItem> array){
        System.out.println("Selected to modify the function");
        System.out.println("Please enter the number of the item");

        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();

        for (ProductItem item : array) {
            if (item.ID == ID) {
                System.out.println("Please enter a new item number");
                item.ID = sc.nextInt();

                System.out.println("Please enter a new product name");
                item.name = sc.next();

                System.out.println("Please enter a new item price");
                item.price = sc.nextDouble();

                System.out.println("Modified successfully!");

                return;
            }
        }
        System.out.println("The number you entered does not exist");
    }

    public static void deleteItem(ArrayList<ProductItem> array){
        System.out.println("Selected delete function");
        System.out.println("Please enter the number of the item to be deleted");
        Scanner sc = new Scanner(System.in);

        int ID = sc.nextInt();
        for(int i = 0; i < array.size(); i++){
            // Get to each FruitItem
            ProductItem item = array.get(i);
            if(item.ID == ID){
                array.remove(i);
                System.out.println("delete successfully");
                return;
            }
        }
        System.out.println("The number you entered does not exist");

    }

    public static void addItem(ArrayList<ProductItem> array){
        System.out.println("Selected to add product features");
        Scanner  sc = new Scanner(System.in);
        System.out.println("Please enter the number of the item");
        int ID = sc.nextInt();
        System.out.println("Please enter the name of the item");
        String name = sc.next();
        System.out.println("Please enter the unit price of the item");
        double price = sc.nextDouble();
        ProductItem item = new ProductItem();
        item.ID = ID;
        item.name = name;
        item.price = price;
        array.add(item);
        System.out.println("Add Success");
    }


    public static void showItemList(ArrayList<ProductItem> array){
        System.out.println();
        System.out.println("----------------Product Inventory List----------------");
        System.out.println("item No....Product Name....item Price");
        for (ProductItem item : array) {
            System.out.println(item.ID + "  " + item.name + "  " + item.price);
        }
    }

    public static int chooseFunction(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void mainMenu(){
        System.out.println("----------------Welcome to parch bakery----------------");
        System.out.println("1. List of items 2. Add items 3. Delete items 4. Modify items 5. Exit");
        System.out.println("Please enter the function number you want to operate:");
    }

    private static void init(ArrayList<ProductItem> array) {
        ProductItem f1 = new ProductItem();
        ProductItem f2 = new ProductItem();
        ProductItem f3 = new ProductItem();
        ProductItem f4 = new ProductItem();
        ProductItem f5 = new ProductItem();
        ProductItem f6 = new ProductItem();

        f1.name = "Chocolate muffin ";
        f1.ID=  9001;
        f1.price = 800;

        f2.name = "spanish latte";
        f2.ID= 9002;
        f2.price = 1500;

        f3.name = "spicy chicken sandwich";
        f3.ID= 9003;
        f3.price = 1800;

        f4.name = "hard roll bread";
        f4.ID= 9004;
        f4.price = 400;

        f5.name = "iced caramel latte";
        f5.ID= 9005;
        f5.price = 1000;

        f6.name = "V60";
        f6.ID= 9006;
        f6.price = 1000;


        array.add(f1);
        array.add(f2);
        array.add(f3);
        array.add(f4);
        array.add(f5);
        array.add(f6);

    }


}


