import java.util.Arrays;
import static java.lang.IO.*;
void main() {
    double[] p = new double[5];
    double maior = p[0];
    double menor = p[0];
    for (int i = 0; i < p.length; i++) {
        p[i] = Double.parseDouble(readln("Insira o preço do produto " + (i + 1) + ": "));
        if (p[i] > maior) {
            maior = p[i];
        }
        if (p[i] < menor) {
            menor = p[i];
        }
    }
    println("Maior preço registrado: " + maior);
    println("Menor preço registrado: " + menor);
    println("Lista de preços registrados: " + Arrays.toString(p));
}