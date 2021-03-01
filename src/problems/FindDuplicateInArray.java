package problems;

import java.util.List;

class FindDuplicateInArray {
    public int repeatedNumber(final List<Integer> A) {

        //FLOYD Cycle Detection


        //set both pointers to head
        Integer tortoise = A.get(0);
        Integer hare = A.get(0);

        //Phase 1, hare is doubly fast then tortoise(hare for a reason :))
        do {
            tortoise = A.get(tortoise);
            hare = A.get(A.get(hare));
        } while (!tortoise.equals(hare)); //break when they intersect(are equal) at some point


        //Phase 2, put tortoise to start, reduce the speed of hare to match with tortoise
        //This time when they intersect it will be the duplicate element.
        tortoise = A.get(0);
        while (!tortoise.equals(hare)) {
            tortoise = A.get(tortoise);
            hare = A.get(hare);
        }

        return hare;
    }
}