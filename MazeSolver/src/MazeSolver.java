
import java.util.LinkedList;

public class MazeSolver {
	
	static Maze Set = new Maze();
	
	static int[][] maze;
	
	static LinkedList<Position> path = new LinkedList<Position>();
	
	public static void main(String[] args) {
		Maze.setMaze(Mazes.maze1); // chose maze here
		maze = Set.getMaze();
		
		Maze.printMaze(maze);
		Position start = getStart(maze);
		Position p = start;
		path.push(p);
		
		
		
		Boolean run = true;
		while(run == true) {
			int x = path.peek().x;
			int y = path.peek().y;
			
			if (maze[y][x] == 2) {
				System.out.println("Found end at start.");
				run = false;
				continue;
			}
			
			maze[y][x] = -1;
/*			
			System.out.println("\nPosition: " + y + ", " + x);
			System.out.print("Down: ");
//*/
			//down
			if(isValid(y+1, x)) {
				if(maze[y+1][x]==2) {
					System.out.println(Color.GREEN + "Moved Down" + Color.RESET + "\n\nYou Won!");
					run = false;
					continue;
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
					run = false;
					continue;
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
					run = false;
					continue;
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
					run = false;
					continue;
				}else if(maze[y][x+1]==1) {
					System.out.println(Color.PURPLE + "Moved Right" + Color.RESET);
					path.push(new Position(y, x+1));
					continue;
				}
			}
			 
			//backtrack
			System.out.println(Color.RED + "Moved Back" + Color.RESET);
			maze[y][x] = 3;
			path.pop();
			if(path.size() == 0) {
				System.out.println("No Path");
				run = false;
//				return;
			}
		}
		
		//set and print solved maze
		if (maze[start.y][start.x] == -1) {
			maze[start.y][start.x] = -2;
		}
		Maze.setMazeSoved(maze);
		Maze.printSolution(maze);
		return;
	}
	
	private static boolean isValid(int y, int x) {
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
	
	private static Position getStart(int[][] m) {
		Position start = new Position(0, 0);
		for(int i = 0; i < m.length; i++) {
			for(int k = 0; k < m[i].length; k++) {
				if (m[i][k] == 3) {
					start.y = i;					
					start.x = k;
					return start;
				}
			}
		}
		System.out.println("No start found, starting at top left corner.");
		return start;
	}
}
