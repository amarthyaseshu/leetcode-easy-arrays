import java.util.TreeSet;

class SimilarPairs {

     public static void main(String[] args) {
       String[]  words = {"nba","cba","dba"};
             System.out.println( similarPairs(words));

     }

    //["aba","aabb","abcd","bac","aabc"]

     public static int similarPairs(String[] words) {
         int pair=0;
      for(int i=0;i<words.length-1;i++){
          for(int j=i+1;j<words.length;j++){

                if(filterDuplicate(words[i]).contentEquals(filterDuplicate(words[j]))){
                    pair++;
                }
          }
      }

         return pair;
     }

    private static  String filterDuplicate(String word) {
        TreeSet<Character> charSet=new TreeSet<Character>();
     for(Character chars:word.toCharArray()){
         charSet.add(chars);
     }
     String str="";
      for(Character c:charSet){
        str=   str.concat(c+"");
        }

      return str;
    }
}
