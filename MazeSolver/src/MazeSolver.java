
import java.util.Arrays;
import java.util.LinkedList;

public class MazeSolver {
	
	static int[][] maze = {
			{2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1},
			{0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0},
			{1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
			{0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1},
			{1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1},
			{1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1},
			{1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1},
			{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1}
	};
	
	// 0 = wall
	// 1 = path
	// 2 = destination
	
	static LinkedList<Position> path = new LinkedList<Position>();
	
	public static void main(String[] args) {
		Position p = new Position(0, 10);
		path.push(p);
		
		while(true) {
			int x = path.peek().x;
			int y = path.peek().y;
			maze[y][x] = 0;
/*			
			System.out.println("\nPosition: " + y + ", " + x);
			System.out.print("Down: ");
//*/
			//down
			if(isValid(y+1, x)) {
				if(maze[y+1][x]==2) {
					System.out.println(Color.GREEN + "Moved Down" + Color.RESET + "\n\nYou Won!");
					System.out.println(Arrays.deepToString(maze));
					return;
				}else if(maze[y+1][x]==1) {
					System.out.println(Color.GREEN + "Moved Down" + Color.RESET);
					path.push(new Position(y+1, x));
					continue;
				}
			}
/*
			System.out.print("Left: ");
//*/
			//left
			if(isValid(y, x-1)) {
				if(maze[y][x-1]==2) {
					System.out.println(Color.CYAN + "Moved Left" + Color.RESET + "\n\nYou Won!");
					System.out.println(Arrays.deepToString(maze));
				}else if(maze[y][x-1]==1) {
					System.out.println(Color.CYAN + "Moved Left" + Color.RESET);
					path.push(new Position(y, x-1));
					continue;
				}
			}
/*
			System.out.print("Up: ");
//*/
			//up
			if(isValid(y-1, x)) {
				if(maze[y-1][x]==2) {
					System.out.println(Color.YELLOW + "Moved Up" + Color.RESET + "\n\nYou Won!");
					System.out.println(Arrays.deepToString(maze));
					return;
				}else if(maze[y-1][x]==1) {
					System.out.println(Color.YELLOW + "Moved Up" + Color.RESET);
					path.push(new Position(y-1, x));
					continue;
				}
			}	
/*
			System.out.print("Right: ");
//*/
			//right
			if(isValid(y, x+1)) {
				if(maze[y][x+1]==2) {
					System.out.println(Color.PURPLE + "Moved Right" + Color.RESET + "\n\nYou Won!");
					System.out.println(Arrays.deepToString(maze));
					return;
				}else if(maze[y][x+1]==1) {
					System.out.println(Color.PURPLE + "Moved Right" + Color.RESET);
					path.push(new Position(y, x+1));
					continue;
				}
			}
			 
			//backtrack
			System.out.println(Color.RED + "Moved Back" + Color.RESET);

			path.pop();
			if(path.size() == 0) {
				System.out.println("No Path");
				return;
			}
		}
	}
	
	public static boolean isValid(int y, int x) {
		if(y < 0 || y >= maze.length) {
/*
			System.out.println("Out Of Bounds y = " + y + " | 0 - " + (maze.length - 1) + " |");
//*/
			return false;
		} else if(x < 0 || x >= maze[y].length) {
/*
			System.out.println("Out Of Bounds x = " + x + " | 0 - " + (maze[y].length - 1) + " |");
//*/
			return false;
		}
/*
		System.out.println("In Bounds");
//*/
		return true;
	}
	
	
}
