class Solution {
    public static boolean digitCount(String num) {
        for(int i = 0; i < num.length();i++){
            int count = 0;
            for(int j = 0 ;  j < num.length(); j++){
                if(Character.getNumericValue(num.charAt(j)) == i)
                    count++;
            }
            if(count != num.charAt(i)-'0')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        digitCount("1210");
    }
}
