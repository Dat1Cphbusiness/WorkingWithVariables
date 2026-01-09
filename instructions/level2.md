# Level 2: Variable Roles - Counter & Accumulator

## Level 2 fokuserer på:
- Counter variables (tælle forekomster)
- Accumulator variables (summere værdier)
- Increment/decrement operators (++, --, +=, -=)
- Forskellen mellem count og sum
- Initialize før brug
- Multiple counters/accumulators
- Simple for loops som værktøj

---

## Begrebsgennemgang

### Counter Variables
En **counter variabel** holder styr på **hvor mange gange** noget sker.

```java
int count = 0;     // Start på 0
count++;           // Tæl én
count++;           // Tæl én mere
count++;           // Tæl én mere
// count er nu 3
```

**Typisk brug:**
- Tælle antal kunder
- Tælle antal elementer der opfylder en condition
- Tælle iterationer i en loop

### Accumulator Variables
En **accumulator variabel** holder styr på **totalen** af værdier.

```java
double sum = 0.0;  // Start på 0
sum += 10.5;       // Tilføj 10.5
sum += 15.0;       // Tilføj 15.0
sum += 8.75;       // Tilføj 8.75
// sum er nu 34.25
```

**Typisk brug:**
- Summere priser
- Beregne total score
- Akkumulere distance

### Counter vs Accumulator

**Counter - tæller ANTAL:**
```java
int numberOfPurchases = 0;
numberOfPurchases++;  // Købte noget
numberOfPurchases++;  // Købte noget igen
// numberOfPurchases = 2 (to køb)
```

**Accumulator - summerer VÆRDIER:**
```java
double totalSpent = 0.0;
totalSpent += 45.50;  // Første køb
totalSpent += 23.00;  // Andet køb
// totalSpent = 68.50 kr (total beløb)
```

### Increment Operators

**++ operator** (increment med 1):
```java
int count = 0;
count++;      // count er nu 1
count++;      // count er nu 2
count++;      // count er nu 3
```

**-- operator** (decrement med 1):
```java
int lives = 3;
lives--;      // lives er nu 2
lives--;      // lives er nu 1
```

**+= operator** (tilføj værdi):
```java
int score = 0;
score += 10;   // score er nu 10
score += 5;    // score er nu 15
score += 20;   // score er nu 35
```

**-= operator** (fratræk værdi):
```java
double balance = 100.0;
balance -= 25.0;   // balance er nu 75.0
balance -= 10.0;   // balance er nu 65.0
```

### Initialize Before Use
**VIGTIGT:** Altid initialiser counter/accumulator til 0 før brug!

```java
// KORREKT
int count = 0;      // Start på 0
count++;            // Nu er count 1

// FORKERT
int count;          // Ingen start værdi
count++;            // Fejl! Hvad er count + 1?
```

### Counter/Accumulator Pattern i Loops

**Counter i loop:**
```java
int count = 0;                    // Initialize
for (int i = 0; i < 10; i++) {
    if (numbers[i] > 5) {
        count++;                  // Count hver gang condition er true
    }
}
System.out.println("Found: " + count);
```

**Accumulator i loop:**
```java
double sum = 0.0;                 // Initialize
for (int i = 0; i < prices.length; i++) {
    sum += prices[i];             // Add hver værdi
}
System.out.println("Total: " + sum);
```

### Multiple Counters
Du kan have flere counters samtidig:

```java
int positiveCount = 0;
int negativeCount = 0;
int zeroCount = 0;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] > 0) {
        positiveCount++;
    } else if (numbers[i] < 0) {
        negativeCount++;
    } else {
        zeroCount++;
    }
}
```

### Multiple Accumulators
Du kan have flere accumulators samtidig:

```java
double totalIncome = 0.0;
double totalExpenses = 0.0;

for (int i = 0; i < transactions.length; i++) {
    if (transactions[i] > 0) {
        totalIncome += transactions[i];
    } else {
        totalExpenses += Math.abs(transactions[i]);
    }
}

double balance = totalIncome - totalExpenses;
```

### Simple For Loop Intro
Vi bruger simple for loops i dette level:

```java
// Loop 5 gange
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```

**Komponenter:**
- `int i = 0` - start værdi
- `i < 5` - fortsæt mens denne er true
- `i++` - increment efter hver iteration

### Combining Counter and Accumulator

```java
int count = 0;
double sum = 0.0;

for (int i = 0; i < numbers.length; i++) {
    count++;              // Tæl antal
    sum += numbers[i];    // Sum værdierne
}

double average = sum / count;  // Beregn gennemsnit
```

**Tag udgangspunkt i klasserne ScoreTracker, BudgetTracker, og EventCounter.**  
**Skriv din kode i Main.java i testLevel2() metoden.**

---

