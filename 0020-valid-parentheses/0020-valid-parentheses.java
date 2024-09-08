class Solution {
     public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char word : s.toCharArray()) {
            if (word == '(' || word == '{' || word == '[') {
                stack.push(word);
            } else if (word == ')' || word == '}' || word == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char firstWord = stack.pop();

                if ((firstWord == '(' && word != ')') 
                    || (firstWord == '{' && word != '}') 
                    || (firstWord == '[' && word != ']')) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}