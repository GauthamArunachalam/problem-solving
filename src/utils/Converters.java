package utils;

public class Converters {

    public static Integer convertPrimitiveToWrapper(int val){
        return new Integer(val);
    }

    public static Integer[] convertPrimitiveToWrapper(int[] arr){
        Integer[] ret = new Integer[arr.length];
        for(int i=0; i<arr.length;i++){
            ret[i] = convertPrimitiveToWrapper(arr[i]);
        }
        return ret;
    }
}
