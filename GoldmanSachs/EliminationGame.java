class Solution {
    public int lastRemaining(int n) {
        List<Integer> list = new ArrayList();
        if (n == 1)
            return 1;
        for (int i = 2; i <= n; i += 2)
            list.add(i);

        while (list.size() != 1) {
            for (int right = list.size() - 1; right >= 0; right -= 2)
                list.remove(list.get(right));

            if (list.size() == 1)
                break;

            for (int left = 0; left < list.size(); left++)
                list.remove(list.get(left));
        }

        return list.get(0);
    }
}

// Time limit exceed
// class Solution {
// public int lastRemaining(int n) {
// List<Integer> list = new ArrayList();
// if (n == 1)
// return 1;
// for(int i = 2; i <= n; i+=2)
// list.add(i);

// while(list.size() != 1) {
// for(int right = list.size() - 1; right >= 0; right-=2)
// list.remove(list.get(right));

// if(list.size() == 1)
// break;

// for(int left = 0; left < list.size(); left++)
// list.remove(list.get(left));
// }

// return list.get(0);
// }
// }
