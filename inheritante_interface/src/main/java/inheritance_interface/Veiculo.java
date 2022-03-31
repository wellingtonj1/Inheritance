package inheritance_interface;

import java.util.ArrayList;

public abstract class Veiculo {

    private String tipo;
    private String motor;

    public Veiculo(String tipo, String motor) {
        this.tipo = tipo;
        this.motor = motor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMotor() {
        return motor;
    }

    // static method to print all veiculos passed in ArrayList
    public static void printVeiculos(ArrayList<Veiculo> veiculos) {
        for (Veiculo veiculo : veiculos) {
            
            if (veiculo instanceof Carro) {
                helper.print("Carro: ");
                helper.print("Tipo: " + veiculo.getTipo());
                helper.print("Motor: " + veiculo.getMotor());
                helper.print("Quilometragem: " + ((Carro) veiculo).getQuilometragem());
                helper.print("Emissão de CO2: " + ((Carro) veiculo).calculaCO2() + " KG/mes\n") ;
            } else if (veiculo instanceof Bicicleta) {
                helper.print("Bicicleta: ");
                helper.print("Tipo: " + veiculo.getTipo());
                helper.print("Motor: " + veiculo.getMotor());
                helper.print("Quilometragem: " + ((Bicicleta) veiculo).getQuilometragem());
                helper.print("Emissão de CO2: " + ((Bicicleta) veiculo).calculaCO2() + "KG/mes\n");
            } else if (veiculo instanceof Barco) {
                helper.print("Barco: ");
                helper.print("Tipo: " + veiculo.getTipo());
                helper.print("Motor: " + veiculo.getMotor());
                helper.print("Quilometragem: " + ((Barco) veiculo).getQuilometragem());
                helper.print("Emissão de CO2: " + ((Barco) veiculo).calculaCO2() + "KG/mes\n");
            }

        }
    }


}
