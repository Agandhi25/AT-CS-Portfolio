#This is the 2D array used for the game board
gameboard = [[' ', '|', ' ', '|', ' '],
             ['-', '+', '-', '+', '-'],
             [' ', '|', ' ', '|', ' '],
             ['-', '+', '-', '+', '-'],
             [' ', '|', ' ', '|', ' ']]

# This function prints the gameboard by going through a nested for loop
def print_game_board(gameboard):
  #For every character printed in a row, it keeps track of columns as well
    for row in gameboard:
        for c in row:
            print(c, end='')
        print()

# Tracks and inputs both players inputs on the boards
def place_piece(gameboard, pos, user):
    symbol = ' '
  #The if is for player 1
    if user == "player":
        symbol = 'x'
  #The elif is for player 2
    elif user == "player2":
        symbol = 'o'
    #Any possible condition to place any symbol on board
    if pos == 1:
        gameboard[0][0] = symbol
    #case 2 prints symbol on row 0, column 2
    elif pos == 2:
        gameboard[0][2] = symbol
    #case 3 prints symbol on row 0, column 4
    elif pos == 3:
        gameboard[0][4] = symbol
    #case 4 prints symbol on row 2, column 0
    elif pos == 4:
        gameboard[2][0] = symbol
    #case 5 prints symbol on row 2, column 2
    elif pos == 5:
        gameboard[2][2] = symbol
    #case 6 prints symbol on row 2, column 4
    elif pos == 6:
        gameboard[2][4] = symbol
    #case 7 prints symbol on row 4, column 0
    elif pos == 7:
        gameboard[4][0] = symbol
    #case 8 prints symbol on row 4, column 2
    elif pos == 8:
        gameboard[4][2] = symbol
    #case 9 prints symbol on row 4, column 4
    elif pos == 9:
        gameboard[4][4] = symbol

# This while loop ensures the game doesn't unexepectdly exit after player's turn
while True:
    print_game_board(gameboard)
    pos = int(input("Player 1, Enter your placement (1-9): "))
    print(pos)
    place_piece(gameboard, pos, "player")
    print_game_board(gameboard)
    pos2 = int(input("Player 2, enter your placement (1-9): "))
    print(pos2)
    place_piece(gameboard, pos2, "player2")