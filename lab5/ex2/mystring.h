#include <stdio.h>
#include <string.h>
class String{
public:

    String();
    String(const char * data_in);
    String(const String& string_in);
    String operator+(const String& other);
    String& operator=(const String& other);
    ~String();

    char * c_str();

private:
    char * _data;
    int _tam;
};