# Arrays

## What is an Array ?

An **array** is a collection of variables which is of same data type and it is also referenced by a common name. An array can hold any number of values which of same data type. 
Arrays consists of memory location which is of contiguous type. Array in Java is generally index-fixed, it starts from 0 and goes upto (n-1)th index.

![Screenshot (11)](https://user-images.githubusercontent.com/76544476/136693111-ebbb656c-0c5c-4ef5-89a6-9d4adc036429.png)

## Merits of Array:

- Arrays are fast when compared to data types(primitive).
- We can access any element/data from index position by random access method.
- We can sort or retrieve data more efficiently to make the code optimized.
- Objects can be stored in an array.

## De-Merits of Array:

- The array size in Java cannot be modified(increased or decreased). 
- To delete an element from an array there is a need to traverse throughout the array which will reduce the performance.
- Array is static.
- Wastage of memory occurs due to allocation of more memory than required.

## Types of Array:

- Single-Dimensional Array(1-D Array)
- Multi-Dimensional Array(2-D Array mostly)

## Single Dimensional Array:

### Syntax:
#### Declaration of Array:

> datatype[] array_name; <br>
  (or)  <br>
> datatype array_name[];

#### Instantiation of Array:

> array_name = **new** datatype[size];
