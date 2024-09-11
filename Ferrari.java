package ClasseAbstrata;
public class Ferrari extends Veiculos {
    
    public Ferrari(String placa, String modelo, String cor, int ano) {
        super(placa, modelo, cor, ano);
    }
    @Override
    public void acelerar() {
        System.out.println("A Ferrari está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A Ferrari está freando.");
    }

    @Override
    public void virar() {
        System.out.println("A Ferrari está virando.");
    }

    @Override
    public void ligar() {
        System.out.println("A Ferrari está ligando.");
    }
}

