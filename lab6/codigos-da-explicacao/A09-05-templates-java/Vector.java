import java.util.Arrays;

public class Vector<T> {
  private Object[] data; // usamos Object[] pois Java não permite new T[]
  private int size;
  private int capacity;

  // Construtor padrão
  public Vector() {
    this.capacity = 2;
    this.size = 0;
    this.data = new Object[capacity];
  }

  // Retorna o tamanho atual
  public int size() {
    return size;
  }

  // Acessa elemento por índice
  @SuppressWarnings("unchecked")
  public T get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException("Índice inválido: " + index);
    return (T) data[index];
  }

  // Define o valor de um elemento
  public void set(int index, T value) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException("Índice inválido: " + index);
    data[index] = value;
  }

  // Adiciona um elemento no final (push_back)
  public void add(T value) {
    if (size == capacity) {
      this._resize(capacity * 2);
    }
    data[size++] = value;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < size; i++) {
      sb.append(data[i]);
      if (i < size - 1)
        sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
  }

  // Redimensiona internamente o vetor
  private void _resize(int newCapacity) {
    capacity = newCapacity;
    data = Arrays.copyOf(data, capacity);
  }
}
