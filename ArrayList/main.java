package ArrayList;
import ArrayList.MyArrayList;
import java.util.Scanner;

public class main { // Dica: mude para 'Main' com M maiúsculo depois
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        System.out.println("x-x-x-x-xx-x-x-x-xx-x-x-x-x--x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x--x");
        System.out.println("SEJA BEM VINDO AO MEU ARRAY LIST (:");
        System.out.println("x-x-x-x-xx-x-x-x-xx-x-x-x-x--x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x--x");

        System.out.println("Qual a capacidade do vetor?");
        int capacidade = sc.nextInt();

        MyArrayList lista = new MyArrayList(capacidade);

        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1.  Adicionar ao Final");
            System.out.println("2.  Adicionar no Início");
            System.out.println("3.  Inserir em Posição");
            System.out.println("4.  Inserir Ordenado");
            System.out.println("5.  Remover Último");
            System.out.println("6.  Remover Primeiro");
            System.out.println("7.  Remover por Índice");
            System.out.println("8.  Remover por Valor");
            System.out.println("9.  Buscar Índice");
            System.out.println("10. Obter Valor");
            System.out.println("11. Alterar Valor");
            System.out.println("12. Exibir Informações");
            System.out.println("13. EXIBIR LISTA");
            System.out.println("0.  Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor: ");
                    lista.addLast(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Valor: ");
                    lista.addFirst(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Índice: ");
                    int idx = sc.nextInt();
                    System.out.print("Valor: ");
                    lista.insertAT(idx, sc.nextInt());
                }
                case 4 -> {
                    System.out.print("Valor: ");
                    lista.addSorted(sc.nextInt());
                }
                case 5 -> lista.removeLast();
                case 6 -> lista.removeFirst();
                case 7 -> {
                    System.out.print("Índice: ");
                    lista.removeAt(sc.nextInt());
                }
                case 8 -> {
                    System.out.print("Valor: ");
                    lista.remove(sc.nextInt());
                }
                case 9 -> {
                    System.out.print("Valor: ");
                    int pos = lista.find(sc.nextInt());
                    System.out.println(pos != -1 ? "Posição: " + pos : "Não encontrado");
                }
                case 10 -> {
                    System.out.print("Índice: ");
                    int val = lista.get(sc.nextInt());
                    if(val != -1) System.out.println("Valor: " + val);
                }
                case 11 -> {
                    System.out.print("Índice: ");
                    int idx = sc.nextInt();
                    System.out.print("Novo Valor: ");
                    lista.set(idx, sc.nextInt());
                }
                case 12 -> {
                    System.out.println("Qtd: " + lista.count());
                    System.out.println("Vazia: " + lista.isEmpty() + " | Cheia: " + lista.isFull());
                }
                case 13 -> lista.display();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}