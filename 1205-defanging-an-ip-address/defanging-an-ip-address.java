class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            sb.append(ch == '.' ? "[.]" : ch);
        }

        return sb.toString();
    }
}