# Strings

## What is String in Java?
A Java String is a sequence or a set of characters that exists as an object of the class. In java strings are created and handled through a string class. String class is immutable that is once created cannot be changed or modified. Strings are similar to a character array in Java.

**Java Strings** provides a lot of methods for performing various operations on strings like _concat()_,_compare()_,_equals()_,_length()_

## Ways to Create Strings( Program Demonstration ):

```Java
String s1="java";//creating string by Java string literal    
char ch[]={'s','t','r','i','n','g','s'};    
String s2=new String(ch);//converting char array to string    
String s3=new String("example");//creating Java string by new keyword    
System.out.println(s1);    
System.out.println(s2);    
System.out.println(s3);    
```

## Output:

> Strings in Java  <br>
> Strings    <br>
> Java Strings  <br>

## Java String Class Methods:

The java.lang.String class provides so many ways to perform various operations.


> 1. **char charAt(int index)**  : It returns char type value at that particular index.  <br>
> 2. **int length()**           : It returns the length of the string.  <br>
> 3. **String substring(int beginIndex)** : It returns the substring for the given beginning index.
> 4. **String substring(int beginIndex, int endIndex)** : It returns substring for given beginning index till the end index.
> 5. **boolean contains(CharSequence s)** : It returns either true or false with regard to the sequence of the char values.
> 6. **static String join(CharSequence delimiter, CharSequence... elements)** : It returns the final joined string.
> 7. **boolean equals(Object another)** : It checks for the equality of string with the object that is given.
> 8. **boolean isEmpty()** : It checks if the string is empty or not.
> 9. **String concat(String str)** : It concatenates the string along with the specified string.
> 10. **String replace(char old, char new)** : It replaces all the occurrences of the specified char value.
> 11. **static String equalsIgnoreCase(String another)** : It compares another string. It doesn't check about the case used.
> 12. **String[] split(String regex)** : It returns the split string matching regex.
> 13. **int indexOf(int ch)** : It returns the int value of the specified char value index.
> 14. **int indexOf(int ch, int fromIndex)** : It returns the specified char value index starting from the given index.
> 15. **int indexOf(String substring)** : It returns the specified substring index.
> 16. **int indexOf(String substring, int fromIndex)** : It returns the specified substring index that is starting from the given index.
> 17. **String toLowerCase()** : It returns a string in lowercase.
> 18. **String toUpperCase()** : It returns a string in uppercase.
> 19. **String trim()** : It removes the beginning and the ending spaces of this string.
> 20. **static String valueOf(int value)** : It converts the given type into string. It is also an overloaded method.


