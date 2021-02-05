package SimplifyPath;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for(String s: dirs) {
            if(s.equals("")) continue;
            if(s.equals(".")) continue;
            if(s.equals("..")) stack.pollLast();
            else stack.add(s);
        }
        return "/" + String.join("/", stack);
    }
}
