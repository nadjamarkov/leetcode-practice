class RandomizedSet {

    ArrayList<Integer> numbers;
    HashMap<Integer, Integer> locations;

    public RandomizedSet() {
        // initialize variables numbers and locations
        // numbers is used as an array list - it stores actual elements
        numbers = new ArrayList<Integer>();
        // locations is a hash map that stores elements (key) and their locations (value)
        locations = new HashMap<Integer, Integer>();
    }
    
    public boolean insert(int val) {
        // check if the element is already in the hash map - if it is, don't add it again
        boolean contains = locations.containsKey(val);
        if(!contains){
            // add the value to the array list
            numbers.add(val);
            // update the hash map with the element and its index
            locations.put(val, numbers.size()-1);
        }
        return !contains;
    }
    
    public boolean remove(int val) {
        // if the value is not in the hash map, return false
        if(!locations.containsKey(val)) return false;
        // find the index of the value in the hash map
        int index = locations.get(val);
        // use this index to swap places in the array list - move this value to the end
        Collections.swap(numbers, index, numbers.size()-1);

        // get the value
        int swapped_value = numbers.get(index);
        // updating the hash map to the new index
        locations.put(swapped_value, index);

        // remove the last element of the arraylist
        numbers.remove(numbers.size()-1);
        // remove the element from the hashmap
        locations.remove(val);

        return true;
    }
    
    public int getRandom() {
        java.util.Random rand = new java.util.Random();
        return numbers.get(rand.nextInt(numbers.size()));
    }
}
