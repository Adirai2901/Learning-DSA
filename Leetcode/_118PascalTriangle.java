import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // first element is always 1
            
            // fill the middle elements
            for (int j = 1; j < i; j++) {
                int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(val);
            }

            if (i > 0) row.add(1); // last element is also 1 (except for first row)
            
            triangle.add(row);
        }
        
        return triangle;
    }
}
