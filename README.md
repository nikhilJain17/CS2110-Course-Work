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
  
    * Homework 5
	* In the country of GnomenWald there lie many isolated villages connected by roads (roads only ever go from village to village, never going nowhere nor branching out partway). The gnomes are very organised, so name their villages by integers, starting incrementally from "1". In the days of the Grand Archgnome Zijphraagh, a complete road map was made of GnomenWald -- some of the gnomes were surprised to see that some villages had many roads connecting to them, whereas some had only two, or even only one. They also noticed that some of the roads were only one-way (often due to the rigours of the terrain, but sometimes due to political sensitivities), so the map-makers were very careful to label all their roads as one-way (so that a two-way road between two villages would be drawn as a pair of one-way roads in each direction). After several generations the population had increased so much that new villages started to spring up (though always connected via a road or roads to one or more villages in GnomenWald), and sometimes villages would disappear (though that made it very hard for the mapmakers since they insisted that roads only joined villages and never branched in the middle).

Build a data structure to represent this road map by having nodes hold villages and expanding on the idea of 'next' in order to connect villages via roads. Test your data structure by using it in a program which tries to move some gnomes around the villages 'along' the roads (at this stage you don't need to 'show' them going along a road -- simply show the succession of villages a given gnome visits). You should also test your ability to add new villages, you should also try to handle the case of deleting villages (though that's an intellectually amusing problem to think through).

Now write a GUI for this with the following properties. It should display the graph of villages and roads, and allow the construction ab initio of any reasonable number of villages plus an easy way to build one or two way roads between villages. It should allow adding a new village to an existing setup, and permit deletion of individual villages (on deletion of a village, two options should be provided: (1) any roads that went through the village should also be deleted, or (2) any roads that went through the village en route to other villages should be made direct (for example, if there is a road from A to B and roads from B to C and from B to D, then in case (2) there will now be a road from A to C and A to D). There should also be a way to place a gnome in a specified village, and a button provided to (1) make the gnome move randomly amongst adjacent villages, and (2) a way to tell the gnome to move to a specified adjacent village. (The user should be able to see in which willage a gnome is residing.) Be aware that eventually you may well want to handle multiple gnomes moving in their own threads, so do think carefully about your data structures and how to keep your code modular. You should also provide the capability of searching (efficiently) for any given gnome and so locating their current position and also acquiring a history of the places they've visited.

There should be intuitive ways to build gnomes, and to add/delete villages and roads. The roads (and perhaps even the villages) should have costs (tolls ... collected by trolls?) associated with them. Enhance your program by having the gnomes know their current location and a desired location, plus a measure of urgency (ranging from lazy to desperate), so will choose their routes to their destinations accordingly. Tbe multiple gnomes should move around in their own threads, and there should be reasonable limits on the number of gnomes permitted to rest in any one village and on the number of gnomes allowed to be in any given road at any one time (limits should vary by village and by road). Your program should be able to run a simulation of the gnomes travelling around. You might like to explore ways of giving feedback to gnomes, either treating them as individuals or by devising a more global traffic control system, so that if they're not in lazy mode and so keen to get to their destination more quickly or more cheaply, they can reroute themselves to avoid being delayed when confronted with actual or potential traffic jams. You will find yourself implementing a shortest path algorithm to resolve the ablve, but you should also implement

topological sort (for cases where a gnome would not be permitted to enter a particular village without having had its passport stamped by certain other villages)
minimal spanning tree (to allow the Gnomenwald government to minimise their investment in their total road network ... before a road is built from one village to another, the two villages will submit a building cost proposal to the country's government (you may assume that the cost of building a road will be 100 times the toll charged for using that road), and the government will then pick from the list of proposals those which minimise the total cost of building enough roads to connect all the villages (at least to connect all those which could be connected if all the proposed roads were built -- here, connected is allowed to mean connected via other villages; we're not requiring direct roads between all villages!!!). Notice that this raises the question of how to handle the case of a collection of villages being created and submitting a road-building proposal which connect to any of the old villages after a set of roads have already been built. Likewise, there are questions when villages or roads are deleted.
Add such additional features as you find interesting.
