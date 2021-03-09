package Roblox;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0, j = people.length - 1;
        int count = 0;
        Arrays.sort(people);
        while (i < j) {
            if (people[i] + people[j] <= limit) {
                count++;
                people[i] = 0;
                people[j] = 0;
                i++;
            }
            j--;
        }
        for (int k = 0; k < people.length; k++)
            if (people[k] != 0)
                count++;
        return count;
    }
}
