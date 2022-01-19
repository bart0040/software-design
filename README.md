# Software-design
## Creational design: 
### Factory Method: 
#### The classes named here are part of the factory method:
- GameSetupCreator.java
- CheckerSetupCreator.java
- ChessSetupCreator.java
- Board.java
- Rules.java
- Pawn.java
<br>Both chess and checkers have their own board, rules and pawns, but they have differences in those aspects.
<br>The Factory Method separates product construction from the code that actually uses the product.
<br>Therefore it’s easier to extend the product construction code independently from the rest of the code.
## Structural design:
### Bridge:
#### The classes named here are part of the bridge structure:
- Color.java
- White.java
- Black.java 
- Pawn.java
<br>In combination with CheckersSetupCreator and both the ChessSetupCreator and the CheckersSetupCreator. In this bridge there is a link between the Pawn and the color.
<br>The structural design for a bridge is logical because pawns need black and white. So now they get the color from these classes.

## Behavioral design:
### State:
#### The classes named here are part of the State structure:
- Player.java
- State.java
- MenuState.java
- PlayingState.java
- PauseState.java
- UI.java
- StatesDemo.java
<br> Every game has a state and multiple buttons to click on.
<br> but sometimes you don't want the player to click on certain buttons, to prevent unintentional events.
<br> And that is why we got the State behavior to prevent buttons to be clickable when they aren't supposed to be.

## Our collaboration
We started off pair programming the start of the project.
<br> after we finished the Factory pattern we split up and each made our own parts.
<br> Jaap-Jan made the Bridge pattern and Elwin Made the State pattern.
<br> After each commit we showed to each other what we made to keep each other up-to-date