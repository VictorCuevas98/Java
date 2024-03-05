public class FindCycleSteps {
    public int findSteps(int[] array, int initialIndex){
        //the position has not yet be marked we will continue
        int currentIndex = initialIndex;
        int nextIndex;
        int steps = 0;
        while(true){
            //will complete a cycle if the number is already visited
            if (array[currentIndex] == -1){
                return steps;
            }

            //mark as taken
            nextIndex = array[currentIndex];
            array[currentIndex] = -1;
            steps ++;

            // give the next step
            currentIndex = nextIndex;
        }
    }
}
