bool isBalanced(string parentheses) {
    
    stack<char> stk;
    for (char c : parentheses) {

//stack implementation required guidance
        if (c == '(') {
            stk.push(c);
        }
        else {
            if (stk.empty()) {
                return false;
            }
            else {
                if (c == ')' && stk.top() == '(') {
                    stk.pop();
                }
                else {
                    return false;
                }
            }   
        } 
    }

    return stk.empty(); //was edited post feedback

}
