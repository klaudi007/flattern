package com.citrusbyte;

import java.util.ArrayList;

public class Citrusbyte {

    public ArrayList<Integer> flatten(Object[] arr, ArrayList<Integer> store){
        for(int i = 0; i < arr.length; i++){
            if(isArray(arr[i])){
                flatten((Object[]) arr[i], store);
            }
            else{
                store.add((Integer) arr[i]);
            }
        }
        return store;
    }

    public ArrayList<Integer> flat(Object[] arr){
        return flatten(arr, new ArrayList<>());
    }

    public static boolean isArray(Object obj) {
        Class<?> c = obj.getClass();
        return  c.isArray();
//        return  c.isArray() && c.getComponentType().isPrimitive();
    }
}


/**
 *
 *
 * this is javascript solution
 *
 *
 * */
/**
 *
const flatteren = (arr, store = []) => {
           for(let i=0; i<arr.length; i++){
                if(isArr(arr[i])){
                    flatteren(arr[i], store);
                    }
                else{
                    store.push(arr[i]);
                    }
                }
            return store;
        }


 const isArr = (e) => e.length > 0 ? true : false;

 console.log(flatteren([1, 2, 3,[ 4, 5, [6, 7]],8]));

 */
