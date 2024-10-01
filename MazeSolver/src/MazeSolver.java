
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MazeSolver {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Maze> mazes = new ArrayList<Maze>();
		
		Maze m = new Maze();
		
		Scanner in = new Scanner(new File("mazes.txt"));
		int rows = Integer.parseInt(in.nextLine());
		m.maze = new int[rows][];
		
		for (int i = 0; i < rows; i++) {
			String line = in.nextLine();
			m.maze[i] = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();
		}
		
		m.start = new Position(Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
		
		mazes.add(m);
		
		int i = 0;
		while (i < mazes.size()) {
			Maze e = mazes.get(i);
			
			System.out.println("New Maze");
			Maze.printMaze(e);
		
			if (solveMaze(e)) {
				System.out.println("You won!");
				Maze.printSolution(e.maze);
				System.out.println();
			} else {
				System.out.println("No Path\n");
			}
			
			i++;
		}
		
		in.close();
	}
	
	
	private static boolean solveMaze(Maze m) {
		Position p = m.start;
		m.path.push(p);
		
		Boolean run = true;
		while(run == true) {
			int x = m.path.peek().x;
			int y = m.path.peek().y;
			
			if (m.maze[y][x] == 2) {
				System.out.println("Found end at start.");
				run = false;
				continue;
			}
			
			m.maze[y][x] = -1;

			//down
			if(isValid(y+1, x, m)) {
				if(m.maze[y+1][x]==2) {
					System.out.println(Color.GREEN + "Moved Down" + Color.RESET + "\n");
					run = false;
					continue;
				}else if(m.maze[y+1][x]==1) {
					System.out.println(Color.GREEN + "Moved Down" + Color.RESET);
					m.path.push(new Position(y+1, x));
					continue;
				}
			}

			//left
			if(isValid(y, x-1, m)) {
				if(m.maze[y][x-1]==2) {
					System.out.println(Color.CYAN + "Moved Left" + Color.RESET + "\n");
					run = false;
					continue;
				}else if(m.maze[y][x-1]==1) {
					System.out.println(Color.CYAN + "Moved Left" + Color.RESET);
					m.path.push(new Position(y, x-1));
					continue;
				}
			}

			//up
			if(isValid(y-1, x, m)) {
				if(m.maze[y-1][x]==2) {
					System.out.println(Color.YELLOW + "Moved Up" + Color.RESET + "\n");
					run = false;
					continue;
				}else if(m.maze[y-1][x]==1) {
					System.out.println(Color.YELLOW + "Moved Up" + Color.RESET);
					m.path.push(new Position(y-1, x));
					continue;
				}
			}	

			//right
			if(isValid(y, x+1, m)) {
				if(m.maze[y][x+1]==2) {
					System.out.println(Color.PURPLE + "Moved Right" + Color.RESET + "\n");
					run = false;
					continue;
				}else if(m.maze[y][x+1]==1) {
					System.out.println(Color.PURPLE + "Moved Right" + Color.RESET);
					m.path.push(new Position(y, x+1));
					continue;
				}
			}
			
			//backtrack
			System.out.println(Color.RED + "Moved Back" + Color.RESET);
			m.maze[y][x] = -2;
			m.path.pop();
			if(m.path.size() == 0) {
				run = false;
				return false;
			}
		}
		
		if (m.maze[m.start.y][m.start.x] == -1) {
			m.maze[m.start.y][m.start.x] = 3;
		}
		Maze.setMazeSolution(m.maze);
		return true;
	}
	
	private static boolean isValid(int y, int x, Maze m) {
		if(y < 0 || y >= m.maze.length) {
/*
			System.out.println("Out Of Bounds y = " + y + " | 0 - " + (maze.length - 1) + " |");
//*/
			return false;
		} else if(x < 0 || x >= m.maze[y].length) {
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
