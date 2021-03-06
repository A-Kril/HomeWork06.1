package BehavioralPatterns.Iterator;

class Tasks implements Container {
    String[] tasks = {"Build a house", "Have a son", "Plant a tree"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
