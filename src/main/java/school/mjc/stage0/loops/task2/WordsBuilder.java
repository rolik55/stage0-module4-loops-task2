package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = 0;
        String result = "";
        while(i < chars.length) {
            result+= chars[i];
            i++;
        }
        System.out.print(result);
    }
}
