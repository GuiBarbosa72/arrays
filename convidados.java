import java.util.Arrays;
import static java.lang.IO.*;
void main() {
    String[] list = new String[5];
    for (int i = 0; i < list.length; i++) {
        list[i] = readln("Digite seu nome: : ");
    }
    int q = list.length;

    println("Lista dos convidados: " + Arrays.toString(list));

    println("Número de convidados: " + q);
}