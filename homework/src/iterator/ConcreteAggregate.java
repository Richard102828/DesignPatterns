package iterator;

public class ConcreteAggregate extends Aggregate {

    private Object[] mArray;

    public ConcreteAggregate(int size) {
        mArray = new Object[size];
    }

    public void add(int index, Object o) {
        mArray[index] = o;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator();
    }

    public class ConcreteIterator implements Iterator {
        //两个变量用于记录索引
        private int currentIndex;
        private int lastIndex;
        private int size;

        public ConcreteIterator() {
            lastIndex = 0;
            currentIndex = 0;
            size = mArray.length;
        }

        @Override
        public Object first() {
            currentIndex = 0;
            lastIndex = 0;
            return mArray[0];
        }

        @Override
        public Boolean hasNext() {
            return currentIndex < size - 1;
        }

        /**
         * 这个方法的遍历不能将最后一个元素遍历，日后完善
         * @return
         */
        @Override
        public Object next() {
            if (hasNext()) {
                lastIndex = currentIndex++;
                return mArray[lastIndex];
            }
            return null;
        }

        @Override
        public Object currentElement() {
            lastIndex = currentIndex;
            return mArray[currentIndex];
        }
    }
}
