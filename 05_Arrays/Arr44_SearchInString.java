//linear search in strings

public class Arr44_SearchInString {
    public static void main(String[] args) {
        String name = "shivman";
        char target = 'm';

        //System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target));


    }

    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }


    //For each loop
    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }

        for(char ch: str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    
}
