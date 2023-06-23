---
title: Two Points
tags: ["kotlin", "operators"]
difficulty: medium
author: Yahor Barkouski
---
## Two Points

In the context of a two-dimensional grid, a point is represented by an `(x, y)` coordinate where x and y are integers. Your task is **to implement a function that adds two points together**.

You are given a template that includes a data class Point and a Solution class with an unimplemented solution function. 

```kotlin
data class Point(val x: Int, val y: Int) {
    // you can write code here if needed
}

class Solution {
    fun solution(a: Point, b: Point): Point {
        // write your solution here
    }
}
```

### Example 1 
```text
Input: a = Point(1, 2), b = Point(3, 4)
Output: Point(4, 6)
```

### Example 2
```text
Input: a = Point(-1, 1), b = Point(1, -1)
Output: Point(0, 0)
```

### Constaints
- -1000 ≤ x, y ≤ 1000
- Only one valid answer exists.
