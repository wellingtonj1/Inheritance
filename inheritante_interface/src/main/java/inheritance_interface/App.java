package inheritance_interface;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // clean console
        helper.print("\033[H\033[2J");
        helper.print("How many veículos?");
        int n = helper.scan().nextInt();

        // implements ArrayList of Veiculo
        ArrayList<Veiculo> lista = new ArrayList<Veiculo>();

        while (n > 0) {
        
            helper.print("What is the type of veículo?");
            String tipo = helper.scan().next();

            helper.print("What is type of fuel?");
            String fuelType = helper.scan().next();

            helper.print("What is the motor of veículo?");
            String motor = helper.scan().next();

            helper.print("What is the quilometragem of veículo?");
            double quilometragem = helper.scan().nextDouble();

            if (tipo.equals("Carro")) {
                Carro carro = new Carro(fuelType, motor, quilometragem);
                lista.add(carro);
            } else if (tipo.equals("Bicicleta")) {
                Bicicleta bicicleta = new Bicicleta(fuelType, motor, quilometragem);
                lista.add(bicicleta);
            } else if (tipo.equals("Barco")) {
                Barco barco = new Barco(fuelType, motor, quilometragem);
                lista.add(barco);
            } else {
                helper.print("Invalid type of veículo");
                n++;
            }
            
            n--;
                
        }

        // print all Veiculo
        helper.print("\n\n");
        Veiculo.printVeiculos(lista);
        
    }
}
