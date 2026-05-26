import java.util.ArrayList;
import static java.lang.IO.*;
void main() {
    ArrayList<Double> celsius = new ArrayList<>();
    ArrayList<Double> fahrenheit = new ArrayList<>();
    while (true) {
        String entrada = readln("Digite a temperatura em Celsius (ou 'sair'): ");
        if (entrada.equalsIgnoreCase("sair")) {
            break;
        }
        double tempc = Double.parseDouble(entrada);
        celsius.add(tempc);
        double tempf = (tempc * 9 / 5) + 32;
        fahrenheit.add(tempf);
    }
    double somac = 0;
    double somaf = 0;

    for (int i = 0; i < celsius.size(); i++) {
        somac += celsius.get(i);
        somaf += fahrenheit.get(i);
    }
    double mediac = somac / celsius.size();
    double mediaf = somaf / fahrenheit.size();
    println("Temperaturas em Celsius: " + celsius);
    println("Temperaturas em Fahrenheit: " + fahrenheit);
    println("Média em Celsius: " + mediac);
    println("Média em Fahrenheit: " + mediaf);
}