<h1><b>Activity 2 Answers:<b></h1>



<h4>1. Explain in your own words the relationship between a <i>deck</i> and a <i>card</i>. </h4>

A deck contains a bunch of cards. In this case, the deck stores an arraylist of cards.

<h4>2. Consider the deck initialized with the statements below. How many cards does the deck contain? </h4>

```java
String[] ranks = {"jack", "queen", "king"};
String[] suits = {"blue", "red"};
int[] pointValues = {11, 12, 13};
Deck d = new Deck(ranks, suits, pointValues);
```

My code would error with an '<i>index out of bounds</i>' error because the array <i>suits</i> doesn't have as many values as the other two arrays.

<h4>3. The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2 (lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point value 10; an ace has point value 11; point values for 2, Åc, 10 are 2, Åc, 10, respectively. Specify the contents of the <i>ranks</i>, <i>suits</i>, and <i>pointValues</i> arrays so that the statement</h4>   

```java
Deck d = new Deck(ranks, suits, pointValues);  
 ```
 <h4>initializes a deck for a Twenty-One game.</h4>
 
 The array <i>ranks</i> would have the word forms of the numbers starting from two and ending with ten, along with "jack", "queen","king", and "ace." this would be repeated four times in the array. The <i>suits</i> array would have 13 "spades" in a row, then 13 "hearts", then 13 "diamonds", and then 13 "clubs". The <i>pointValues</i> array would have the numbers 2 through 13 repeated four times.
 
 <h4>4. Does the order of elements of the <i>ranks</i>, <i>suits</i>, and <i>pointValues</i> arrays matter? </h4>
 Yes, because corresponding elements of the three arrays are matched with each other to form the cards that the deck consists of.