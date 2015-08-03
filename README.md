# CS 2110
My work from CS2110 - Data Structures and OOP at Cornell University
Summer Session 2015

### Topics Learned
* File I/O
* Object Oriented Programming
  * Classes
  * Objects
  * Inheritance
    * Custom Exceptions 
* Data Structures (Mostly implemented with linked lists instead of arrays)
  * Nodes
  * Iterators
  * Singly Linked List
  * Doubly Linked Lists
  * Stacks
  * Queues
  * Binary Trees
    * Balancing Techniques 
  * B-Trees
* Recursion
* Proof By Induction
* GUI Basics
  * Java Swing 
* Sorting
  * Different Notations
    * Big-O, Little-O, Omega 
  * Selection Sort
  * Merge Sort
  * Quick Sort
  * Bucket Sort
  * Radix Sort
  * Heap Sort
* Graphs
  * Topological Sort 
  * Dijkstra’s Algorithm
  * Shortest Path
  * Trees
  t
  
  

### Homework Assignments
* Homework 1
  * _Question 1_
    * Write a program which will offer two ways to handle data to be analysed; the data being a collection of numbers (doubles).       The 'analysis' will comprise finding the max and the min of the collection of numbers, as well as the mean and the              standard deviation. The first way of gathering the data should invite the user to type in numbers at the keyboard once the       program has been started, with the 'typing' of an empty string or the typing of a non-number being used to terminate the        list of numbers. The second choice to be provided should ask the user for the name of a file to be read from, this file         containing a space separated list of 'doubles' spread over several lines. When the program starts, it should ask the user       if they'd prefer to type in data or give the name of a file holding the data, and then run accordingly. In both cases the       answer should be displayed on the screen, though an option should be provided to write the analysis data to a file whose        name has also been asked for by the program. (The goal here is to develop a program for data anaylsis of large files, so        the 'first case' is just a way of encouraging you to start simply!) 
      You should now see if you can improve your program so that it can give you more insight into the data being analysed            (e.g., how uniform is it? how wild are the outliers (if any)? etc.). Use your imagination here to build something               potentially useful, and ask questions if unsure what to do. 
