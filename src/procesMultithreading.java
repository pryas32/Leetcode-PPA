
import java.lang.Thread;

public class procesMultithreading {

    process->
    it refers
    to the
    software or
    the program.
    which is
    dospacted from
    their current
    state and
    scheduled into
    CPU for execution
    eg an
    employee in
    an organisaation
    is assignd
    some resources
    and task
    adn work
    independenctly to
    complete those
    task
    similaryl proces
    is assguiedm
    some resources
    and memory
    in CPU for
    performning task.

    Thread ->
    it refers
    to the
    segment of
    the process .
    A process
    can have
    multiple thread
    inside it.

    multitasking->
    it mesn
    running more
    than one
    task simantaneuously for
    effective CPU
    utilization
    synchronized->
    ts used
    when we
    want to
    control the
    access of
    shared rfesources
    in multithreaded
    env .

    Synchronized block
    and synchronized method
    add synchronized keyword for mwthod
for
    blocks you
    keep that
    block inside
    synchronized(this)

    {

    }
okdone

    it ca be acheieveed in two ways

    1.Multiprocessing->it measn runnign more than one process concurrently
//             running any software on a system refers to a proces
//    eg -> you are watching video on browser and simantaneously writing notes using notepad
//            so here two proces running simantaneously for effective CPU utlization.
//job scheduler schedules which thread to run and which one to wait
//            whenever we compiles a pgrm there is one therad which is running ie main therad.
//        It is the thread which finishes at the last .
//
//
//        Multithreading->it measn running more than oen thread within the process.IN this one thread if fails then it efffect task completion.
//        eg like you are watching video on browser and downloading files on browser .If browser fails then it will affect other task
//
//    2.
//
//

    ways of achieving multithreading in java.
    1.By Extending the thread class
    2.By implementing the runnable interface.
}
