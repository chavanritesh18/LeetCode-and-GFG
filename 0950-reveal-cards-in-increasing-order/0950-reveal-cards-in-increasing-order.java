class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
         Arrays.sort(deck);

        Queue<Integer> queue = new LinkedList<>();

        for(int i = deck.length - 1; i >= 0; --i) {
            if(queue.size() > 0)
                queue.add(queue.poll());
            queue.add(deck[i]);
        }

        for(int i = deck.length - 1; i >= 0; --i)
            deck[i] = queue.poll();

        return deck;
    }
}