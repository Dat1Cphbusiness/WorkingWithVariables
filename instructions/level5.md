# Level 5: Variable Roles - Temporary & Swap

## Level 5 fokuserer på:
- Temporary variables for intermediate calculations
- Swap variables (temp storage)
- Breaking complex calculations into steps
- Intermediate results
- Variable lifetime and scope
- The swap pattern (a, b, temp)
- Variable reuse
- Clarity through intermediate variables

---

## Begrebsgennemgang

### Temporary Variables
En **temporary variabel** holder en værdi midlertidigt under en beregning.

```java
double price = 100.0;
double taxRate = 0.25;

double tax = price * taxRate;        // Temp: beregn tax
double total = price + tax;          // Brug temp til final result

System.out.println("Total: " + total);  // 125.0
```

**Hvorfor bruge temp variables:**
- Gør komplekse beregninger lettere at læse
- Undgå at gentage samme beregning
- Debugging bliver nemmere
- Kan genbruge intermediate results

### Without vs With Temp Variables

**UDEN temp variables (svært at læse):**
```java
double result = ((100 * 1.25) + 50 - (100 * 1.25 * 0.1)) / 2;
```

**MED temp variables (klar og tydelig):**
```java
double basePrice = 100.0;
double markup = basePrice * 1.25;
double withExtra = markup + 50;
double discount = markup * 0.1;
double afterDiscount = withExtra - discount;
double result = afterDiscount / 2;
```

### Swap Pattern
**Swap pattern** bruges til at bytte to værdier rundt:

```java
int a = 10;
int b = 20;

// Swap med temp variable
int temp = a;    // Gem a's værdi
a = b;           // a får b's værdi
b = temp;        // b får a's gamle værdi

// Resultat: a=20, b=10
```

**Hvorfor temp variable er nødvendig:**
```java
// FORKERT - uden temp:
int a = 10;
int b = 20;
a = b;    // Nu er a=20
b = a;    // Nu er b=20 (begge er 20!)

// KORREKT - med temp:
int a = 10;
int b = 20;
int temp = a;  // temp=10
a = b;         // a=20
b = temp;      // b=10 (success!)
```

### Intermediate Results
Brug temp variables til at holde **intermediate results**:

```java
// Beregn total pris med discount
double originalPrice = 200.0;
double discountPercent = 15.0;

// Step by step med temp variables
double discountAmount = originalPrice * (discountPercent / 100);
double priceAfterDiscount = originalPrice - discountAmount;
double tax = priceAfterDiscount * 0.25;
double finalPrice = priceAfterDiscount + tax;

System.out.println("Final: " + finalPrice);
```

### Multi-Step Conversions
Temp variables gør conversions mere forståelige:

```java
// Celsius til Fahrenheit
double celsius = 25.0;

// Med intermediate steps
double multiplied = celsius * 9.0;
double divided = multiplied / 5.0;
double fahrenheit = divided + 32.0;

// Eller i én linje (men mindre klar):
// double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
```

### Reusing Temp Variables
Du kan genbruge temp variables (hvis de har samme type):

```java
double temp;  // Declare once

// First use
temp = 10.0 * 2.5;
System.out.println("First: " + temp);

// Reuse for different calculation
temp = 50.0 / 2.0;
System.out.println("Second: " + temp);
```

**Men:** Giv temp variables beskrivende navne hvis muligt!

### Descriptive vs Generic Names

**Generisk (ok til meget korte scopes):**
```java
double temp = price * 1.25;
double result = temp + 10;
```

**Beskrivende (bedre):**
```java
double priceWithMarkup = price * 1.25;
double finalPrice = priceWithMarkup + 10;
```

### Swapping Array Elements
Brug swap pattern i arrays:

```java
int[] numbers = {10, 20, 30, 40};

// Swap index 0 and 3
int temp = numbers[0];
numbers[0] = numbers[3];
numbers[3] = temp;

// Result: {40, 20, 30, 10}
```

### Variable Lifetime
Temp variables lever kun i deres scope:

