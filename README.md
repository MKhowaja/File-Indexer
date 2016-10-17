# File-Indexer
A command line application that takes text files as inputs and returns the 10 most common words found across all files.

To run, ensure you have Java 8 and then run:
```
javac FileIndexer.java
```

Then, to run the program:
```
java FileIndexer [text_files...]
```

The program will read the files and count the number of occurrences of each word read. It will then output the 10 most common words across all input files.

To run tests simply execute with the text files provided. An example run is:

```
java FileIndexer test/input.txt test/input2.txt test/input3.txt
```

Output will appear in the following format:
```
1.      the     41371
2.      of      23326
3.      and     20131
4.      to      14255
5.      a       13603
6.      in      11884
7.      that    5706
8.      his     5585
9.      was     5343
10.     is      5142
```
