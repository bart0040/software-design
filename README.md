# Software-design
## Creational design: 
### Factory Method: 
#### The classes named here are part of the factory method:
- GameSetupCreator.java
- CheckerSetupCreator.java
- ChessSetupCreator.java

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