package ClasseAbstrata;

public class principal {
    public static void main(String[] args) {

        System.out.println("-------Veiculos-------");
        System.out.println();

        Ferrari Ferrari = new Ferrari ("00000", "F1", "Vermelho", 2023);
        System.out.println("------Ferrari------");
        Ferrari.ligar();
        Ferrari.acelerar();
        Ferrari.virar();
        Ferrari.frear();

        System.out.println("-----------------------------");
        
        Onibus Marcopolo = new Onibus ("11111", "XB1", "Prata", 2020);
        System.out.println("------Onibus------");
        Marcopolo.ligar();
        Marcopolo.acelerar();
        Marcopolo.virar();
        Marcopolo.frear();

        System.out.println("-----------------------------");

        Carro Corvette = new Carro ("77777", "C8", "Azul baby", 2024);
        System.out.println("------Corvette------");
        Corvette.ligar();
        Corvette.acelerar();
        Corvette.virar();
        Corvette.frear();

        System.out.println("-----------------------------");

        Moto Hornet = new Moto ("44444", "CB 750", "branca", 2024);
        System.out.println("------Hornet------");
        Hornet.ligar();
        Hornet.acelerar();
        Hornet.virar();
        Hornet.frear();

    }
    
}
