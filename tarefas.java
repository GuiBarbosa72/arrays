import static java.lang.IO.*;
void main() {
    String[] tarefas = new String[100];
    int i = 0;
    while (i < tarefas.length) {
        String tarefa = readln("Registre uma tarefa ou digite 'fim' para sair: ");
        if (tarefa.equalsIgnoreCase("fim")) {
            break;
        }

        tarefas[i] = tarefa;
        i++;
    }

    println("Tarefas registradas: ");

    for (int j = 0; j < i; j++) {
        println(tarefas[j]);
    }
}