## Tips
- Initializer altid counters/accumulators til 0
- Brug ++ for at tælle én ad gangen
- Brug += for at tilføje værdier
- Counter tæller ANTAL, accumulator summer VÆRDIER
- Test med print statements undervejs
- Husk forskellen mellem count++ og count += 5
- Al din kode skal placeres inde i `testLevel2()` metoden mellem tuborgklammerne `{}`

---

## Del A: Basic Counter Variables

### Opgave 2.1: Din første counter
**Opgave:** 
1. Erklær int `count` = 0
2. Print count
3. Increment count med ++ tre gange
4. Print count

**Forventet Output:**
```
0
3
```

---

### Opgave 2.2: Counting in loop
**Opgave:** 
1. Erklær int `loopCount` = 0
2. Skriv en for loop der kører 5 gange
3. I hver iteration: loopCount++
4. Efter loop, print loopCount

**Forventet Output:**
```
5
```

---

### Opgave 2.3: Decrement operator
**Opgave:** 
1. Erklær int `lives` = 3
2. Print lives
3. Decrement lives med -- to gange
4. Print lives

**Forventet Output:**
```
3
1
```

---

### Opgave 2.4: Counter with object
**Opgave:** 
1. Opret en EventCounter: "Birthday Party"
2. Erklær int `guestCount` = 0
3. Brug en for loop der kører 5 gange
4. I hver iteration:
   - Call addAttendee()
   - Increment guestCount++
5. Print guestCount og getAttendees() (skal være samme)

**Forventet Output:**
```
5
5
```

---

### Opgave 2.5: Multiple increments
**Opgave:** 
1. Erklær int `total` = 0
2. Increment total++ 3 gange
3. Print total
4. Increment total++ 2 gange mere
5. Print total

**Forventet Output:**
```
3
5
```

---

## Del B: Basic Accumulator Variables

### Opgave 2.6: Din første accumulator
**Opgave:** 
1. Erklær double `sum` = 0.0
2. Print sum
3. Add 10.5 til sum (brug +=)
4. Add 15.0 til sum
5. Add 8.5 til sum
6. Print sum

**Forventet Output:**
```
0.0
34.0
```

---

### Opgave 2.7: Accumulating in loop
**Opgave:** 
1. Erklær double `total` = 0.0
2. Skriv en for loop: i fra 1 til 5 (inclusive)
3. I hver iteration: total += i
4. Efter loop, print total

**Forventet Output:**
```
15.0
```
(1+2+3+4+5 = 15)

---

### Opgave 2.8: Subtraction accumulator
**Opgave:** 
1. Erklær double `balance` = 100.0
2. Print balance
3. Subtract 25.0 (brug -=)
4. Subtract 10.0
5. Print balance

**Forventet Output:**
```
100.0
65.0
```

---

### Opgave 2.9: Accumulator with object
**Opgave:** 
1. Opret en BudgetTracker: "January"
2. Erklær double `totalIncome` = 0.0
3. Add income til tracker: 5000.0, 3000.0, 2000.0
4. For hver addIncome call, også add til totalIncome
5. Print totalIncome og getIncome() (skal være samme)

**Forventet Output:**
```
10000.0
10000.0
```

---

### Opgave 2.10: Accumulating prices
**Opgave:** 
1. Erklær double `totalPrice` = 0.0
2. Erklær et array: double[] prices = {19.99, 25.50, 12.00, 8.75}
3. Loop gennem prices
4. I hver iteration: totalPrice += prices[i]
5. Print totalPrice

**Forventet Output:**
```
66.24
```

---

## Del C: Counter vs Accumulator

### Opgave 2.11: Both together - basic
**Opgave:** 
1. Erklær int `count` = 0
2. Erklær double `sum` = 0.0
3. Erklær array: int[] numbers = {5, 10, 15, 20}
4. Loop gennem numbers
5. For hver: count++ og sum += numbers[i]
6. Print count og sum

**Forventet Output:**
```
4
50.0
```

---

### Opgave 2.12: Counting vs summing scores
**Opgave:** 
1. Opret en ScoreTracker: "Player1"
2. Erklær int `gamesCount` = 0
3. Erklær int `scoreSum` = 0
4. Erklær array: int[] scores = {100, 150, 200, 120}
5. Loop gennem scores:
   - addScore(scores[i])
   - gamesCount++
   - scoreSum += scores[i]
6. Print gamesCount, scoreSum, getGamesPlayed(), getTotalScore()

**Forventet Output:**
```
4
570
4
570
```

---

### Opgave 2.13: Average calculation
**Opgave:** 
1. Erklær int `count` = 0
2. Erklær double `sum` = 0.0
3. Erklær array: double[] values = {10.5, 20.0, 15.5, 30.0}
4. Loop gennem og count + sum
5. Erklær double `average` = sum / count
6. Print average

