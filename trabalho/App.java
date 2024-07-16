
class App {
    public static void main(String[] args) {

        System.out.println(Texto.substr("modular", 2, 5));
        System.out.println(Texto.substr("modular", 2));
        System.out.println(Texto.substr("modular", -5,-2));
        System.out.println(Texto.substr("modular",-2));
        System.out.println(Texto.substr("modular",-6,4));
        System.out.println(Texto.substr("modular",-16,2)); // mo
        System.out.println(Texto.substr("modular", 8 ,10));
        System.out.println(Texto.substr("modular", 4 ,20));
        System.out.println(Texto.substr("modular", 4, 1));
        System.out.println(Texto.substr("programacao modular", 0, 4, 12, 15));
        System.out.println(Texto.substr("programacao modular", 0, 4, 12));
        System.out.println(Texto.substr("programacao modular", 0, 3, 6, 9, 12, 15));

    }
}