```java
if (true) {
    int temp = 10;  // temp kun tilgængelig her
    System.out.println(temp);
}
// temp eksisterer IKKE her
```

### Complex Calculations Broken Down

**Eksempel: BMI beregning**
```java
double weightKg = 70.0;
double heightCm = 175.0;

// Step by step
double heightM = heightCm / 100.0;           // Convert to meters
double heightSquared = heightM * heightM;     // Height squared
double bmi = weightKg / heightSquared;        // Calculate BMI

System.out.println("BMI: " + bmi);
```

### Temp Variables vs Final Result

```java
// Temp variables - bruges kun internt
double temp1 = a + b;
double temp2 = temp1 * 2;
double temp3 = temp2 - c;

// Final result - dette er hvad vi faktisk vil have
double finalResult = temp3;

// Eller uden temp3:
double finalResult = temp2 - c;
```

### Common Temp Variable Patterns

**Pattern 1: Store then use**
```java
double intermediate = calculateSomething();
double result = intermediate * 2;
```

**Pattern 2: Swap**
```java
int temp = a;
a = b;
b = temp;
```

**Pattern 3: Multi-step calculation**
```java
double step1 = value * factor;
double step2 = step1 + offset;
double step3 = step2 / divisor;
```

**Pattern 4: Save before modify**
```java
int oldValue = currentValue;
currentValue = newValue;
System.out.println("Changed from " + oldValue + " to " + currentValue);
```

**Tag udgangspunkt i klasserne Calculator, DataSwapper, og Converter.**  
**Skriv din kode i Main.java i testLevel5() metoden.**

---

## Tips
- Brug temp variables til at gøre koden mere læsbar
- Giv temp variables beskrivende navne når muligt
- Swap kræver ALTID en temp variable
- Break komplekse beregninger i steps
- Temp variables kan genbruges (samme type)
- Test hver step individuelt ved debugging
- Print intermediate values for at verificere
- Al din kode skal placeres inde i `testLevel5()` metoden mellem tuborgklammerne `{}`

---

## Del A: Basic Temporary Variables

### Opgave 5.1: Din første temp variable
**Opgave:** 
1. Erklær double `price` = 100.0
2. Erklær double `taxRate` = 0.25
3. Erklær double `tax` = price * taxRate (temp variable)
4. Erklær double `total` = price + tax
5. Print total

**Forventet Output:**
```
125.0
```

---

### Opgave 5.2: Intermediate calculation
**Opgave:** 
1. Erklær int `width` = 5
2. Erklær int `height` = 3
3. Erklær int `area` = width * height (temp)
4. Erklær int `doubleArea` = area * 2
5. Print doubleArea

**Forventet Output:**
```
30
```

---

### Opgave 5.3: Multi-step calculation
**Opgave:** 
1. Erklær double `basePrice` = 200.0
2. Erklær double `discount` = basePrice * 0.1 (temp)
3. Erklær double `afterDiscount` = basePrice - discount (temp)
4. Erklær double `tax` = afterDiscount * 0.25 (temp)
5. Erklær double `finalPrice` = afterDiscount + tax
6. Print finalPrice

**Forventet Output:**
```
225.0
```

---

### Opgave 5.4: Temp with object
**Opgave:** 
1. Opret en Calculator: "Basic"
2. Erklær double `num1` = 10.0
3. Erklær double `num2` = 5.0
4. Erklær double `sum` = add(num1, num2) (temp)
5. Erklær double `product` = multiply(sum, 2.0)
6. Print product

**Forventet Output:**
```
30.0
```

---

### Opgave 5.5: Reusing temp variable
**Opgave:** 
1. Erklær double `temp`
2. temp = 10.0 * 2.0, print temp
3. temp = 50.0 / 5.0, print temp
4. temp = 100.0 - 25.0, print temp

**Forventet Output:**
```
20.0
10.0
75.0
```

---

## Del B: The Swap Pattern

