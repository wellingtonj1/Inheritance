package inheritance_interface;

public class Bicicleta extends Veiculo implements EmissaoCO2 {

    Double quilometragem, indice;

    public Bicicleta(String tipo, String motor, Double quilometragem) {
        super(tipo, motor);
        this.indice = 0.0;
        this.quilometragem = quilometragem;
    }

    public double getQuilometragem() {
        return this.quilometragem;
    }

    public double getIndice() {
        return this.indice;
    }

    @Override
    public double calculaCO2() {
        return this.quilometragem * this.indice;
    }

}
