import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class StramHerarchy {

    Stream herarchy and its methods


    base stream ->it has three methiods
            parallel->used for creating parallel stream;
    sequential stream ->its used for creating sequential stream
    unordered stream->used for creating unordered stream

    base stream has three stream in it


    IntStream
            LongStream
    DoubleStream
 these three are for primitive data type

 while Stream<T>->its used for non primitive data type.


    these method are for ->InitStream,LongStream,java.util.stream.DoubleStream;
 ie sum,average(they are non vertical)->that is they dont return modified stream
        boxed ->used for converting primitive stream to non primnitive data type ie (Integer ,Double,Long)

methods which are present in IntStream,LongStream,DoubleStream,and Stream<T>
            .filter (),.map(),findfirst(),sorted they return stream as oupuot ,skip(),reduce
        count(),sum(),min(),max() they dont return stream as output.












}
