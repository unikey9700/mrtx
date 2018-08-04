# mrtx

Matrix Multiplication

Matrix multiplication is a mathematical procedure that produces a resultant matrix from two input matrices.


The task is to implement a program that takes several lines of information from standard input, and performs the matrix multiplication of the two matrices. The program will print the resulting matrix to standard output.

The input will consist of one line containing the dimensions of the matrices (width of A, height of A, width of B, height of B in that order) followed by the values of the entries (filling in left to right, top to bottom) of A, then B.

Example:

In

3 2 5 3
5 3 10
7 9 9
10 2 3 8 12
7 4 11 3 6
8 8 1 14 3
Out

151 102 58 189 108
205 122 129 209 165
If the matrices cannot be multiplied, output an error message, and return.

Example:

In

1 1 2 3
1
1 2
3 4
5 6
Out

Invalid input.


It is assumed that all input will be given and only integers will be used. 
Source: https://en.wikipedia.org/wiki/Matrix_multiplication
