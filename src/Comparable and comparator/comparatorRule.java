public class comparatorRule {
    comporable interface ->wrapper clas like Integer ,String ,long ,float ,double etc implements comparable interface
    data Strcuture like hasmap ,treemap,hashset,treeset etc implement comparable interface if we want different from natural order then need to implement compareTo(<T>) method instead explicitly this will sort treemap,treeset etc acc to that particular field.if want to sort acc to decreasing order of rollno the  sort(arr,collections.reverseOrder());



    Comparator Interface ->most widely used interface in java
            functions like min ,max ,hasmap ,treemap ,hashset,treeset etc implement comprator interface it hs maethiod public int compare(p1,p2) to implement.


    comparator interface implemented using sort(),min(),max(),binary_search(),treemap,hashmap,treeset ,hashset() etc

    comparator has functions like
    public interface comparator <T>
    {
        public int compare(p1,p2);

        comparator comparing()

 comparator.thenComparing()


         comparator.reverse()


        public int reverseOrder()



comparator.NullFirst(Comparator.naturanlOrder()

        compartator.nulllast(comparator.naurtalOrdering());




    }
