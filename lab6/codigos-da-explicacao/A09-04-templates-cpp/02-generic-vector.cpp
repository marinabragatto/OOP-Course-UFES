
#include <iostream>
#include <stdexcept>
#include <utility>  // para std::move
#include <string>

using namespace std;

template <typename T>
class Vector
{
public:
  // Construtor padrão
  Vector() : _arr(new T[2]), _size(0), _alloc(2)
  {
    cout << "Constructor" << endl;
  }

  // Construtor de cópia
  Vector(const Vector &other) : _arr(new T[other._alloc]), _size(other._size), _alloc(other._alloc)
  {
    cout << "Copy constructor" << endl;

    for (int i = 0; i < _size; ++i)
      _arr[i] = other._arr[i];
  }

  // Operador de atribuição por cópia
  Vector &operator=(const Vector &other)
  {
    cout << "Copy assignment" << endl;

    if (this == &other)
      return *this;

    delete[] _arr;

    _alloc = other._alloc;
    _size = other._size;
    _arr = new T[_alloc];

    for (int i = 0; i < _size; ++i)
      _arr[i] = other._arr[i];

    return *this;
  }

  // Retorna o tamanho atual
  int size() const { return _size; }

  // Adiciona elemento ao final
  void add(const T &val)
  {
    if (_size >= _alloc)
      _resize(_alloc * 2);

    _arr[_size] = val;
    _size++;
  }

  // Obtém elemento em uma posição
  T get(int idx) const
  {
    if (idx < 0 || idx >= _size)
      throw out_of_range("Vector: invalid index");
    return _arr[idx];
  }

  // Define elemento em uma posição
  void set(int idx, const T &val)
  {
    if (idx < 0 || idx >= _size)
      throw out_of_range("Vector: invalid index");
    _arr[idx] = val;
  }

  // Destrutor
  ~Vector()
  {
    cout << "Destructor" << endl;
    delete[] _arr;
  }

private:
  T *_arr;
  int _size;
  int _alloc;

  void _resize(int new_alloc)
  {
    T *new_arr = new T[new_alloc];

    for (int i = 0; i < _size; ++i)
      new_arr[i] = _arr[i];

    delete[] _arr;
    _arr = new_arr;
    _alloc = new_alloc;
  }
};

// Função de teste que recebe um vetor por cópia
template <typename T>
void fn(Vector<T> w)
{
  cout << "Inside fn()" << endl;
}

int main()
{
  // Exemplo 1: Vector<int>
  Vector<int> vi;
  vi.add(1);
  vi.add(3);
  vi.add(5);
  vi.add(7);
  vi.add(10);

  for (int i = 0; i < vi.size(); i++)
    vi.set(i, vi.get(i) * 2);

  cout << "Vector<int>:\n";
  for (int i = 0; i < vi.size(); i++)
    cout << vi.get(i) << " ";
  cout << endl;

  Vector<int> wi = vi; // construtor de cópia
  fn(vi);              // também chama construtor de cópia

  wi.set(0, 999);
  cout << "vi[0] = " << vi.get(0) << ", wi[0] = " << wi.get(0) << endl;

  cout << "\n--------------------------------\n";

  // Exemplo 2: Vector<double>
  Vector<double> vd;
  vd.add(3.14);
  vd.add(2.71);
  vd.add(1.41);

  cout << "Vector<double>:\n";
  for (int i = 0; i < vd.size(); i++)
    cout << vd.get(i) << " ";
  cout << endl;

  cout << "\n--------------------------------\n";

  // Exemplo 3: Vector<string>
  Vector<string> vs;
  vs.add("Alice");
  vs.add("Bob");
  vs.add("Carol");

  cout << "Vector<string>:\n";
  for (int i = 0; i < vs.size(); i++)
    cout << vs.get(i) << " ";
  cout << endl;

  cout << "\n--------------------------------\n";

  return 0;
}
