data class Point(val x: Int, val y: Int) {

    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

class Solution {

    fun solution(a: Point, b: Point): Point = a + b
}