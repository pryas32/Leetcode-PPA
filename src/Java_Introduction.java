public class Java_Introduction {
    public static void main(String[] args) {
                      Introduction to java pgraomming language
input devices-> the devices through which we give an input to eh computer
                like Keyboard ,mouse etc ...

        output devices ->the devices through which computer gives us an output eg scanner ,printer etc .

               Although scanner act as both input and output device taking input as scan givving output as print
               CPU(cnetral process unit)->used foe computation purpose
               memmory->used for storing the data
               there are mainly three type of memory
               1cache->its the memory ie present on th chip itself
                main memory ->its temporary memory
                (RAM)
                secondry memory ->permanenet staorage(ROM ,SSD);
why three type of memory ->cache is used for frequest pgrms
                should have low access time high cqapactiy and low elapsed time

                every pgrm that we run is bougyht into the main memory from ssd by operating system(known as manager of the computer)
        and is executed by CPU step.
        Our computer can understand only 0 & 1s
            for computer to understan our language we have C/C++ which have compiler and interpreter installed in it which used for converting high level level like C/C++\
        into low leve binary code.
                java is a platform independent ie ->ie it can run on any platform (like wndow +linux)() -> etc
                on compiltation our pgrm is converted inot java byte which is to be run on platform specific jVm
                while in case of C/C++ on compilation is converted into machine specific binary code it cant run on any other platform as both have different executable format

                java has easy compilation and complex running while C/C++ has complex compilation process
                C++/C/Java are statically typed language.
    means we need to declare variable name before using it.
structure of java pgrm


                public class abc{
                every code we write in java has to be part of some class.
                public static void main(String args[]){
                    public-> because it can be accessed outside the class as jvm run its outside the pkg.
                    static ->jvm dont want to create object of this class .
                    main ->this is frm where the execution of the pgrm begins
                            void ->jvm decides to have return type as null.
                        jvm decides to have array of strings as argument
                            System.out.println()
                                    out->its an object of println class for printing somwthing try {
                        System -> its a stand java class.

                         archecture of java class
                                jdk ->open soiurce foer development purpose provided by oracle
                                JRE->consist of JVm and java class libraries ->conssiting of librarues for runnng java pgrm
                                Java development tool->consist of specific tool for java development.


we need to specify path ->why ?
                                because there might be command present for running java pgrm.

                                when we write $javac then our pgrm is converted inot java bytecode
                                and then $java convert that bytecode into machine specific instructions.