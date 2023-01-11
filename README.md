## Last Digit Checker

### Description

Write a method named <b>hasSameLastDigit</b> with three parameters of type <b>int</b>. Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return <b>false</b>.

The method should return <b>true</b> if at least two of the numbers share the same rightmost digit; otherwise, it should return <b>false</b>.

### Examples of input/output

<ul>
<li>hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71</li>
<li>hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42</li>
<li>hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000</li>
</ul>
