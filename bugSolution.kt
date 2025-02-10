The solution depends on what you want to achieve.  If you want to modify the original list, use `removeIf` or `removeAll`. If you need to preserve the original list, use `filter` to create a new list containing only the desired elements.

For example, to remove even numbers and keep the original list:
```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]
}
```
To remove even numbers and create a new list:
```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }
    println(newList) // Output: [1, 3, 5]
    println(list) // Output: [1, 2, 3, 4, 5] // Original list unchanged
}
```