### Opgave 5.6: Din første swap
**Opgave:** 
1. Erklær int `a` = 10
2. Erklær int `b` = 20
3. Print "Before: a=" + a + ", b=" + b
4. Erklær int `temp` = a
5. a = b
6. b = temp
7. Print "After: a=" + a + ", b=" + b

**Forventet Output:**
```
Before: a=10, b=20
After: a=20, b=10
```

---

### Opgave 5.7: Swap with doubles
**Opgave:** 
1. Erklær double `x` = 1.5
2. Erklær double `y` = 2.5
3. Swap x og y (brug temp)
4. Print x og y efter swap

**Forventet Output:**
```
2.5
1.5
```

---

### Opgave 5.8: Swap with Strings
**Opgave:** 
1. Erklær String `first` = "Hello"
2. Erklær String `second` = "World"
3. Print før swap
4. Swap (brug temp)
5. Print efter swap

**Forventet Output:**
```
Hello World
World Hello
```

---

### Opgave 5.9: Swap with object
**Opgave:** 
1. Opret en DataSwapper: "Test", 100, 200
2. Print before (displaySwapResult)
3. Call swap()
4. Print after (displaySwapResult)

**Forventet Output:**
```
A=100, B=200
A=200, B=100
```

---

### Opgave 5.10: Multiple swaps
**Opgave:** 
1. Erklær int `a` = 1, `b` = 2, `c` = 3
2. Print original values
3. Swap a og b
4. Swap b og c
5. Print final values

**Forventet Output:**
```
Original: 1 2 3
Final: 2 3 1
```

---

## Del C: Swapping Array Elements

### Opgave 5.11: Swap array elements
**Opgave:** 
1. Erklær int array: {10, 20, 30, 40}
2. Print "Before: " + array
3. Swap index 0 og 3 (brug temp)
4. Print "After: " + array

**Forventet Output:**
```
Before: 10 20 30 40
After: 40 20 30 10
```

---

### Opgave 5.12: Swap adjacent elements
**Opgave:** 
1. Erklær String array: {"A", "B", "C", "D"}
2. Swap index 1 og 2
3. Print array

**Forventet Output:**
```
A C B D
```

---

### Opgave 5.13: Reverse array
**Opgave:** 
1. Erklær int array: {1, 2, 3, 4, 5}
2. Swap first og last
3. Swap second og second-last
4. Swap middle stays (odd length)
5. Print reversed array

**Forventet Output:**
```
5 4 3 2 1
```

---

### Opgave 5.14: Swap in loop
**Opgave:** 
1. Erklær int array: {10, 20, 30, 40, 50, 60}
2. Loop gennem første halvdel
3. Swap hver med mirror position fra end
4. Print array

**Forventet Output:**
```
60 50 40 30 20 10
```

---

### Opgave 5.15: Conditional swap
**Opgave:** 
1. Erklær int array: {5, 2, 8, 1, 9, 3}
2. Loop gennem array
3. Hvis array[i] > array[i+1], swap dem
4. Print array after one pass

**Forventet Output:** (partial sort)
```
2 5 1 8 3 9
```

---

## Del D: Breaking Down Complex Calculations

### Opgave 5.16: Temperature conversion steps
**Opgave:** 
1. Erklær double `celsius` = 25.0
2. Erklær double `multiplied` = celsius * 9.0 (step 1)
3. Erklær double `divided` = multiplied / 5.0 (step 2)
4. Erklær double `fahrenheit` = divided + 32.0 (step 3)
5. Print fahrenheit

**Forventet Output:**
```
77.0
```

---

### Opgave 5.17: Multi-step with object
**Opgave:** 
1. Opret en Converter: "TempConverter"
2. Erklær double `tempC` = 100.0
3. Erklær double `tempF` = celsiusToFahrenheit(tempC) (temp)
4. Erklær double `backToC` = fahrenheitToCelsius(tempF) (temp)
5. Print original og converted back (should match)

**Forventet Output:**
```
100.0
100.0
```

---

