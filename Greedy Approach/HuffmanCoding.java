import java.util.PriorityQueue;
import java.util.HashMap;
class HuffmanNode {
    char data;
    int frequency; 
    HuffmanNode left, right; 
    HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = right = null;
    }
}
public class HuffmanCoding {
    public static void main(String[] args) {
        String message = "Huffman coding is a lossless data compression algorithm.";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : message.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<HuffmanNode> priorityQueue =
          new PriorityQueue<>((a, b) -> a.frequency - b.frequency);
        for (char c : frequencyMap.keySet()) {
            priorityQueue.add(new HuffmanNode(c, frequencyMap.get(c)));
        }
        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();
            HuffmanNode newNode =
              new HuffmanNode('$', left.frequency + right.frequency);
          
            newNode.left = left;
            newNode.right = right;
            priorityQueue.add(newNode);
        }
        HuffmanNode root = priorityQueue.poll();
        System.out.println("Huffman codes:");
        printCodes(root, new StringBuilder());
    }
    public static void printCodes(HuffmanNode root, StringBuilder code) {
        if (root == null) return;
        if (root.data != '$') {
            System.out.println(root.data + ": " + code);
        }
        if (root.left != null) {
            printCodes(root.left, code.append('0'));
            code.deleteCharAt(code.length() - 1);
        }
        if (root.right != null) {
            printCodes(root.right, code.append('1'));
            code.deleteCharAt(code.length() - 1);
        }
    }
}