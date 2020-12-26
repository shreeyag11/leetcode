public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0)
            return res;
        res.add(new ArrayList<>());
        res.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevR = res.get(i - 1);
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(prevR.get(j - 1) + prevR.get(j));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}