### Opgave 5.18: Discount calculation steps
**Opgave:** 
1. Erklær double `originalPrice` = 500.0
2. Erklær double `discount1` = originalPrice * 0.2 (20% off)
3. Erklær double `afterFirst` = originalPrice - discount1
4. Erklær double `discount2` = afterFirst * 0.1 (additional 10%)
5. Erklær double `finalPrice` = afterFirst - discount2
6. Print finalPrice

**Forventet Output:**
```
360.0
```

---

### Opgave 5.19: Distance conversion chain
**Opgave:** 
1. Opret en Converter: "Distance"
2. Erklær double `miles` = 10.0
3. Erklær double `km` = milesToKilometers(miles) (temp)
4. Erklær double `backToMiles` = kilometersToMiles(km) (temp)
5. Print alle tre values

**Forventet Output:**
```
10.0
16.0934
10.0
```

---

### Opgave 5.20: BMI calculation
**Opgave:** 
1. Erklær double `weightKg` = 70.0
2. Erklær double `heightCm` = 175.0
3. Erklær double `heightM` = heightCm / 100.0 (temp)
4. Erklær double `heightSquared` = heightM * heightM (temp)
5. Erklær double `bmi` = weightKg / heightSquared
6. Print bmi

**Forventet Output:**
```
22.857142857142858
```

---

## Del E: Intermediate Results

### Opgave 5.21: Save before modify
**Opgave:** 
1. Erklær int `score` = 100
2. Erklær int `oldScore` = score (temp - save original)
3. score = score + 50
4. Print "Changed from " + oldScore + " to " + score

**Forventet Output:**
```
Changed from 100 to 150
```

---

### Opgave 5.22: Track changes
**Opgave:** 
1. Erklær double `balance` = 1000.0
2. Print initial balance
3. Erklær double `withdrawal` = 200.0
4. Erklær double `oldBalance` = balance (temp)
5. balance = balance - withdrawal
6. Print "Withdrew " + withdrawal + ", balance " + oldBalance + " → " + balance

**Forventet Output:**
```
1000.0
Withdrew 200.0, balance 1000.0 → 800.0
```

---

### Opgave 5.23: Running calculation
**Opgave:** 
1. Erklær double `value` = 10.0
2. Erklær double `result` = value
3. result = result * 2, print result
4. result = result + 5, print result
5. result = result / 3, print result

**Forventet Output:**
```
20.0
25.0
8.333333333333334
```

---

### Opgave 5.24: Chain calculations with object
**Opgave:** 
1. Opret en Calculator: "Chain"
2. Erklær double `num` = 5.0
3. Erklær double `step1` = multiply(num, 2) (temp)
4. Erklær double `step2` = add(step1, 10) (temp)
5. Erklær double `step3` = divide(step2, 4) (temp)
6. Print step3

**Forventet Output:**
```
5.0
```

---

### Opgave 5.25: Store intermediate for comparison
**Opgave:** 
1. Erklær int array: {10, 25, 15, 30, 20}
2. Erklær int `sum` = 0
3. Loop og add to sum
4. Erklær double `average` = sum / (double) array.length (temp)
5. Loop igen, count hvor mange er above average

**Forventet Output:**
```
2
```

---

## Del F: Temp Variables for Clarity

### Opgave 5.26: Readable calculation
**Opgave:** 
Beregn total cost med shipping:
1. Erklær double `itemPrice` = 50.0
2. Erklær int `quantity` = 3
3. Erklær double `subtotal` = itemPrice * quantity (temp)
4. Erklær double `tax` = subtotal * 0.25 (temp)
5. Erklær double `shipping` = 25.0
6. Erklær double `total` = subtotal + tax + shipping
7. Print total

**Forventet Output:**
```
212.5
```

---

### Opgave 5.27: Complex formula breakdown
**Opgave:** 
Calculate compound interest:
1. Erklær double `principal` = 1000.0
2. Erklær double `rate` = 0.05 (5%)
3. Erklær int `years` = 3
4. Erklær double `ratePerYear` = 1.0 + rate (temp)
5. Erklær double `afterYear1` = principal * ratePerYear (temp)
6. Erklær double `afterYear2` = afterYear1 * ratePerYear (temp)
7. Erklær double `afterYear3` = afterYear2 * ratePerYear
8. Print afterYear3

