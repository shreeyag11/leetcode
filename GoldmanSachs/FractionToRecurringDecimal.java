class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        // Check if numerator is 0
        if(numerator == 0)
            return "0";
        
        StringBuilder res = new StringBuilder();
        
        // Check if negative
        res.append((numerator > 0) ^ (denominator > 0) ? "-" : "");
        
        // Convert to long
        long num = Math.abs((long)numerator);        
        long denom = Math.abs((long)denominator);

        // Append the values before decimal
        res.append(num / denom);
        
        num %= denom;
        // Check if remainder is 0
        if(num == 0)
            return res.toString();
        else
            res.append(".");
        
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(num, res.length());
        while(num != 0) {
            num *= 10;
            res.append(num / denom);
            num %= denom;
            if(map.containsKey(num)) {
                int index = map.get(num);
                res.insert(index, "(");
                res.append(")");
                break;
            }
            else
                map.put(num, res.length());
        }
        
       return res.toString();
}
}