class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue<Integer> firstHalf = null;
    PriorityQueue<Integer> secondHalf = null;
    int size1 = 0;
    int size2 = 0;
    public MedianFinder() {
       firstHalf= new PriorityQueue<Integer>(Collections.reverseOrder());
       secondHalf= new PriorityQueue<Integer>(); 
        size1 = 0;
        size2 = 0;
    }
    
    public void addNum(int num) {
        if(size1 == 0 || firstHalf.peek() >= num)
        {
            firstHalf.add(num);
            size1++;
        }
        else
        {
            secondHalf.add(num);
            size2++;
        }
        if(size1 > size2+1)
        {
            secondHalf.add(firstHalf.poll());
            size2++;
            size1--;
        }
        if(size1+1 < size2)
        {
          firstHalf.add(secondHalf.poll());
            size2--;
            size1++;
        }
        
    }
    
    public double findMedian() {
        if(size1 > size2)
            return firstHalf.peek();
        if(size1 < size2)
            return secondHalf.peek();
        return (double) (firstHalf.peek()+secondHalf.peek())/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */