class Solution {
    public boolean isValid(String s) {
       Stack<Character> st = new Stack<>();
       for(int i=0;i<s.length();i++){
           char p = s.charAt(i);
            if((p == '{' )||( p=='[' )||(p== '(')){
                st.push(p);
            }else{
                if(st.isEmpty()){

               
                return false; }
            
            if((st.peek()=='[' && p==']') || 
               (st.peek()=='{' && p=='}') || 
               (st.peek()=='(' && p==')')){
                st.pop();
            }else{
                return false;
            }
            }
       } 
       if(st.isEmpty()){
        return true;
       }else{
        return false;
       }
    }
}
