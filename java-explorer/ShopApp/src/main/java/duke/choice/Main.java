package duke.choice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double tax = 0.2, total = 0;
        int measurement = 2;

//        System.out.println("Welcome to Duke Choice Shop!");

        //Exercise 3-1
        Customer c1 = new Customer("Pinky", measurement);
//        c1.setName("Pinky");
        c1.setSize("S");
//        System.out.println("Customer is " + c1.name);

        //Exercise 3-2
//        Clothing item1  = new Clothing(), item2 = new Clothing();
//
//        item1.setDescription("Blue Jacket");
//        item1.setPrice(20.9);
//        item1.setSize("M");
//
//        item2.setDescription("Orange T-Shirt");
//        item2.setPrice(10.5);
//        item2.setSize("S");

//        System.out.println("Item 1: " + item1.description + ", " + item1.price + ", " + item1.size);
//        System.out.println("Item 2: " + item2.description + ", " + item2.price + ", " + item2.size);

//        total = (item1.price + item2.price * 2) * (1 + tax);

//        System.out.println("Total payable with tax: " + total);

        //Exercise 6-2
        Clothing item1  = new Clothing("Blue Jacket", 20.9, "M"),
                item2 = new Clothing("Orange T-Shirt", 10.5, "S"),
                item3 = new Clothing("Green  Scarf", 5.0, "S"),
                item4 = new Clothing("Red  Scarf", 5.0, "S");

        //Exercise 4-1
//        switch (measurement) {
//            case 1, 2, 3 -> c1.setSize("S");
//            case 4, 5, 6 -> c1.setSize("M");
//            case 7, 8, 9 -> c1.setSize("L");
//            default -> c1.setSize("X");
//        }

//        System.out.println("Customer has a size : " + c1.size);

        //Exercise 4-2
        Clothing[] items = { item1, item2, item3, item4 };

        //Exercise 4-3
//        for (Clothing item: items) {
//            total = total + item.price;
//            System.out.println("Item: " + item.description + ", " + item.price + ", " + item.size);
//        }
//        System.out.println("Total: " + total);

        //Exercise 4-4
//        items[2].setDescription("Green  Scarf");
//        items[2].setPrice(5.0);
//        items[2].setSize("S");
//
//        items[3].setDescription("Red  Scarf");
//        items[3].setPrice(5.0);
//        items[3].setSize("S");

//        for (Clothing item: items) {
//            if (c1.getSize().equals(item.getSize())) {
//                total = total + item.getPrice();
//                System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
//                if (total > 15) {break;}
//            }
//        }
//
//        System.out.println("Total: " + total);

        //Exercise 5-1
//        for (Clothing item: items) {
//            if (c1.getSize().equals(item.getSize())) {
//                total = total + item.getPrice();
//                System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
//                total = total + total * tax;
//                if (total > 15) {break;}
//            }
//        }
//
//        System.out.println("Total: " + total);

        //Exercise 5-2
        c1.setSize(measurement);
//        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize());

        //Exercise 5-3

        c1.addItems(items);

        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothinCost());
//        for (Clothing item: c1.getItems()) {
//            System.out.println("Items: " +item.getDescription());
//        }

        //Exercise 6-3
        System.out.println("Min price: " + Clothing.MIN_PRICE);

        //Exercise 7-1
        int average = 0, count = 0;

        for (Clothing item: c1.getItems()) {
            if (item.getSize().equals('L')) {
                count++;
                average += item.getPrice();
            }
        }

        try {
            average = average / count;
            System.out.println("Average: " + average + ", Count " + count);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        //Exercise 8-1
        for (Clothing item: c1.getItems()) {
            System.out.println("Item: a " + item.toString());
        }

        //Exercise 8-2
        Arrays.sort(c1.getItems());
        for (Clothing item: c1.getItems()) {
            System.out.println("Item: a " + item.toString());
        }
    }
}