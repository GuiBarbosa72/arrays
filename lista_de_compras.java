import java.util.ArrayList;
import static java.lang.IO.*;
void main() {
    ArrayList<String> lista = new ArrayList<>();
    int opcao = 0;
    while (opcao != 6) {
        println("\n1-Adicionar\n2-Pesquisar\n3-Remover\n4-Alterar\n5-Listar\n6-Sair");
        opcao = Integer.parseInt(readln("Digite a opção desejada: "));
        if (opcao == 1) {
            while (true) {
                String item = readln("insira o nome do produto que deseja colocar em sua lista\nPara sair digite ('sair') : ");
                if (item.equalsIgnoreCase("sair")) {
                    break;
                }
                lista.add(item);
            }
        } else if (opcao == 2) {
            String item = readln("digite o nome do produto que deseja procurar em sua lista: ");
            println(lista.contains(item) ? "Produto encontrado" : "Produto não encontrado");
        } else if (opcao == 3) {
            String item = readln("digite o nome do produto que deseja retirar de sua lista: ");
            println(lista.remove(item) ? "Produto removido" : "Produto não encontrado");
        } else if (opcao == 4) {
            String troca = readln("digite o produto que deseja trocar de sua lista : ");
            if (lista.contains(troca)) {
                String novo = readln("digite o novo produto : ");
                lista.set(lista.indexOf(troca), novo);
                println("Produto alterado com sucesso");
            } else {
                println("Produto não encontrado");
            }
        } else if (opcao == 5) {
            if (lista.isEmpty()) {
                println("sua lista está vazia!");
            } else {
                for (String p : lista) {
                    println(p);
                }
            }
        } else if (opcao == 6) {
            println("Encerrando!");
        }
    }
}