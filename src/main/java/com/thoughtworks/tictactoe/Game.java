package com.thoughtworks.tictactoe;


import java.io.PrintStream;

public class Game {

    private final Board board;
    private final UserScanner scanner;
    private PrintStream printStream;

    public Game(PrintStream printStream, Board board, UserScanner scanner) {
        this.printStream = printStream;
        this.board = board;
        this.scanner = scanner;
    }

    public void start() {
        board.print();
    }


    public void promptPlayer1() {
        int player1Move = scanner.nextInt();
        board.interpretInput(player1Move);
    }
}