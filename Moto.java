package ClasseAbstrata;
public class Moto extends Veiculos {
    
    public Moto(String placa, String modelo, String cor, int ano) {
        super(placa, modelo, cor, ano);
    }
    @Override
    public void acelerar() {
        System.out.println("A Hornet está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A Hornet está freando.");
    }

    @Override
    public void virar() {
        System.out.println("A Hornet está virando.");
    }

    @Override
    public void ligar() {
        System.out.println("A Hornet está ligando.");
    }
}

