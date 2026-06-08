package Projects.Hungerbox1;


import java.util.ArrayList;

    interface Orderable{
      double getPrice();
      String getDescription();
      void prepare();
    }
    interface Discounts{
        double applyDiscount(double Discount);
    }
    abstract class MenuItems implements Orderable,Discounts {
        private final String name;
        private double price;
        private static int totalNumberOfOrders = 0;
        private String categories;

        public MenuItems(String name, double price, String categories) {
            this.name = name;
            this.price = price;
            this.categories = categories;
        }

        public String getName() {
            return name;
        }

        @Override
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            }
        }

        public static int getTotalNumberOfOrders() {
            return totalNumberOfOrders;
        }

        public static void setTotalNumberOfOrders(int totalNumberOfOrders) {
            MenuItems.totalNumberOfOrders = totalNumberOfOrders;
        }

        public String getCategories() {
            return categories;
        }

        public void setCategories(String categories) {
            this.categories = categories;
        }

        @Override
        public String getDescription() {
            return "Item Name : " + getName() + " Price : $" + getPrice();
        }

        abstract public void prepare();

        @Override
        public double applyDiscount(double Discount) {
            return price - (price * Discount / 100);
        }
    }
        class vegItems extends MenuItems {
            private boolean isJain;
            public vegItems(String name, double price){
                super(name,price,"veg");
                isJain=false;
            }

            public vegItems(String name, double price, boolean isJain) {
                super(name, price, "veg");
                isJain = isJain;
            }

            public void prepare() {
                System.out.println("Your order of " +getName()+ " of Price "+getPrice()+" is Been prepared");
                setTotalNumberOfOrders(getTotalNumberOfOrders()+1);
            }
        }
        class NonvegItems extends MenuItems {
            private String meatType;
            public NonvegItems(String name, double price, String categories, String meatType) {
                super(name, price, categories);
                this.meatType = meatType;
            }

            @Override
            public void prepare() {
                System.out.println("Your order of " +getName()+ "of Price "+getPrice()+" is Been prepared");
                setTotalNumberOfOrders(getTotalNumberOfOrders()+1);
            }

            @Override
            public String getDescription() {
                return super.getDescription() + this.meatType;
            }

        }
        class Orders {
            private final int orderId;
            private static int orderCount = 0;
            private final String customerName;
            ArrayList<MenuItems> list;
            private String status;

            Orders(String customerName) {
                this.customerName = customerName;
                this.list = new ArrayList<>();
                this.status = "order placed";
                this.orderId = ++orderCount;
            }

            public void addItems(MenuItems items) {
                list.add(items);
//             System.out.println(items.getDescription());
                System.out.println("The Items Ordered is " + items.getName() + " The price is " + items.getPrice());

            }
            public void prepareOrder(){
                this.status="preparing order";
                for(MenuItems items : list){
                    items.prepare();
                }
                this.status="Ready";
            }
            double calculatePrice(){
                double price=0;
                for(MenuItems items:list){
                    price+=items.getPrice();
                }
                return price;
            }
            void generateBill(double discountPercent){
                double subtotal = calculatePrice();
                double discounted = subtotal - (subtotal * discountPercent / 100);
                double tax  = discounted * 0.05;
                double total = discounted + tax;

                System.out.println("  ┌────────────────────────────────────┐");
                System.out.println("  │         HungerBox — Bill           │");
                System.out.println("  ├────────────────────────────────────┤");
                System.out.println("  │  Order ID  : #" + orderId);
                System.out.println("  │  Customer  : " + customerName);
                System.out.println("  │  Status    : " + status);
                System.out.println("  ├────────────────────────────────────┤");
                for (MenuItems item : list) {
                    System.out.printf("  │  %-22s ₹%6.2f%n", item.getName(), item.getPrice());
                }
                System.out.println("  ├────────────────────────────────────┤");
                System.out.printf("  │  Subtotal              ₹%8.2f%n", subtotal);
                if (discountPercent > 0)
                    System.out.printf("  │  Discount (%d%%)         -₹%7.2f%n", (int)discountPercent, subtotal - discounted);
                System.out.printf("  │  GST (5%%)              ₹%8.2f%n", tax);
                System.out.println("  ├────────────────────────────────────┤");
                System.out.printf("  │  TOTAL                 ₹%8.2f%n", total);
                System.out.println("  └────────────────────────────────────┘");
            }

            public int getOrderId() {
                return orderId;
            }

            public String getCustomerName() {
                return customerName;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }
        class Restaurant {
            private String name;
            ArrayList<MenuItems> menu;
            ArrayList<Orders> orders;
            Restaurant(String name){
                    this.name=name;
                    this.menu=new ArrayList<>();
                    this.orders=new ArrayList<>();
            }
            void addMenu(MenuItems items){
                menu.add(items);
            }
            void showMenu(){
                for (int i = 0; i <menu.size(); i++) {
                    System.out.println((i + 1) + ":" + menu.get(i).getDescription());
                }

            }
            Orders placeOrder(String name){
                Orders order1=new Orders(name);
                orders.add(order1);
                return order1;
            }
           MenuItems getItem(int index){
                return menu.get(index);
            }
//            Orders ord=new Orders(name);
            void showOrder(){
                for(Orders order:orders){
                    System.out.println("The orders of "+ order.getCustomerName() + " " +order.getStatus()+menu.get(order.getOrderId()).getDescription());
                }
//                System.out.println("The orders placed by"+ ord.getCustomerName() + "Of"+ ord.getOrderId() + "is"+ord.getStatus());

            }
        }

public class hungerbox {
    public static void main(String[] args) {
        System.out.println("\n  ╔═══════════════════════════════════╗");
        System.out.println("  ║       Welcome to HungerBox 🍕     ║");
        System.out.println("  ╚═══════════════════════════════════╝");
        Restaurant res=new Restaurant("Spicy Garden");
        res.addMenu(new vegItems("paneer butter masala",300));
        res.addMenu(new vegItems("tofu butter masala",310));
        res.addMenu(new vegItems("peanut butter masala",350,true));
        res.addMenu(new NonvegItems("butter chicken ",400,"Non-veg"," Chicken"));
        res.addMenu(new NonvegItems("mutton biriyani",500,"Non-veg"," Mutton"));
        res.showMenu();
        Orders ord=res.placeOrder("Divya Sree R");
        ord.addItems(res.getItem(0));
        ord.addItems(res.getItem(1));
        ord.addItems(res.getItem(2));
        ord.addItems(res.getItem(3));
        ord.prepareOrder();
        ord.generateBill(20);
        res.showOrder();


    }

}
