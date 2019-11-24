import java.util.Scanner;

/**
 * Restaurant
 */
public class Restaurant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] types = { "Makanan", "Minuman", "Snack" };
        String[][] menus = {
            // Foods
            { "Nasi Goreng", "Mie Goreng", "Ayam Geprek" },
            // Drinks
            { "Es Teh", "Teh Hangat", "Es Jeruk", "Jeruk Hangat" },
            // Snacks
            { "Roti Bakar", "Tahu Crispy" }
        };
        int[][] prices = {
            // Foods
            { 12000, 10000, 15000},
            // Drinks
            { 3000, 2500, 4000, 3000 },
            // Snacks
            { 12000, 10000 }
        };

    }
}