The mean, m, of a list of numbers, (a1, a2, a3, ..., an), is the average, ie   m = (a1 + a2 + ... + an) / n ; and the standard deviation, s, is the square root of the average of the squares of the differences between the numbers and the mean, ie   s = sqrt[ ( (a1 - m)^2 + (a2 - m)^2 + ... + (an - m)^2 ) / n ] . (Note that there is some variation in the stats community about whether to divide by n or (n-1) when computing the standard deviation. This arises perhaps since dividing by n fits within the whole theory of moments, which puts things like means, std devs, skewness, kurtosis, etc in a consistent framework, whereas dividing by (n-1) reflects nicely the numbers of degrees of freedom, which fits well within sampling theory. Since there are good arguments for adopting each version, we'll adopt the division by n version simply to aim for consistency of answers within the course.) 


    * _Question 2_
    
      * A piece of orchestral music has a composer, a title, and a collection of instrumental parts (e.g., Beethoven, Symphony number 7, and parts for 2 flutes, 2 oboes, 2 clarinets, 2 bassoons, 2 horns, 2 trumpets, timpani violin 1, violin 2, viola, cello, and double bass). Each of these parts will have a difficulty level ranging from 1 to 10 (1 being the easiest). Write a Java program having various classes to allow creating a collection of information about orchestral music. Your program should make it easy to create entries for pieces of music, to edit any of the information (safely!), and to be able to search for pieces of orchestral music according to a chosen range of difficulty levels for any particular instrument.
      
  * Homework 2
    * The objective is to build a catalogue of music. You may assume that a piece of music will have a composer, a title, instrumentation, possibly a duration, and possibly comments about the piece. There might be some additional information to be added in a later version. Your program should prompt the user to enter data for each piece of music, and should save this data to a file in such a way that it's easy for you to reload the file if the user wants to restart the program to add more music. You may assume that there won't be a horrendously large number of different composers, and that the possible number of instruments to be used will not be overly large either. (In a later version there may be a few standard groupings of instruments (eg string quartet = 2 violins + 1 viola + 1 cello, or a classical orchestra = several 1st violins, several 2nd violins, several violas, several cellos, some double basses, 2 flutes, 2 oboes, 2 clarinets, 2 bassoons, up to 4 french horns, 2 trumpets, 3 trombones, 1 tuba, some percussion) -- don't go program for this aspect for this homework, simply put in a 'stub' now to handle this situation if there's a chance to expand on this once you're more comfortable with inheritance!!)). Often people make typos when entering data, so you should explore building your own exceptions to catch situations where an entered composer or instrument is very close in spelling to a previously created one, and use that to prompt the user to confirm or correct their input. At a latter stage that there may well be searching and sorting of the data, so you should think about being careful in organising your data intelligently.
    
  * Homework 3
    * _Question 1_
      * a:
        * Prove by induction that the following formula for summing the squares of integers between m and n inclusive (for m <=n) is valid.
m2 + (m+1)2 + . . . + n2 = (1/6) (n(n+1)(2n+1) - m(m-1)(2m-1)).
      * b: 
        * Suppose that you draw various lines (straight or wiggly) on a piece of paper, and count the number of nodes (places where lines cross or ends of a line), the number of 'edges' (an 'edge' is a segment of a line between a pair of nodes, and regions (a region is an area bounded by lines). Call these values n, e, and r. Prove by induction that n - e + r = 1.
      * c:
        * Suppose that p/q is a fraction in lowest terms such that 1/(n+1) < p/q < 1/n for some positive integer n. Prove that (p/q) - (1/(n+1)) is a fraction which in its lowest terms has numerator less than p. Hence by induction or otherwise, prove that every proper fraction p/q with p < q can be written as a finite sum of distinct reciprocals of positive integers. For example, 19/15 = 1/2 + 1/3 + 1/4 + 1/6 + 1/60. Use this technique to express 5/7 as a sum of reciprocals. The example given here is correct, though it's not true that all fractions bigger than 1 can be expressed finitely in this way (eg 2) -- you've been asked to prove the statement only when the fraction is less than 1 (which is always true). If you want an example for this case, then 14/17 = 1/2 + 1/4 + 1/14 + 1/476.
      * d: 
        * Suppose you are given the recursive definition
cn = 2 * cn/2 + n
c1 = 0
Estimate the numerical value of cn. Treat the n/2 as integer division.
      * _Question 2_
        * Consider the following problem. You're working for a large company with millions of customers, and have been asked to maintain a queue of customers seeking assistance. Note that some customers in the 'queue' may well get fed up waiting, so might choose to leave the 'queue' (even if not at the front), perhaps rejoining the 'queue' (at the back of course) at some later time. It turns out that some of your colleagues frequently want to be able to see who's currently in the queue, but either want to see quickly if a particular customer is there, or want a list of all queued customers sorted by name. Devise a data structure to handle this scenario efficiently, and write a program to show this in action. Your program should demonstrate its prowess by being able to read in data from a file (with your program allowing the naming of a file from which to read in data; the data would be in the format of strings separated by spaces and/or line breaks, each 'name' being just one string of letters without internal spaces). Explain how your program works, why you chose the data structure(s) you did, and make comparisons with other data structures or combinations of data structures which could have been employed. You should treat the customer data as if it were quite extensive for each customer (so have a customer object with attributes, some of which could be quite large) even if in reality much of your computation refers only to the name information or some other customer identifier. (For this question, please only use data structures that you actually build, eg don't use the Java API queues, lists, trees, arraylists, etc.. Likewise, you should write any methods you need (ie don't simply use a sorting method from the Java API).)
      * _Question 3_
        * You've been tasked with building a system to track traffic running on a network of intersecting roads. The traffic under consideration comprises cars, buses, bikes, and ambulances (the latter might be in emergency or non-emergency mode). Vehicles will need to know the routes they want to take (as a sequence of roads), and it should be possible to model their movement (at least to the extent that a record can be kept of where each vehicle is at any time as the system progresses. No road has more than one lane in each direction, and some roads might be one-way. Design and build and test a data structure to model this so that you can 'see' who's queueing up at any intersection and control the passage of traffic according to a natural suite of priorities. Bear in mind that there might be a need to know who is in any given vehicle and also where any given person happens to be (and that this latter query might need to be done as efficiently as you can).
    * Homework 4
      * _Question 1_
        * Imagine being in a supermarket and being about to queue to pay. There are c cashiers (imagine c = 10), and hence c queues to choose from. Since your objective is to pay and leave reasonably quickly, you should imagine that there's a 'feeder' structure from which each person chooses which cashier queue to join. Just like any queue, the only place to enter is the back, and the only place to be 'served' is the front (after which that person joins the collection of happy customers). However, these cashier queues (CQ) allow the additional ability (skip) to be able to leave in order to join the back of any other CQ that person chooses (ie, they're getting tired waiting and some other CQ looks to be better; perhaps having a shorter line, or a faster movement, for example). Using threads, run a simulation (writing suitable stats to the screen and to a file for later analysis) to see what happens as you adjust any preferences in the skip method. You will probably want to use Math.random( ) to generate cashier speeds (eg, a*Math.random() + b will give a random double between b and a+b, so that you can have the cashiers operating at different rates, yet with some random variation, possibly overlapping). You will want to create a GUI in order to make your simulation easier to visualise. You might want to experiment with various values to see if there are any good strategies (join the fastest queue, join the shortest queue, join the second best queue ...), although this question is NOT asking for you to develop an optimal strategy (that's potentially a hard question!) 
  

