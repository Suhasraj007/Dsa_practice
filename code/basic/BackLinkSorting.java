import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class BackLinkSorting{
    public static void main(String[] args) {
        String [] webPages = {"abcde","netgy","swissbook","test","gear"};
        int [] backLinks = {111,10,1,50,50};

        backLinkSort(webPages,backLinks);
    }
    public static void backLinkSort(String [] webPages, int [] backLinks ){
        int size1 = webPages.length;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(b.backLink - a.backLink == 0){
                return -1;
            }
            return b.backLink - a.backLink;
        });

        int i = 0;
        int j = 0;
        while(i < size1){
            Pair obj = new Pair(webPages[i],backLinks[j]);
            i++; j++;
            pq.add(obj);
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().webPage);
        }
    }
}
class Pair{
    String webPage;
    int backLink;
    public Pair(String webPage, int backLink){
        this.webPage = webPage;
        this.backLink = backLink;
    }
}