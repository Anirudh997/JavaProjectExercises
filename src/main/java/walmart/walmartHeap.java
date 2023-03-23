package walmart;

public class walmartHeap {
    private int[] heapArray;
    private int heapSize;
    private int maxChildren;

    public walmartHeap(int maxChildren) {
        this.maxChildren = maxChildren;
        this.heapArray = new int[10]; // initial size of the array
        this.heapSize = 0;
    }

    public void insert(int val) {
        if (heapSize >= heapArray.length) {
            increaseArraySize();
        }
        heapArray[heapSize] = val;
        heapifyUp(heapSize);
        heapSize++;
    }

    public int popMax() {
        if (heapSize == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int maxVal = heapArray[0];
        heapSize--;
        heapArray[0] = heapArray[heapSize];
        heapifyDown(0);
        return maxVal;
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / maxChildren;
        if (index > 0 && heapArray[parentIndex] < heapArray[index]) {
            swap(parentIndex, index);
            heapifyUp(parentIndex);
        }
    }

    private void heapifyDown(int index) {
        int maxChildIndex = getMaxChildIndex(index);
        if (maxChildIndex != -1 && heapArray[maxChildIndex] > heapArray[index]) {
            swap(maxChildIndex, index);
            heapifyDown(maxChildIndex);
        }
    }

    private int getMaxChildIndex(int index) {
        int firstChildIndex = index * maxChildren + 1;
        int lastChildIndex = Math.min(firstChildIndex + maxChildren - 1, heapSize - 1);
        if (firstChildIndex > lastChildIndex) {
            return -1;
        }
        int maxChildIndex = firstChildIndex;
        for (int i = firstChildIndex + 1; i <= lastChildIndex; i++) {
            if (heapArray[i] > heapArray[maxChildIndex]) {
                maxChildIndex = i;
            }
        }
        return maxChildIndex;
    }

    private void swap(int i, int j) {
        int temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;
    }

    private void increaseArraySize() {
        int[] newArray = new int[heapArray.length * 2];
        System.arraycopy(heapArray, 0, newArray, 0, heapArray.length);
        heapArray = newArray;
    }
}
