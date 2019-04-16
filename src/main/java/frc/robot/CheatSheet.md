Code Conventions and Style for Robot Software

Indent: 2 or 4 spaces

For Loops:

    for (int [var: i, x, j, k, l, m, n] = [some number]; [var] < [other var (usually array.length)]; i++) {
        [Your code here];
    }

If Statements:

    Single:
    if (Param) [Your code here];

    Multi:
    if (Param) {
        [Your code here];
    }
    else if (Param) {
        [Your code here];
    }
    else {
        [Your code here];
    }

    OR

    if (Param) {
        [Your code here];
    } else if (Param) {
        [Your code here];
    } else {
        [Your code here];
    }

While Loops:

    while(Param) {
        [Your code here];
    }

Class/Methods:

    [scope] [return] [Name](Params) {
        [Your code here];
    }

Math and variable manipulation:

    Good:
    double speedVal = (slowVal * input) + 5;

    Bad:
    double speedVal=(slowVal*input)+5;

Booleans:

    for boolean bool = true;
    Good:
    if (bool) doThis();

    Bad:
    if (bool == true) doThis();

    for boolean bool = false;
    Good:
    if (!bool) doThis;

    Bad:
    if (bool == false) doThis();
    
    for boolean bool1 = false, bool2 = true;
    Good:
    if (bool1 || (bool2 && bool1)) doThis();
    
    Bad:
    if (bool1||(bool2&&bool1)) doThis();

Strings:

    Good:
    String str = ("" + someVar + otherVar);

    Bad:
    String str=""+someVar+otherVar;
