package string.problems;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count;
        //convert to lowercase
        //st=st.toLowerCase();
        //split into words
        String word[] = st.split(" ");

        for(int i=0;i<word.length;i++) {
            count = 1;

            for (int j=i+1;j<word.length;j++){
                if(word[i].equals(word[j])){
                    count++;
                    word[j]="0";

                }
        }
            if(count>1 && word[i]!="0");
            System.out.println(word[i]+"-"+count);
            count=1;

            //avg length of the word
            //int totalLength =word.length*count;
            //System.out.println(totalLength);

            }
        }
    }


