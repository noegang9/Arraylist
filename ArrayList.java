/**
 * The class ArrayList
 *
 * @author  Jake Tawney
 * @version 3/10/2019
 */

public class ArrayList{
    private int[] data;
    private int last; //index of the last element
    
    //set initial capacity to 10
    public ArrayList(){ 
        data = new int[10];
        last = -1;  //fix
    }

    //returns the number of elements in the list (not the capacity)
    public int size(){ //returns number of entries
        return last + 1;
    }
    
    //Precondition: 0 <= index <= last
    //return the element at that index
    public int get(int index){ //return number at index
        return data[index];
    }
    
    //Precondition:  0 <= index <= last
    //sets the value at index to the newValue
     public void set(int index, int newValue){ //makes index new value
         for (int i = index; i<last; i++){
        data[index] = newValue;
     
    }
}
    //Precondition:  0 <= index <= last
    //value at index is removed from the list – all elements shift down
    //returns removed value
    public int remove(int index){ //setting temp= array data w length of index. index= length of data
        int temp = data[index];
        for( int i = index; i < last; i++)
           data[i] = data[i + 1];
           last--; 
           return temp; 
    }
    
    //Precondition:  0 <= index <= last+1
    //Inserts newValue at index.  Everything from index on gets shifted up
    public void add(int index, int newValue){ //if last value= length of data -1, it will resize length of array
      if (last == data.length - 1){
           resize();
        }
        for(int i= index <= last + 1++) { 
       data[i] = data[i + 1];
       data[index] = newValue;
       last ++;
    }
}
    //adds newValue to the end of the list
    public void add(int newValue){ //taking in new value, will add last number + 1 + new value
      add( last + 1, newValue);  
    }

    //private method means "not accessible outside the class"
    //This is intentional.
    //This method should double the capacity
    private void resize(){ //created temp array, setting data equal to it. will make data bigger
        int[]temp = newInt[data.length * 2];
        for (int i = 0; i < data.length; i++)
        temp[i] = data[i];
        data = temp;
    }
        
    //returns, for example, "[3, 6, 7, 9]"
    //This will be helpful for your debugging
    public String toString(){
        String result = "[";
        for(int i = 0; i < last; i++){
           result = result + newValue +",";
        }
        result = result + "]";
        return last = -1;
        return result;
    }

    //returns true if two lists have exactly the same elements
    //in exactly the same order
    public boolean equals(ArrayList otherList){
        int start = 0;
        int length = equals.length;
        ArrayList = i;
        other list = n;
        int get(int index);
        if (ArrayList.size() != otherList.size(){
            return false;
            {
              if(S.CharAt(i) != S.CharAt (n - 1)){
                  return false;
                }
                if (i >= n - 1){
                    return true;
                }
                equals(s, i, n);
             
              return true;
            }
            }
    
    
    }
}