**Forventet Output:**
```
1157.625
```

---

### Opgave 5.28: Area and perimeter
**Opgave:** 
1. Erklær int `length` = 10
2. Erklær int `width` = 5
3. Erklær int `area` = length * width (temp)
4. Erklær int `perimeter` = 2 * (length + width) (temp)
5. Erklær int `combined` = area + perimeter
6. Print all values

**Forventet Output:**
```
Area: 50
Perimeter: 30
Combined: 80
```

---

### Opgave 5.29: Grade calculation
**Opgave:** 
1. Erklær int array: {85, 90, 78, 92, 88}  (scores)
2. Erklær int `sum` = 0 (temp)
3. Loop og sum
4. Erklær double `average` = sum / (double) array.length (temp)
5. Erklær String `grade` baseret på average
6. Print average og grade

**Forventet Output:**
```
86.6
B
```

---

### Opgave 5.30: Currency conversion chain
**Opgave:** 
1. Opret en Converter: "Currency"
2. Erklær double `usd` = 100.0
3. Erklær double `eur` = usdToEur(usd) (temp)
4. Erklær double `backToUsd` = eurToUsd(eur) (temp)
5. Erklær double `difference` = Math.abs(usd - backToUsd) (temp)
6. Print all values

**Forventet Output:** (dit eget design)

---

## Del G: Advanced Swap Patterns

### Opgave 5.31: Rotate three variables
**Opgave:** 
1. Erklær int `a` = 1, `b` = 2, `c` = 3
2. Print "Before: " + a, b, c
3. Rotate: a→temp, b→a, c→b, temp→c
4. Print "After: " + a, b, c

**Forventet Output:**
```
Before: 1 2 3
After: 2 3 1
```

---

### Opgave 5.32: Sort two values
**Opgave:** 
1. Erklær int `x` = 50
2. Erklær int `y` = 30
3. Hvis x > y, swap dem (så x er mindste)
4. Print x og y

**Forventet Output:**
```
30
50
```

---

### Opgave 5.33: Bubble sort one pass
**Opgave:** 
1. Erklær int array: {5, 2, 8, 1, 9}
2. Loop gennem array (til length-1)
3. Hvis array[i] > array[i+1], swap
4. Print array after pass

**Forventet Output:**
```
2 5 1 8 9
```

---

### Opgave 5.34: Swap with DataSwapper objects
**Opgave:** 
1. Opret to DataSwapper objekter:
   - swapper1: "First", 10, 20
   - swapper2: "Second", 30, 40
2. Swap valueA mellem swapper1 og swapper2
3. Display both

**Forventet Output:** (dit eget design)

---

### Opgave 5.35: Palindrome checker with swap
**Opgave:** 
1. Erklær String array: {"A", "B", "C", "B", "A"}
2. Erklær boolean `isPalindrome` = true
3. Loop gennem første halvdel
4. Compare med mirror position
5. Print isPalindrome

**Forventet Output:**
```
true
```

---

## Del H: Real-World Scenarios

### Opgave 5.36: Shopping cart calculation
**Opgave:** 
Beregn shopping cart total:
1. Erklær double[] prices = {25.50, 15.00, 30.00, 10.50}
2. Erklær double `subtotal` = sum af prices (temp)
3. Erklær double `memberDiscount` = subtotal * 0.1 (temp)
4. Erklær double `afterDiscount` = subtotal - memberDiscount (temp)
5. Erklær double `tax` = afterDiscount * 0.25 (temp)
6. Erklær double `finalTotal` = afterDiscount + tax
7. Print breakdown

**Forventet Output:** (dit eget design)

---

