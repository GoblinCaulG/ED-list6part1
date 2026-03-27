package ArrayList;

public interface MyArrayListTAD{
    void addLast(int valor);
    void addFirst(int valor);
    void insertAT(int indice, int valor);
    void addSorted(int valor);
    void removeLast();
    void removeFirst();
    void removeAt(int indice);
    void remove(int item);
    int find(int item);
    int get(int indice);
    void set(int indice, int valor);
    boolean isEmpty();
    boolean isFull();
    int count();
    void display();
}
