Method Types
    Void With Parameters (vwp)
    Void Without Parameters (vwop)
    Return With Parameters (rwp)
    Return Without Parameters (rwop)

[ Differences ]
(assuming the proccesses need scanner input,and needs a println output)

(VWOP)
: Initialization, Input, Process and Output is on this method
and it just needs to be called by main.
: Basically moving everything that would normally be in main, outside.

(VWP)
: Only Process and Output is done on this method. Initialization
and Input needs to be done in main, 

-Return type in general-
: Requires the process/output variables initialized inside the method.
: : ie. the `sum` variable in an addition method.

(RWP)
: Initialization, Input and half of the output is in main. The process and
half of the output is on the method. Full output requires System.out.println();
inside main, where the method will then be called.

(RWOP)
: Initialization and Process is done outside main. Initialization
requires globally declared (input) variables which the return method 
will then read. The method contains the process and half of the output
Only the input and the other half of the output need to be done in main. 
Output requires the function System.out.println() inside main.;
        
: In universal.java , this type was also used to shorten the parsed 
scanner input. From `Integer.parseInt(sc.nextLine());` to `scanInt();`