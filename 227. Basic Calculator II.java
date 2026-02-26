class Solution {
  public int calculate(String s) {
    int ans = 0;
    int curNum = 0;
    int pNum = 0;
    char op ='+';
    for (int i = 0; i < s.length(); ++i) {
      final char c = s.charAt(i);
      if (Character.isDigit(c))
        curNum = curNum * 10 + (c - '0');
      if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
        if (op == '+' || op == '-') {
          ans += pNum;
          pNum = op == '+' ? curNum : -curNum;
        } else if (op == '*') {
          pNum *= curNum;
        } else if (op == '/') {
          pNum /= curNum;
        }
        op = c;
        curNum = 0;
      }
    }

    return ans + pNum;
  } 
}

