# Level 4: Variable Roles - Index & Iterator

## Level 4 fokuserer på:
- Index variables (position i sekvens)
- Iterator variables (loop counters)
- Zero-based indexing
- Index arithmetic (index + 1, index - 1)
- Accessing array elements med index
- Index out of bounds awareness
- Forward og backward iteration
- Current position tracking

---

## Begrebsgennemgang

### Index Variables
En **index variabel** holder styr på en **position** i en sekvens (array, list, string).

```java
String[] names = {"Anna", "Bob", "Charlie"};
int index = 0;

System.out.println(names[index]);  // "Anna" (position 0)
index = 1;
System.out.println(names[index]);  // "Bob" (position 1)
```

**Typisk brug:**
- Spore nuværende position i array
- Navigate gennem elementer
- Markere hvor vi er i en proces

### Zero-Based Indexing
Java arrays starter ved index **0** (ikke 1):

```java
String[] colors = {"Red", "Green", "Blue"};
// Index:           0      1        2

System.out.println(colors[0]);  // "Red"
System.out.println(colors[1]);  // "Green"
System.out.println(colors[2]);  // "Blue"
```

**Vigtige regler:**
- Første element: index 0
- Sidste element: index array.length - 1
- Array med 5 elementer: index 0, 1, 2, 3, 4

### Iterator Variables
En **iterator variabel** bruges i loops til at tælle iterationer:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
// i er iterator variable
```

**Iterator som index:**
```java
String[] items = {"A", "B", "C", "D", "E"};
for (int i = 0; i < items.length; i++) {
    System.out.println(items[i]);  // i bruges som index
}
```

### Index Arithmetic
Du kan regne med index:

```java
int currentIndex = 2;
int nextIndex = currentIndex + 1;      // 3
int previousIndex = currentIndex - 1;  // 1
int lastIndex = items.length - 1;      // sidste element
```

**Common patterns:**
```java
// Go to next
index++;

// Go to previous
index--;

// Skip ahead
index += 3;

// Go to last
index = array.length - 1;

// Go to first
index = 0;
```

### Accessing Array Elements
Brug index til at få adgang til elementer:

```java
int[] scores = {100, 85, 92, 78, 88};

int firstScore = scores[0];       // 100
int thirdScore = scores[2];       // 92
int lastScore = scores[scores.length - 1];  // 88

// Med variabel index
int index = 3;
int score = scores[index];        // 78
```

### Index Out of Bounds
**VIGTIGT:** Index skal være inden for array bounds!

```java
int[] numbers = {10, 20, 30};  // Length: 3, valid indices: 0, 1, 2

int valid = numbers[0];     // OK - index 0
int valid2 = numbers[2];    // OK - index 2
int invalid = numbers[3];   // ERROR! Index out of bounds
int invalid2 = numbers[-1]; // ERROR! Negative index
```

**Sikker index check:**
```java
int index = 5;
if (index >= 0 && index < array.length) {
    System.out.println(array[index]);  // Safe
}
```

### Forward Iteration
Loop gennem array fra start til slut:

```java
String[] names = {"Alice", "Bob", "Charlie", "Diana"};

for (int i = 0; i < names.length; i++) {
    System.out.println("Index " + i + ": " + names[i]);
}

// Output:
// Index 0: Alice
// Index 1: Bob
// Index 2: Charlie
// Index 3: Diana
```

### Backward Iteration
Loop gennem array fra slut til start:

```java
String[] names = {"Alice", "Bob", "Charlie", "Diana"};

for (int i = names.length - 1; i >= 0; i--) {
    System.out.println("Index " + i + ": " + names[i]);
}

// Output:
// Index 3: Diana
// Index 2: Charlie
// Index 1: Bob
// Index 0: Alice
```

### Current Position Tracking
Brug index variabel til at huske position:

```java
int currentPage = 0;
String[] pages = {"Page 1", "Page 2", "Page 3"};

System.out.println(pages[currentPage]);  // "Page 1"

currentPage++;  // Go to next page
System.out.println(pages[currentPage]);  // "Page 2"

