package projects;

import java.util.List;

public class ListToArray {
	public static String[] String(List<String> input) {
		String[] output = new String[input.size()];
		for (int i = 0; i < input.size(); i++) output[i] = input.get(i);
		return output;	
	}
	public static Integer[] Integer(List<Integer> input) {
		Integer[] output = new Integer[input.size()];
		for (int i = 0; i < input.size(); i++) output[i] = input.get(i);
		return output;
	}
	public static int[] integer(List<Integer> input) {
		int[] output = new int[input.size()];
		for (int i = 0; i < input.size(); i++) output[i] = input.get(i);
		return output;
	}
	public static Boolean[] Boolean(List<Boolean> input) {
		Boolean[] output = new Boolean[input.size()];
		for (int i = 0; i < input.size(); i++) output[i] = input.get(i);
		return output;	
	}
	public static boolean[] bool(List<Boolean> input) {
		boolean[] output = new boolean[input.size()];
		for (int i = 0; i < input.size(); i++) output[i] = input.get(i);
		return output;	
	}
}