### Opgave 5.37: Recipe scaler
**Opgave:** 
Scale recipe quantities:
1. Erklær double[] originalQuantities = {2.0, 1.5, 0.5, 3.0}
2. Erklær double `scaleFactor` = 2.5
3. Erklær double[] scaledQuantities (temp array)
4. Loop og scale hver quantity
5. Print both arrays

**Forventet Output:** (dit eget design)

---

### Opgave 5.38: Temperature trend analyzer
**Opgave:** 
1. Erklær double[] temps = {20.0, 22.5, 21.0, 19.5, 23.0}
2. Calculate:
   - Average temp (brug temp for sum)
   - Max temp (brug temp)
   - Min temp (brug temp)
   - Range (max - min, brug temp)
3. Print statistics

**Forventet Output:** (dit eget design)

---

### Opgave 5.39: Payroll calculator
**Opgave:** 
Calculate employee payroll:
1. Erklær double `hourlyRate` = 150.0
2. Erklær int `hoursWorked` = 45
3. Erklær int `regularHours` = Math.min(hoursWorked, 40) (temp)
4. Erklær int `overtimeHours` = Math.max(hoursWorked - 40, 0) (temp)
5. Erklær double `regularPay` = regularHours * hourlyRate (temp)
6. Erklær double `overtimePay` = overtimeHours * hourlyRate * 1.5 (temp)
7. Erklær double `grossPay` = regularPay + overtimePay (temp)
8. Erklær double `tax` = grossPay * 0.3 (temp)
9. Erklær double `netPay` = grossPay - tax
10. Print breakdown

**Forventet Output:** (dit eget design)

---

### Opgave 5.40: Complete calculation system
**Opgave:** 
Opret et comprehensive calculation system:
1. Brug Calculator til basic operations
2. Brug Converter til unit conversions
3. Brug DataSwapper til data manipulation
4. Chain multiple calculations together
5. Use temp variables throughout
6. Print complete process with intermediate steps

**Forventet Output:** (dit eget design med comprehensive breakdown)

---

## Del I: Operator Precedence with Temp Variables

### Opgave 5.41: Why parentheses matter
**Opgave:** 
1. Erklær int `a` = 10
2. Erklær int `b` = 5
3. Erklær int `c` = 2
4. Erklær int `wrong` = a + b * c  (ingen parenteser)
5. Erklær int `correct` = (a + b) * c  (med parenteser)
6. Print begge og forklar forskellen

**Forventet Output:**
```
20
30
```
Forklaring: wrong = 10 + (5*2) = 20, correct = (10+5)*2 = 30

---

### Opgave 5.42: Complex calculation clarity
**Opgave:** 
1. Erklær double `price` = 100.0
2. Erklær double `quantity` = 3.0
3. Erklær double `discount` = 0.1
4. Uden temp variables (uklar):
   - Erklær double `messyTotal` = price * quantity - price * quantity * discount
5. Med temp variables (klar):
   - Erklær double `subtotal` = price * quantity
   - Erklær double `discountAmount` = subtotal * discount
   - Erklær double `clearTotal` = subtotal - discountAmount
6. Print begge (skal være samme)

**Forventet Output:**
```
270.0
270.0
```

---

### Opgave 5.43: Parentheses for safety
**Opgave:** 
1. Erklær int `score1` = 80
2. Erklær int `score2` = 90
3. Erklær int `score3` = 85
4. Beregn gennemsnit MED parenteser:
   - Erklær double `sum` = (double)(score1 + score2 + score3)  (temp)
   - Erklær double `average` = sum / 3.0
5. Print average
6. UDEN parenteser ville give forkert resultat!

**Forventet Output:**
```
85.0
```

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvornår bør du bruge temp variables vs direkte beregning?
2. Hvorfor er en temp variable nødvendig for swap?
3. Hvordan gør temp variables koden mere læsbar?
4. Hvad sker der hvis du prøver at swap uden temp variable?
5. Hvordan kan du bruge temp variables til debugging?
6. Hvornår ville du genbruge en temp variable?
7. Hvordan balancerer du mellem for mange og for få temp variables?
8. Hvorfor er parenteser vigtige i komplekse beregninger?
