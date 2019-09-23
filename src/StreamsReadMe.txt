Terminal Operation collects the data from stream
Terminal operation starts the whole pipeline
Some Terminal Operations are
    1. collect
    2. sum
    3. min
    4. max
    5. reduce etc
Collect()
--------
The collect() method takes input of type Collector and produces the result as per input passed
joining() is used to concatentr strings used in the Collectors. joining has 3 overloaded methods.

groupingBy()
-----------
Used to group Stream elements based on a property
Output of groupingBy() is Map<k,v>
There are 3 versions of groupingBy()
groupingBy(Classifiers)
groupingBy(Classifiers,downstream)
groupingBy(Classifiers,supplier,downstream)

Parallel Streams:
---------------
In parallel processing the data is split into multiple parts and assign processors to process the results which are combined.
Parallel stream uses fork/join framework introduced in Java7.
Number of threads created == Number of processors available in the machine.

OPtional
-------

Used to represent Non-Null Values. Prevent NullPointerException and too many NullChecks. Inspired by groovy and scala.

Static/Default Interfaces
-------------------------
Instance varibles are not allowed in interface this has not changed in Java 8
Prior to Java8 -  Interfaces defined the contract. Allowed to declare methods and not implemnt.
                  Implementation was allowed only by implementation class.
                  This made difficult for interfaces to evolve specially for library creators.
 In Java8 - Default methods were introduced - default keyword is used to identify a default method in an interface.
            Default methods can be implemnted in the interface and can be overriden in the implementation class.
            Similar to default methods there is Static Methods.
            Static methods cannot be overrided in the implementation class.

   A class can extend only one class but can implement multiple interfaces. Hence Java8 supports Multiple Inheritence.




