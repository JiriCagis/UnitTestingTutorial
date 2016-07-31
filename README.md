<h1>Unit testing tutorial</h1>
<div>
   Goal this project is show usage unit testing on base data structure Stack, generator primes numbers by Sieve algorithm
   and mapping object from/to database. Unit tests are decide for verify part of source code. In our case are it methods 
   class. Unit tests are worth tool programmers when you find errors or change existing code. Right wrote unit tests
   save more time in later period, after program contains thousands lines. Next advance of unit testing is automatic run it.
   All tests in this tutorial are wrote in programming language Java with tool JUnit 4.0.
</div>
<h3>Stack</h3>
<div>
   Dynamic data structure for save data. Structure has rule that last inserted item is take away as first. Main functions are
   <b>push()</b> put item on top, <b>pop()</b> get item from top and remove it, <b>top()</b> get item on top without 
   remove it and <b>isEmpty()</b> verify whether stack contain any items.
</div>
<br>
<b>Example tests:</b>
<ul>
   <li>Create a Stack and verify that isEmpty is true</li>
   <li>Push a single object on the Stack and verify that IsEmpty is false</li>
   <li>Push a single object, Pop the object and verify that isEmpty is true</li>
   <li>Pop a Stack that has no elements</li>
   <li>Push a single object, remembering what they are: Pop each one, and verify that they are removed in the correct order.</li>
</ul>
<h3>Prime numbers</h3>
<div>
   Second part of project is focus on refactoring code mathematic library contains method generate primes.
   For generate primes is use algorithm Sieve of Eratothemes. To better understanding how work algorithm. Primes
   are numbers divisible only number one and itself, but number must be greater than number one. Change code was need,
   because into library was add method for get primes return instead array numbers list numbers and previous method is now deprecated. Moreover code algorithm was write in procedual style and illegibly.
</div>
<br>
<b>Refactoring</b>
<ol>
   <li>Hide method generateArray() set permission private.</li>
   <li>Copy code from generateArray to method generate and remove method generateArray.</li>
   <li>Rename variable (f --> isPrime).</li>
   <li>Collapse loops for place result to list.</li>
   <li>Remove dead code, variable count primes not need, because we new use dynamic data structure list.</li>
   <li>Collapse loop again (extend boundary algorithm from "Math.sqrt(s) + 1"  to "s" and join with add item to result.</li>
   <li>Reduce local variable scope.</li>
   <li>Replace temp variable "s" with query.</li>
   <li>Remove code rid know primes for 0 and 1, because algorithm not access to them.</li>
   <li>Simplify init isPrime with use build method Array.fill(). </li>
</ol>
<h3>Music library</h3>