currentPage++;  // Go to next page
System.out.println(pages[currentPage]);  // "Page 3"
```

### Finding Elements med Index
Brug index til at finde position af element:

```java
String[] names = {"Alice", "Bob", "Charlie", "Bob", "Diana"};
String target = "Bob";
int foundIndex = -1;  // -1 betyder "not found"

for (int i = 0; i < names.length; i++) {
    if (names[i].equals(target)) {
        foundIndex = i;
        break;  // Stop ved første match
    }
}

if (foundIndex != -1) {
    System.out.println("Found at index: " + foundIndex);
}
```

### Index-Based Swapping
Brug index til at bytte elementer:

```java
int[] numbers = {10, 20, 30};

// Swap index 0 and 2
int temp = numbers[0];
numbers[0] = numbers[2];
numbers[2] = temp;

// Result: {30, 20, 10}
```

### Index Range Patterns

**First half:**
```java
for (int i = 0; i < array.length / 2; i++) {
    // Process first half
}
```

**Second half:**
```java
for (int i = array.length / 2; i < array.length; i++) {
    // Process second half
}
```

**Every other element:**
```java
for (int i = 0; i < array.length; i += 2) {
    // Process element at i (0, 2, 4, 6...)
}
```

### Iterator vs Index

**Iterator** - tæller iterationer:
```java
for (int iteration = 0; iteration < 10; iteration++) {
    System.out.println("Loop #" + iteration);
}
```

**Index** - peger på position:
```java
for (int index = 0; index < array.length; index++) {
    System.out.println(array[index]);  // Access element
}
```

Ofte bruges samme variabel til begge (i i loops).

**Tag udgangspunkt i klasserne ArrayNavigator, Playlist, og PageReader.**  
**Skriv din kode i Main.java i testLevel4() metoden.**

---

## Tips
- Husk: arrays starter ved index 0
- Sidste index er altid length - 1
- Check bounds før array access (>= 0 && < length)
- Brug i++ til at gå til næste index
- Brug i-- til at gå til forrige index
- Loop backwards: start ved length-1, stop ved >= 0
- Test med små arrays først
- Al din kode skal placeres inde i `testLevel4()` metoden mellem tuborgklammerne `{}`

---

## Del A: Basic Index Variables

### Opgave 4.1: Din første index
**Opgave:** 
1. Erklær String array: {"Apple", "Banana", "Cherry"}
2. Erklær int `index` = 0
3. Print array[index]
4. Set index = 1
5. Print array[index]

**Forventet Output:**
```
Apple
Banana
```

---

### Opgave 4.2: Last element
**Opgave:** 
1. Erklær int array: {10, 20, 30, 40, 50}
2. Erklær int `lastIndex` = array.length - 1
3. Print array[lastIndex]

**Forventet Output:**
```
50
```

---

### Opgave 4.3: Index arithmetic
**Opgave:** 
1. Erklær String array: {"A", "B", "C", "D", "E"}
2. Erklær int `index` = 2
3. Print array[index]
4. Erklær int `nextIndex` = index + 1
5. Print array[nextIndex]

**Forventet Output:**
```
C
D
```

---

### Opgave 4.4: Index with object
**Opgave:** 
1. Erklær String array: {"Song1", "Song2", "Song3", "Song4"}
2. Opret en Playlist: "My Playlist", array
3. Erklær int `track` = getCurrentSongIndex()
4. Print track
5. Print getCurrentSong()

**Forventet Output:**
```
0
Song1
```

---

### Opgave 4.5: Moving index
**Opgave:** 
1. Erklær int array: {100, 200, 300, 400}
2. Erklær int `position` = 0
3. Print array[position]
4. position++
5. Print array[position]
6. position++
7. Print array[position]

**Forventet Output:**
```
100
200
300
```

---

## Del B: Zero-Based Indexing

### Opgave 4.6: Understanding zero-based
**Opgave:** 
1. Erklær String array: {"First", "Second", "Third"}
2. Print "Element at index 0: " + array[0]
3. Print "Element at index 1: " + array[1]
4. Print "Element at index 2: " + array[2]

**Forventet Output:**
```
Element at index 0: First
Element at index 1: Second
Element at index 2: Third
```

---

### Opgave 4.7: Array length vs last index
**Opgave:** 
1. Erklær int array: {5, 10, 15, 20, 25}
2. Print "Array length: " + array.length
3. Print "Last index: " + (array.length - 1)
4. Print "Last element: " + array[array.length - 1]

**Forventet Output:**
```
Array length: 5
Last index: 4
Last element: 25
```

---

### Opgave 4.8: First, middle, last
**Opgave:** 
1. Erklær String array: {"Start", "Middle1", "Middle2", "End"}
2. Erklær int `firstIndex` = 0
3. Erklær int `middleIndex` = array.length / 2
4. Erklær int `lastIndex` = array.length - 1
5. Print alle tre elementer

**Forventet Output:**
```
Start
Middle2
End
```

---

### Opgave 4.9: Index boundaries
**Opgave:** 
1. Erklær double array: {1.5, 2.5, 3.5, 4.5}
2. Print første element (index 0)
3. Print sidste element (index length-1)
4. Print "Valid indices: 0 to " + (array.length - 1)

**Forventet Output:**
```
1.5
4.5
Valid indices: 0 to 3
```

---

### Opgave 4.10: Safe array access
**Opgave:** 
1. Erklær String array: {"One", "Two", "Three"}
2. Erklær int `index` = 5
3. Hvis (index >= 0 && index < array.length), print array[index]
4. Ellers print "Index out of bounds"

**Forventet Output:**
```
Index out of bounds
```

---

## Del C: Iterator Variables in Loops

### Opgave 4.11: Basic for loop iterator
**Opgave:** 
1. Erklær String array: {"A", "B", "C", "D"}
2. Loop med for (int i = 0; i < array.length; i++)
3. Print "Index " + i + ": " + array[i]

**Forventet Output:**
```
Index 0: A
Index 1: B
Index 2: C
Index 3: D
```

---

### Opgave 4.12: Sum with iterator
**Opgave:** 
1. Erklær int array: {10, 20, 30, 40, 50}
2. Erklær int `sum` = 0
3. Loop gennem array med iterator i
4. sum += array[i]
5. Print sum

**Forventet Output:**
```
150
```

---

### Opgave 4.13: Iterator as counter and index
**Opgave:** 
1. Erklær double array: {1.1, 2.2, 3.3, 4.4, 5.5}
2. Loop gennem array
3. Print "Item " + (i + 1) + ": " + array[i]
   (i+1 giver item number 1-5, ikke 0-4)

**Forventet Output:**
```
Item 1: 1.1
Item 2: 2.2
Item 3: 3.3
Item 4: 4.4
Item 5: 5.5
```

---

### Opgave 4.14: Even indices only
**Opgave:** 
1. Erklær String array: {"A", "B", "C", "D", "E", "F"}
2. Loop med i += 2 (start 0)
3. Print array[i]

**Forventet Output:**
```
A
C
E
```

---

### Opgave 4.15: Accessing with object
**Opgave:** 
1. Erklær String array: {"Page1", "Page2", "Page3", "Page4", "Page5"}
2. Opret en PageReader: "Book", array
3. Loop gennem pages (0 to getTotalPages()-1)
4. Print getPageAt(i)

**Forventet Output:**
```
Page1
Page2
Page3
Page4
Page5
```

---

## Del D: Forward and Backward Iteration

### Opgave 4.16: Forward iteration
**Opgave:** 
1. Erklær int array: {5, 10, 15, 20, 25}
2. Loop forward (0 to length-1)
3. Print each element

**Forventet Output:**
```
5
10
15
20
25
```

---

### Opgave 4.17: Backward iteration
**Opgave:** 
1. Erklær String array: {"First", "Second", "Third", "Fourth"}
2. Loop backward (length-1 to 0)
3. Print each element

**Forventet Output:**
```
Fourth
Third
Second
First
```

---

### Opgave 4.18: Both directions
**Opgave:** 
1. Erklær int array: {1, 2, 3, 4, 5}
2. Print "Forward:"
3. Loop forward og print
4. Print "Backward:"
5. Loop backward og print

**Forventet Output:**
```
Forward:
1 2 3 4 5
Backward:
5 4 3 2 1
```

---

### Opgave 4.19: Navigation with object
**Opgave:** 
1. Erklær String array: {"Red", "Green", "Blue"}
2. Opret en ArrayNavigator med array
3. Erklær int `index` = 0
4. Loop mens index < getLength()
5. Print getAt(index)
6. index++

**Forventet Output:**
```
Red
Green
Blue
```

---

### Opgave 4.20: Reverse with index
**Opgave:** 
1. Erklær double array: {1.0, 2.0, 3.0, 4.0}
2. Loop backward
3. Print "Position " + i + ": " + array[i]

**Forventet Output:**
```
Position 3: 4.0
Position 2: 3.0
Position 1: 2.0
Position 0: 1.0
```

---

## Del E: Finding Elements with Index

### Opgave 4.21: Find first occurrence
**Opgave:** 
1. Erklær int array: {10, 20, 30, 40, 50}
2. Erklær int `target` = 30
3. Erklær int `foundIndex` = -1
4. Loop gennem array
5. Hvis array[i] == target, set foundIndex = i og break
6. Print foundIndex

**Forventet Output:**
```
2
```

---

### Opgave 4.22: Find with String
**Opgave:** 
1. Erklær String array: {"Apple", "Banana", "Cherry", "Date"}
2. Erklær String `target` = "Cherry"
3. Erklær int `position` = -1
4. Loop og find
5. Print position hvis found, ellers print "Not found"

**Forventet Output:**
```
2
```

---

### Opgave 4.23: Find all occurrences
**Opgave:** 
1. Erklær int array: {5, 10, 5, 20, 5, 30}
2. Erklær int `target` = 5
3. Loop gennem array
4. Hvis array[i] == target, print "Found at index: " + i

**Forventet Output:**
```
Found at index: 0
Found at index: 2
Found at index: 4
```

---

### Opgave 4.24: Find maximum position
**Opgave:** 
1. Erklær int array: {23, 67, 12, 89, 45}
2. Erklær int `maxValue` = array[0]
3. Erklær int `maxIndex` = 0
4. Loop gennem array
5. Hvis array[i] > maxValue, update både maxValue og maxIndex
6. Print "Max value " + maxValue + " at index " + maxIndex

**Forventet Output:**
```
Max value 89 at index 3
```

---

### Opgave 4.25: Search in object
**Opgave:** 
1. Erklær String array: {"Song A", "Song B", "Song C", "Song D"}
2. Opret en Playlist: "Search", array
3. Erklær String `searchSong` = "Song C"
4. Loop gennem playlist
5. Hvis getSongAt(i).equals(searchSong), print index

**Forventet Output:**
```
2
```

---

## Del F: Index-Based Operations

### Opgave 4.26: Swapping elements
**Opgave:** 
1. Erklær int array: {10, 20, 30, 40}
2. Print "Before: " + alle elementer
3. Swap index 0 og 3 (brug temp variable)
4. Print "After: " + alle elementer

**Forventet Output:**
```
Before: 10 20 30 40
After: 40 20 30 10
```

---

### Opgave 4.27: Modify at specific indices
**Opgave:** 
1. Erklær int array: {1, 2, 3, 4, 5}
2. Double værdien ved index 1, 3
3. Print array

**Forventet Output:**
```
1 4 3 8 5
```

---

### Opgave 4.28: Copy range
**Opgave:** 
1. Erklær String array: {"A", "B", "C", "D", "E", "F"}
2. Erklær int `startIndex` = 2
3. Erklær int `endIndex` = 4
4. Loop fra startIndex til endIndex (inclusive)
5. Print array[i]

**Forventet Output:**
```
C
D
E
```

---

### Opgave 4.29: Insert at index
**Opgave:** 
Simulate inserting element:
1. Erklær String array: {"A", "B", "D", "E"}  (C mangler)
2. Erklær String newArray med length+1
3. Erklær int `insertIndex` = 2
4. Copy elementer før insertIndex
5. Insert "C" ved insertIndex
6. Copy remaining elementer
7. Print new array

**Forventet Output:**
```
A B C D E
```

---

### Opgave 4.30: Delete at index
**Opgave:** 
Simulate deleting element:
1. Erklær int array: {10, 20, 30, 40, 50}
2. Erklær int `deleteIndex` = 2
3. Erklær new array med length-1
4. Copy all except element at deleteIndex
5. Print new array

**Forventet Output:**
```
10 20 40 50
```

---

## Del G: Current Position Tracking

### Opgave 4.31: Page navigation
**Opgave:** 
1. Erklær String array: {"Page 1", "Page 2", "Page 3", "Page 4"}
2. Opret en PageReader: "Guide", array
3. Print current page
4. nextPage() tre gange, print efter hver
5. previousPage(), print

**Forventet Output:**
```
Page 1
Page 2
Page 3
Page 4
Page 3
```

---

### Opgave 4.32: Song playlist navigation
**Opgave:** 
1. Erklær String array: {"Song1", "Song2", "Song3", "Song4", "Song5"}
2. Opret en Playlist: "Favorites", array
3. Print current song
4. nextSong() two gange
5. skipToIndex(4)
6. Print current song

**Forventet Output:**
```
Song1
Song5
```

---

### Opgave 4.33: Bookmark system
**Opgave:** 
1. Erklær String array: {"Ch1", "Ch2", "Ch3", "Ch4", "Ch5"}
2. Opret en PageReader: "Novel", array
3. goToPage(2)
4. addBookmark()
5. goToPage(4)
6. Print current page
7. goToBookmark()
8. Print current page

**Forventet Output:**
```
Ch5
Ch3
```

---

### Opgave 4.34: Loop with state
**Opgave:** 
1. Erklær String array: {"Item A", "Item B", "Item C"}
2. Opret en ArrayNavigator med array
3. While hasNext():
   - Print getCurrent()
   - next()
4. Print getCurrent() (last item)

**Forventet Output:**
```
Item A
Item B
Item C
```

---

### Opgave 4.35: Full navigation system
**Opgave:** 
Opret et complete navigation system:
1. Erklær String array med 10 items
2. Opret en ArrayNavigator
3. Navigate forward til middle
4. Print current
5. Navigate backward til start
6. Navigate to specific index
7. Print complete navigation log

**Forventet Output:** (dit eget design)

---

## Del H: Advanced Index Patterns

### Opgave 4.36: Sliding window
**Opgave:** 
1. Erklær int array: {1, 2, 3, 4, 5, 6, 7}
2. Erklær int `windowSize` = 3
3. Loop gennem mulige window positions
4. For hver position, print window af 3 elementer

**Forventet Output:**
```
Window: 1 2 3
Window: 2 3 4
Window: 3 4 5
Window: 4 5 6
Window: 5 6 7
```

---

### Opgave 4.37: Compare adjacent elements
**Opgave:** 
1. Erklær int array: {10, 20, 15, 30, 25}
2. Loop gennem array (til length-1)
3. Compare array[i] med array[i+1]
4. Print hvis current < next

**Forventet Output:**
```
10 < 20
15 < 30
```

---

### Opgave 4.38: Pairs processing
**Opgave:** 
1. Erklær int array: {1, 2, 3, 4, 5, 6}
2. Loop med i += 2
3. Print "Pair: " + array[i] + " and " + array[i+1]

**Forventet Output:**
```
Pair: 1 and 2
Pair: 3 and 4
Pair: 5 and 6
```

---

### Opgave 4.39: Multi-object coordination
**Opgave:** 
1. Opret to Playlist objekter: "Rock" og "Pop"
2. Erklær int `syncedIndex` = 0
3. Loop 3 gange:
   - Print song fra begge playlists ved syncedIndex
   - syncedIndex++

**Forventet Output:** (dit eget design)

---

### Opgave 4.40: Complex index management
**Opgave:** 
Opret et system der:
1. Tracker multiple indices (current, previous, next, bookmark)
2. Validates all indices
3. Navigates through collection
4. Prints complete state after each operation
5. Demonstrates all index operations

**Forventet Output:** (dit eget design med comprehensive index tracking)

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvorfor starter arrays ved index 0?
2. Hvad er forskellen mellem array.length og sidste index?
3. Hvordan undgår du index out of bounds errors?
4. Hvad er forskellen mellem iterator og index variable?
5. Hvordan looper du backwards gennem et array?
6. Hvordan finder du position af et element i array?
7. Hvornår ville du bruge index arithmetic (index + 1)?
