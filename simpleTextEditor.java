import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
                Editor editor = new Editor();

        int numOps = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < numOps; i++) {
            String[] cmd = reader.readLine().split(" ");
            switch (cmd[0]) {
                case "1":
                    editor.append(cmd[1]);                    
                    break;
                case "2":
                    int lastK = Integer.parseInt(cmd[1]);
                    editor.delete(lastK);
                    break;
                case "3":
                    int k = Integer.parseInt(cmd[1]);
                    char c = editor.print(k);
                    writer.write(String.valueOf(c));
                    writer.newLine();
                    break;
                case "4":
                    editor.undo();
                    break;
            }
        }
        
        reader.close();
        writer.close();
    }
}

class Editor {
    private Deque<String[]> cmdHistory = new LinkedList<>();
    private StringBuilder sb = new StringBuilder();
    
    void append(String word) {
        cmdHistory.addFirst(new String[]{"append", String.valueOf(word.length())});
        doAppend(word);
    }
    
    private void doAppend(String word) {
        sb.append(word);    
    }
    
    void delete(int lastK) {
        String deleted = sb.toString().substring(sb.length() - lastK, sb.length());
        cmdHistory.addFirst(new String[]{"delete", deleted});
        doDelete(lastK);
    }
    
    private void doDelete(int lastK) {
        sb.delete(sb.length() - lastK, sb.length());
    }
    
    char print(int charAt) {
        return sb.charAt(charAt - 1);    
    }
    
    void undo(){
        String[] cmd = cmdHistory.pop();
        if (cmd[0].equals("append")) {
            int length = Integer.parseInt(cmd[1]);
            doDelete(length);
        } else if (cmd[0].equals("delete")) {
            String word = cmd[1];
            doAppend(word);
        }
    }
}