**Forventet Output:**
```
19.0
```

---

### Opgave 2.14: Income vs expenses
**Opgave:** 
1. Opret en BudgetTracker: "February"
2. Erklær double `incomeSum` = 0.0
3. Erklær double `expenseSum` = 0.0
4. Add income: 5000, 3000 (også til incomeSum)
5. Add expenses: 2000, 1500, 800 (også til expenseSum)
6. Print incomeSum, expenseSum, tracker balance

**Forventet Output:**
```
8000.0
4300.0
3700.0
```

---

### Opgave 2.15: Multiple categories
**Opgave:** 
1. Erklær int `foodCount` = 0
2. Erklær int `electronicsCount` = 0
3. Erklær double `foodTotal` = 0.0
4. Erklær double `electronicsTotal` = 0.0
5. Loop og kategoriser (brug conditionals):
   - Items under 50 kr: food
   - Items 50+ kr: electronics
6. Print alle fire værdier

**Forventet Output:** (dit eget design)

---

## Del D: Increment/Decrement Operators

### Opgave 2.16: += with different values
**Opgave:** 
1. Erklær int `score` = 0
2. score += 10
3. Print score
4. score += 25
5. Print score
6. score += 5
7. Print score

**Forventet Output:**
```
10
35
40
```

---

### Opgave 2.17: -= operator
**Opgave:** 
1. Erklær double `health` = 100.0
2. health -= 15.0
3. Print health
4. health -= 20.0
5. Print health

**Forventet Output:**
```
85.0
65.0
```

---

### Opgave 2.18: Mixed operators
**Opgave:** 
1. Erklær int `value` = 0
2. value++
3. value += 5
4. value++
5. value += 10
6. Print value

**Forventet Output:**
```
17
```

---

### Opgave 2.19: Counter with bulk additions
**Opgave:** 
1. Opret en EventCounter: "Concert"
2. Erklær int `localCount` = 0
3. addMultipleAttendees(10), localCount += 10
4. addMultipleAttendees(5), localCount += 5
5. addAttendee(), localCount++
6. Print localCount og getAttendees()

**Forventet Output:**
```
16
16
```

---

### Opgave 2.20: Decrement in loop
**Opgave:** 
1. Erklær int `countdown` = 10
2. Loop mens countdown > 0
3. Print countdown
4. countdown--

**Forventet Output:**
```
10
9
8
7
6
5
4
3
2
1
```

---

## Del E: Arrays with Counters/Accumulators

### Opgave 2.21: Count positive numbers
**Opgave:** 
1. Erklær int `positiveCount` = 0
2. Erklær array: int[] numbers = {-5, 10, -3, 15, 0, 8, -2}
3. Loop gennem numbers
4. Hvis number > 0: positiveCount++
5. Print positiveCount

**Forventet Output:**
```
3
```

---

### Opgave 2.22: Sum even numbers
**Opgave:** 
1. Erklær int `evenSum` = 0
2. Erklær array: int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
3. Loop gennem numbers
4. Hvis number % 2 == 0: evenSum += number
5. Print evenSum

**Forventet Output:**
```
30
```
(2+4+6+8+10 = 30)

---

### Opgave 2.23: Count and sum together
**Opgave:** 
1. Erklær int `largeCount` = 0
2. Erklær int `largeSum` = 0
3. Erklær array: int[] numbers = {5, 15, 8, 25, 12, 30, 7}
4. Loop gennem numbers
5. Hvis number > 10: largeCount++ og largeSum += number
6. Print både count og sum

**Forventet Output:**
```
4
82
```

---

### Opgave 2.24: Multiple accumulators
**Opgave:** 
1. Erklær double `priceSum` = 0.0
2. Erklær double `discountSum` = 0.0
3. Erklær array: double[] prices = {100, 200, 150, 300}
4. Loop gennem prices
5. priceSum += price
6. discountSum += price * 0.1 (10% discount)
7. Print både sums

**Forventet Output:**
```
750.0
75.0
```

---

### Opgave 2.25: Categorizing items
**Opgave:** 
1. Erklær tre counters: cheapCount, mediumCount, expensiveCount
2. Erklær array: double[] prices = {15, 75, 120, 45, 200, 30, 95}
3. Loop og kategoriser:
   - < 50: cheap
   - 50-100: medium
   - > 100: expensive
4. Print alle tre counts

**Forventet Output:**
```
3
2
2
```

---

## Del F: Real-World Scenarios

### Opgave 2.26: Shopping cart total
**Opgave:** 
1. Erklær int `itemCount` = 0
2. Erklær double `cartTotal` = 0.0
3. Erklær array: double[] itemPrices = {25.50, 10.00, 15.75, 8.25, 30.00}
4. Loop og add til cart
5. Print antal items og total

**Forventet Output:**
```
5
89.5
```

