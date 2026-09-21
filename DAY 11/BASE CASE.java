The base case tells recursion when to stop.

Example:

if (n == 0)
    return;

Without a base case:

function()
 ↓
function()
 ↓
function()
 ↓
...

This causes StackOverflowError.
