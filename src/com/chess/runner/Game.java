package com.chess.runner;

import com.chess.piece.*;

public class Game {
    public static void main(String[] args) {
        PieceColor color = PieceColor.DARK;
        Movable pawn = new Pawn(color);
        Queen queen = new Queen(color);
        Game.printPiece(pawn);
    }

    public static void printPiece(Movable piece) {
        piece.getValidMoves(null);
    }
}