---

### Opgave 2.27: Test score analysis
**Opgave:** 
1. Erklær int `passingCount` = 0
2. Erklær int `failingCount` = 0
3. Erklær int `totalScore` = 0
4. Erklær array: int[] scores = {85, 45, 92, 55, 78, 30, 88}
5. Loop gennem scores:
   - totalScore += score
   - Hvis score >= 60: passingCount++, ellers failingCount++
6. Print alle tre værdier

**Forventet Output:**
```
4
3
473
```

---

### Opgave 2.28: Event attendance tracking
**Opgave:** 
1. Opret en EventCounter: "Wedding"
2. Erklær int `vipTotal` = 0
3. Erklær int `regularTotal` = 0
4. Simuler:
   - Add 5 VIP guests (loop)
   - Add 20 regular guests (loop)
5. Update vipTotal og regularTotal
6. Display event info

**Forventet Output:**
```
Event: Wedding
Total Attendees: 25
VIP Guests: 5
Regular Guests: 20
```

---

### Opgave 2.29: Budget analysis
**Opgave:** 
1. Opret en BudgetTracker: "March"
2. Erklær tre accumulators: salarySum, billSum, entertainmentSum
3. Add income (salary): 6000, 2000
4. Add expenses (bills): 3000, 1000
5. Add expenses (entertainment): 500, 300, 200
6. Update alle accumulators parallelt
7. Print alle sums og tracker balance

**Forventet Output:**
```
8000.0
4000.0
1000.0
3000.0
```

---

### Opgave 2.30: Game statistics
**Opgave:** 
1. Opret en ScoreTracker: "Champion"
2. Erklær int `wins` = 0
3. Erklær int `losses` = 0
4. Erklær int `totalPoints` = 0
5. Simuler 10 games:
   - Scores: 100, 50, 150, 75, 0, 200, 125, 0, 175, 100
   - Score 0 = loss, >0 = win
6. Update counters og tracker
7. Print complete statistics

**Forventet Output:**
```
Player: Champion
Total Score: 975
Games Played: 10
Average: 97.5
Wins: 8
Losses: 2
```

---

## Del G: Advanced Patterns

### Opgave 2.31: Running total
**Opgave:** 
1. Erklær double `runningTotal` = 0.0
2. Erklær array: double[] payments = {100, 50, 75, 25}
3. Loop gennem payments
4. For hver: add til runningTotal og print runningTotal

**Forventet Output:**
```
100.0
150.0
225.0
250.0
```

---

### Opgave 2.32: Streak counter
**Opgave:** 
1. Erklær int `currentStreak` = 0
2. Erklær int `maxStreak` = 0
3. Erklær array: boolean[] successes = {true, true, true, false, true, true, false}
4. Loop gennem:
   - Hvis true: currentStreak++
   - Hvis false: currentStreak = 0
   - Hvis currentStreak > maxStreak: maxStreak = currentStreak
5. Print maxStreak

**Forventet Output:**
```
3
```

---

### Opgave 2.33: Progressive discount
**Opgave:** 
1. Erklær int `itemCount` = 0
2. Erklær double `totalPrice` = 0.0
3. Erklær double `totalDiscount` = 0.0
4. Erklær array: double[] prices = {100, 100, 100, 100, 100}
5. Loop gennem:
   - itemCount++
   - Discount: 0% første item, 5% anden, 10% tredje, 15% fjerde+
   - Update totalPrice og totalDiscount
6. Print results

**Forventet Output:**
```
Items: 5
Total Price: 465.0
Total Discount: 35.0
```

---

### Opgave 2.34: Multi-category budget
**Opgave:** 
1. Erklær 4 accumulators: income, housing, food, transport
2. Erklær 4 counters: transactions i hver kategori
3. Simuler forskellige transaktioner
4. Print complete overview med totals og counts

**Forventet Output:** (dit eget design)

---

### Opgave 2.35: Complete statistics system
**Opgave:** 
Opret et complete statistics system:
1. Opret en ScoreTracker: "Tournament"
2. Erklær følgende local variables:
   - highScoreCount (scores > 150)
   - lowScoreCount (scores < 50)
   - mediumScoreCount (alle andre)
   - highScoreSum, lowScoreSum, mediumScoreSum
3. Simuler 15 games med forskellige scores
4. Update tracker og alle local counters/accumulators
5. Print comprehensive statistics

**Forventet Output:** (dit eget design med complete breakdown)

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem en counter og en accumulator?
2. Hvornår bruger du ++ vs +=?
3. Hvorfor skal counters/accumulators initialiseres til 0?
4. Hvad sker der hvis du glemmer at initialisere?
5. Kan du have flere counters samtidig?
6. Hvordan beregner du gennemsnit fra count og sum?
7. Hvornår ville du bruge -= i stedet for +=?
