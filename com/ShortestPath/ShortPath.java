package com.ShortestPath;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Find the shortest path to the post office -> Hussein-Udemy
 *
 * @author KarthickMoorthy
 */
public class ShortPath {
    public static void main(String[] args) {
        // We give 9 for post office location
        int [][] grid = {{1,1,1,1,0},{0,0,1,1,0},{0,0,1,1,0},{0,0,9,1,0}};
        printGrid(grid);
        Queue<Cell> queue = new LinkedList<>();

        // Initial position of the Bot
        move(grid, queue, 0, 0, 0);

        while(!queue.isEmpty()) {
            Cell botCell = queue.poll();
            // To move Left
            move(grid, queue, botCell.rowIndex-1, botCell.columnIndex, botCell.distance+1);
            // To move Right
            move(grid, queue, botCell.rowIndex+1, botCell.columnIndex, botCell.distance+1);
            // To move Top
            move(grid, queue, botCell.rowIndex, botCell.columnIndex-1, botCell.distance+1);
            // To move Bottom
            move(grid, queue, botCell.rowIndex, botCell.columnIndex+1, botCell.distance+1);
        }

    }


    private static void move(int[][] grid, Queue<Cell> queue, int rowIndex, int colIndex, int disIndex) {
        // Make sure the bot is inside the grid
        if(rowIndex >= 0 && rowIndex < grid.length && colIndex >= 0 && colIndex< grid[0].length){
            if(grid[rowIndex][colIndex] == 1){
                queue.add(new Cell(rowIndex, colIndex, disIndex));
                grid[rowIndex][colIndex] = -1; // Visited node
            } else if(grid[rowIndex][colIndex] == 9){
                System.out.println("We found the Post office at distance  " + disIndex);
                printGrid(grid);
                System.exit(0);
            }
        }
    }


    private static void printGrid(int[][] grid) {
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println(" ");
        }
    }
}
