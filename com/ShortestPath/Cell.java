package com.ShortestPath;

public class Cell {
  int rowIndex;
  int columnIndex;
  int distance;

    public Cell(int rowIndex, int columnIndex, int distance) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        this.distance = distance;
    }
}
