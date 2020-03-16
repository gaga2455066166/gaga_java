package 作业0226;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (map.get(charArray[i]) == null) {
                map.put(charArray[i], 1);
            }
            else {
            	
                map.put(charArray[i], map.get(charArray[i]) + 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        
        System.out.println("遍历键和值");
        Set<Character> characters = map.keySet();
        Collection<Integer> address = map.values();
        Iterator<Character> iterator = characters.iterator();
        Iterator<Integer> addressesIterator = address.iterator();
        while (iterator.hasNext()) {
        	stringBuilder.append(String.format("%c(%d)", iterator.next(), addressesIterator.next()));
        }
        
        System.out.println(stringBuilder);
    }

}
