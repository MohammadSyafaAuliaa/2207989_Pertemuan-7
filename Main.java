import java.util.Scanner;

class PersamaanLinear {

    double a;
    double b;
    double c;
    double d;
    double e;
    double f;

    // Constructor tanpa argumen
    public PersamaanLinear() {
    }

    // Metode getter
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // Metode untuk memeriksa apakah persamaan memiliki solusi
    public boolean cek() {
        return (a * d - b * c) != 0;
    }

    // Metode untuk mendapatkan nilai x
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // Metode untuk mendapatkan nilai y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai a, b, c, d, e, dan f
        System.out.println("Masukkan nilai a, b, c, d, e, dan f untuk persamaan ax + by = e dan cx + dy = f:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        System.out.print("d: ");
        double d = scanner.nextDouble();
        System.out.print("e: ");
        double e = scanner.nextDouble();
        System.out.print("f: ");
        double f = scanner.nextDouble();

        // Membuat objek PersamaanLinear
        PersamaanLinear persamaan = new PersamaanLinear();
        persamaan.a = a;
        persamaan.b = b;
        persamaan.c = c;
        persamaan.d = d;
        persamaan.e = e;
        persamaan.f = f;

        // Memeriksa apakah persamaan memiliki solusi
        if (persamaan.cek()) {
            // Jika memiliki solusi, tampilkan solusinya
            System.out.println("Solusi untuk persamaan adalah:");
            System.out.println("x = " + persamaan.getX());
            System.out.println("y = " + persamaan.getY());
        } else {
            // Jika tidak memiliki solusi, tampilkan pesan
            System.out.println("Persamaan tidak memiliki solusi.");
        }

        scanner.close();
    }
}
