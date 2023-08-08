package blind75;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] elements){
        HashMap<String, List<String>> groupAnagrams = new HashMap<String, List<String>>();

        for(int i=0; i<elements.length; i++){
            TreeMap<Character, Integer> characterCount = new TreeMap<Character, Integer>();
            String str = elements[i];
            for(char c : str.toCharArray()){
                if(characterCount.containsKey(c)){
                    characterCount.put(c, characterCount.get(c) + 1);
                }else{
                    characterCount.put(c, 1);
                }
            }

            System.out.println(characterCount.toString());
            StringBuilder key = new StringBuilder();
            for(Character c : characterCount.keySet()){
                key.append(c + ""+ characterCount.get(c));
            }
            String keyCode = key.toString();
            System.out.println(keyCode);

            if(groupAnagrams.containsKey(keyCode)){
                groupAnagrams.get(keyCode).add(str);
            }else{
                List<String> array = new ArrayList<String>();
                array.add(str);
                groupAnagrams.put(keyCode, array);
            }
        }

        List<List<String>> ans = new ArrayList<List<String>>();
        for(String key : groupAnagrams.keySet()){
            ans.add(groupAnagrams.get(key));
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt();

        String[] elements = new String[n];
        for(int i=0;i<n; i++){
            System.out.println("Enter the "+ (i+1) +" element : ");
            elements[i] = scan.next();
        }

        List<List<String>> ans = groupAnagrams(elements);
        for(List<String> ele : ans){
            System.out.println(ele.toString());
        }
    }
}
