package com.palash.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;

    public Board(int dimention){
        this.board = new ArrayList<>();

        for(int i=0; i< dimention; i++){
            this.board.add(new ArrayList<>());
            for(int j=0; j< dimention; j++){
                this.board.get(i).add(new Cell(i, j));
            }
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
