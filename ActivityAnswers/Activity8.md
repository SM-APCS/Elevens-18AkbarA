Activity 8 - Using an Abstract Board Class

Questions
1: Discuss the similarities and differences between Elevens, Thirteens, and Tens. 

Similarities:
You have to create pairs that equal the title number. YouÅfre trying to remove all the cards. Face cards have special rules.


Differences:
In thirteens, kings are removed singly instead of a jack, queen, king trio. Also jack and queen have
numerical values. Finally, in thirteens, you try to make pairs that add to 13, not 11. In tens, the board has 13 cards, and quartets of face cards are removed as opposed to a trio. Also, you try to get pairs that equal 10.


2. As discussed previously, all of the instance variables are declared in the Board class. But it is the ElevensBoard class that ÅgknowsÅh the board size, and the ranks, suits, and point values of the cards in the deck. How do the Board instance variables get initialized with the ElevensBoard values? What is the exact mechanism?

Int size = 9;
String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
String[] suits = {"spades", "hearts", "diamonds", "clubs"};
Int[] point_values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

super(size, ranks, suits, point_values);
//references the superclass (Board.java)


3. Now examine the files Board.java, and ElevensBoard.java, found in the Activity8 Starter Code directory. Identify the abstract methods in Board.java. See how these methods are implemented in ElevensBoard. Do they cover all the differences between Elevens, Thirteens, and Tens as discussed in question 1? Why or why not?

No, you need the methods for the special face card pairs (JQK in the case of elevens)


