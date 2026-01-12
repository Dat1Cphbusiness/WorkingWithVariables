# Level 1: Variable Basics & Primitive Types

## Level 1 fokuserer på:
- Variable declaration (erklæring)
- Variable initialization (initialisering)
- Variable assignment (tildeling)
- Primitive data types (int, double, boolean, char)
- Type compatibility
- Constants (final)
- Variable naming conventions
- Reassignment

---

## Begrebsgennemgang

### Hvad er en Variabel?
En **variabel** er en navngivet beholder der kan holde en værdi. Du kan tænke på det som en æske med et navn på, hvor du kan lægge ting i.

```java
int age;        // Erklærer en variabel kaldet "age"
age = 25;       // Tilføjer værdien 25 til variablen
```

### Declaration vs Initialization

**Declaration** (erklæring) - Opretter variablen:
```java
int age;           // Variablen eksisterer, men har ingen værdi
```

**Initialization** (initialisering) - Giver første værdi:
```java
age = 25;          // Nu har age værdien 25
```

**Declaration + Initialization** - Begge på én gang:
```java
int age = 25;      // Opretter OG giver værdi
```

### Assignment (Tildeling)
Du kan **ændre** værdien af en variabel:

```java
int age = 25;      // Først er age 25
age = 26;          // Nu er age 26
age = 30;          // Nu er age 30
```

### Primitive Data Types

Java har 4 hovedtyper af primitive data types (vi fokuserer på disse):

#### 1. **int** - Hele tal
```java
int age = 25;
int quantity = 100;
int temperature = -5;
```

#### 2. **double** - Decimaltal
```java
double price = 19.99;
double height = 1.75;
double temperature = 36.5;
```

#### 3. **boolean** - true eller false
```java
boolean isStudent = true;
boolean isRaining = false;
boolean hasDiscount = true;
```

#### 4. **char** - Enkelt tegn
```java
char grade = 'A';
char initial = 'M';
char symbol = '@';
```

**Vigtigt:** char bruger single quotes `'A'`, ikke double quotes `"A"`

### Variable Naming Conventions

**Gode navne:**
```java
int age;              // Beskrivende
double totalPrice;    // camelCase for flere ord
boolean isActive;     // boolean starter ofte med "is"
int studentCount;     // Tydeligt hvad den tæller
```

**Dårlige navne:**
```java
int a;               // For kort, ikke beskrivende
int TotalPrice;      // Skal ikke starte med stort bogstav
int total_price;     // Brug camelCase, ikke underscore
int x123;            // Meningsløst navn
```

**Regler:**
- Start med lille bogstav
- Brug camelCase for flere ord (firstWord, secondWord)
- Være beskrivende (age er bedre end a)
- Ingen mellemrum eller specialtegn (undtagen _)

### Type Compatibility

Du kan IKKE blande typer uden at være opmærksom:

```java
int age = 25;
age = 25.5;        // FEJL! Kan ikke putte double i int

double price = 19.99;
price = 20;        // OK! int kan automatisk blive til double
```

### Type Conversion

**int til double** (automatisk):
```java
int whole = 10;
double decimal = whole;  // decimal bliver 10.0
```

**double til int** (manuel - mister decimaler):
```java
double decimal = 10.75;
int whole = (int) decimal;  // whole bliver 10 (mister .75)
```

### Constants (final)
En **constant** er en variabel der IKKE kan ændres:

```java
final int MAX_AGE = 100;
MAX_AGE = 101;  // FEJL! Kan ikke ændre en final variabel
```

**Naming convention for constants:**
- ALLE_STORE_BOGSTAVER
- Underscore mellem ord

```java
final double PI = 3.14159;
final int MAX_STUDENTS = 30;
final boolean DEBUG_MODE = true;
```

### Reassignment
Du kan ændre værdien af en variabel (hvis den ikke er final):

```java
int score = 100;
System.out.println(score);  // 100

score = 200;
System.out.println(score);  // 200

score = score + 50;         // Brug gammel værdi til at beregne ny
System.out.println(score);  // 250
```

### Variables med Objects
Du kan også have variabler der holder objekter:

```java
Person person = new Person("Anna", "Jensen");
int age = person.getAge();           // Hent værdi fra objekt
person.setAge(25);                    // Sæt ny værdi i objekt
```

**Tag udgangspunkt i klasserne Temperature, Person, og Product.**  
**Skriv din kode i Main.java i testLevel1() metoden.**

**VIGTIGT:** Du skal IKKE implementere metoder i klasserne. Al kode skrives i testLevel1().

---

## Tips
- Erklær variabler med meningsfulde navne
- Initialiser variabler før du bruger dem
- int for hele tal, double for decimaltal
- boolean for true/false, char for enkelte tegn
- Brug final for værdier der ikke skal ændres
- camelCase for variable navne
- Print variabler ofte for at se deres værdier
- Al din kode skal placeres inde i `testLevel1()` metoden mellem tuborgklammerne `{}`

---

## Del A: Declaration & Initialization

### Opgave 1.1: Din første variabel
**Opgave:** 
1. Erklær en int variabel kaldet `myAge`
2. Initialiser den til din alder
3. Print variablen

**Forventet Output:** (eksempel)
```
25
```

---

### Opgave 1.2: Declaration og initialization separat
**Opgave:** 
1. Erklær en int variabel `score` (uden at initialisere)
2. På næste linje, tilføj værdien 100 til `score`
3. Print score

**Forventet Output:**
```
100
```

---

### Opgave 1.3: Declaration på én linje
**Opgave:** 
1. Erklær og initialiser en double variabel `price` til 49.99 på én linje
2. Print price

**Forventet Output:**
```
49.99
```

---

### Opgave 1.4: Multiple variables
**Opgave:** 
1. Erklær og initialiser tre variabler:
   - int `quantity` = 5
   - double `pricePerItem` = 12.50
   - boolean `inStock` = true
2. Print alle tre

**Forventet Output:**
```
5
12.5
true
```

---

### Opgave 1.5: Char variable
**Opgave:** 
1. Erklær en char variabel `grade` og initialiser til 'A'
2. Print grade

**Forventet Output:**
```
A
```

---

## Del B: Working with int

### Opgave 1.6: Int operations
**Opgave:** 
1. Erklær int `number` = 10
2. Print number
3. Reassign number til 20
4. Print number igen

**Forventet Output:**
```
10
20
```

---

### Opgave 1.7: Int calculation
**Opgave:** 
1. Erklær int `a` = 15
2. Erklær int `b` = 7
3. Erklær int `sum` = a + b
4. Print sum

**Forventet Output:**
```
22
```

---

### Opgave 1.8: Int with object
**Opgave:** 
1. Opret en Person: "Lars", "Nielsen"
2. Erklær int variabel `personAge` = 30
3. Brug setAge() til at sætte person's age til personAge
4. Brug getAge() til at hente age tilbage til en ny variabel `retrievedAge`
5. Print retrievedAge

**Forventet Output:**
```
30
```

---

### Opgave 1.9: Updating int
**Opgave:** 
1. Erklær int `counter` = 0
2. Print counter
3. Reassign counter til counter + 1
4. Print counter
5. Reassign counter til counter + 5
6. Print counter

**Forventet Output:**
```
0
1
6
```

---

### Opgave 1.10: Int from calculation
**Opgave:** 
1. Erklær int `width` = 5
2. Erklær int `height` = 3
3. Erklær int `area` = width * height
4. Print area

**Forventet Output:**
```
15
```

---

## Del C: Working with double

### Opgave 1.11: Double operations
**Opgave:** 
1. Erklær double `price` = 19.99
2. Print price
3. Reassign price til 24.99
4. Print price

**Forventet Output:**
```
19.99
24.99
```

---

### Opgave 1.12: Double calculation
**Opgave:** 
1. Erklær double `length` = 5.5
2. Erklær double `width` = 3.2
3. Erklær double `area` = length * width
4. Print area

**Forventet Output:**
```
17.6
```

---

### Opgave 1.13: Double with object
**Opgave:** 
1. Opret en Temperature: "Copenhagen"
2. Erklær double `temp` = 22.5
3. Brug setFahrenheit() til at sætte temperature til temp
4. Brug getFahrenheit() til at hente tilbage til `retrievedTemp`
5. Print retrievedTemp

**Forventet Output:**
```
22.5
```

---

### Opgave 1.14: Int to double
**Opgave:** 
1. Erklær int `wholeNumber` = 10
2. Erklær double `decimalNumber` = wholeNumber
3. Print decimalNumber (bemærk det bliver 10.0)

**Forventet Output:**
```
10.0
```

---

### Opgave 1.15: Double precision
**Opgave:** 
1. Erklær double `price1` = 10.5
2. Erklær double `price2` = 20.75
3. Erklær double `total` = price1 + price2
4. Print total

**Forventet Output:**
```
31.25
```

---

## Del D: Working with boolean

### Opgave 1.16: Boolean basics
**Opgave:** 
1. Erklær boolean `isRaining` = true
2. Print isRaining
3. Reassign isRaining til false
4. Print isRaining

**Forventet Output:**
```
true
false
```

---

### Opgave 1.17: Boolean with object
**Opgave:** 
1. Opret en Product: "Laptop"
2. Erklær boolean `available` = true
3. Brug setInStock() til at sætte product status til available
4. Brug isInStock() til at hente tilbage til `stockStatus`
5. Print stockStatus

**Forventet Output:**
```
true
```

---

### Opgave 1.18: Multiple booleans
**Opgave:** 
1. Erklær boolean `hasDiscount` = true
2. Erklær boolean `isPremium` = false
3. Erklær boolean `isActive` = true
4. Print alle tre

**Forventet Output:**
```
true
false
true
```

---

### Opgave 1.19: Boolean naming
**Opgave:** 
1. Erklær følgende booleans med passende navne og værdier:
   - En der indikerer om en person er student (true)
   - En der indikerer om en butik er åben (false)
   - En der indikerer om en ordre er completed (true)
2. Print alle

**Forventet Output:** (eksempel)
```
true
false
true
```

---

### Opgave 1.20: Boolean toggle
**Opgave:** 
1. Erklær boolean `isEnabled` = false
2. Print isEnabled
3. Reassign isEnabled til true
4. Print isEnabled
5. Reassign isEnabled til false
6. Print isEnabled

**Forventet Output:**
```
false
true
false
```

---

## Del E: Working with char

### Opgave 1.21: Char basics
**Opgave:** 
1. Erklær char `initial` = 'M'
2. Print initial
3. Reassign initial til 'K'
4. Print initial

**Forventet Output:**
```
M
K
```

---

### Opgave 1.22: Char with object
**Opgave:** 
1. Opret en Product: "Milk"
2. Erklær char `cat` = 'F'  (F for Food)
3. Brug setCategory() til at sætte category til cat
4. Brug getCategory() til at hente tilbage til `productCat`
5. Print productCat

**Forventet Output:**
```
F
```

---

### Opgave 1.23: Multiple chars
**Opgave:** 
1. Erklær char `gradeA` = 'A'
2. Erklær char `gradeB` = 'B'
3. Erklær char `gradeC` = 'C'
4. Print alle tre på separate linjer

**Forventet Output:**
```
A
B
C
```

---

### Opgave 1.24: Char symbols
**Opgave:** 
1. Erklær char `star` = '*'
2. Erklær char `plus` = '+'
3. Erklær char `dollar` = '$'
4. Print alle tre

**Forventet Output:**
```
*
+
$
```

---

### Opgave 1.25: Char numbers
**Opgave:** 
1. Erklær char `digit` = '5'
2. Print digit
3. Reassign digit til '9'
4. Print digit

**Forventet Output:**
```
5
9
```

---

## Del F: Type Conversion

### Opgave 1.26: Int to double (automatic)
**Opgave:** 
1. Erklær int `age` = 25
2. Erklær double `ageAsDouble` = age
3. Print begge

**Forventet Output:**
```
25
25.0
```

---

### Opgave 1.27: Double to int (casting)
**Opgave:** 
1. Erklær double `price` = 19.99
2. Erklær int `roundedPrice` = (int) price
3. Print begge (bemærk at decimaler forsvinder)

**Forventet Output:**
```
19.99
19
```

---

### Opgave 1.28: Mixed type calculation
**Opgave:** 
1. Erklær int `quantity` = 5
2. Erklær double `pricePerItem` = 12.50
3. Erklær double `total` = quantity * pricePerItem
4. Print total

**Forventet Output:**
```
62.5
```

---

### Opgave 1.29: Type conversion with objects
**Opgave:** 
1. Opret en Temperature: "Aarhus"
2. Erklær int `wholeDegrees` = 20
3. Erklær double `decimalDegrees` = wholeDegrees
4. Sæt kelvin til decimalDegrees (brug setKelvin)
5. Print getKelvin()

**Forventet Output:**
```
20.0
```

---

### Opgave 1.30: Precision loss
**Opgave:** 
1. Erklær double `exactValue` = 99.99
2. Erklær int `wholeValue` = (int) exactValue
3. Print begge for at se forskellen

**Forventet Output:**
```
99.99
99
```

---

## Del G: Constants (final)

### Opgave 1.31: First constant
**Opgave:** 
1. Erklær `final int MAX_STUDENTS = 30`
2. Print MAX_STUDENTS

**Forventet Output:**
```
30
```

---

### Opgave 1.32: Constant naming
**Opgave:** 
1. Erklær følgende constants:
   - `final double PI = 3.14159`
   - `final int DAYS_IN_WEEK = 7`
   - `final boolean DEBUG_MODE = true`
2. Print alle

**Forventet Output:**
```
3.14159
7
true
```

---

### Opgave 1.33: Using constants in calculation
**Opgave:** 
1. Erklær `final double TAX_RATE = 0.25`
2. Erklær `double price = 100.0`
3. Erklær `double tax = price * TAX_RATE`
4. Erklær `double total = price + tax`
5. Print tax og total

**Forventet Output:**
```
25.0
125.0
```

---

### Opgave 1.34: Constants vs variables
**Opgave:** 
1. Erklær `final int MAX_SCORE = 100`
2. Erklær `int currentScore = 75`
3. Print begge
4. Reassign currentScore til 80
5. Print currentScore (MAX_SCORE kan ikke ændres!)

**Forventet Output:**
```
100
75
80
```

---

### Opgave 1.35: Multiple constants
**Opgave:** 
1. Erklær følgende constants:
   - `final int MIN_AGE = 0`
   - `final int MAX_AGE = 150`
   - `final int RETIREMENT_AGE = 67`
2. Erklær `int age = 45`
3. Print: age, MIN_AGE, MAX_AGE, RETIREMENT_AGE

**Forventet Output:**
```
45
0
150
67
```

---

## Del H: Working with Objects

### Opgave 1.36: Object variables
**Opgave:** 
1. Opret en Person: "Anna", "Jensen"
2. Erklær int variabel `newAge` = 28
3. Sæt person's age til newAge
4. Hent age tilbage til variabel `currentAge`
5. Print currentAge

**Forventet Output:**
```
28
```

---

### Opgave 1.37: Multiple object variables
**Opgave:** 
1. Opret en Product: "Coffee"
2. Erklær følgende variabler:
   - double `productPrice` = 45.50
   - int `stock` = 20
   - char `cat` = 'F'
3. Brug setters til at sætte alle værdier
4. Display product info

**Forventet Output:**
```
Product: Coffee
Price: 45.5 kr
Quantity: 20
In Stock: false
Category: F
```

---

### Opgave 1.38: Temperature conversion
**Opgave:** 
1. Opret en Temperature: "Copenhagen"
2. Erklær int `celsiusTemp` = 25
3. Erklær double `fahrenheitTemp` = (celsiusTemp * 9.0 / 5.0) + 32.0
4. Sæt celsius til celsiusTemp
5. Sæt fahrenheit til fahrenheitTemp
6. Display info

**Forventet Output:**
```
Location: Copenhagen
Celsius: 25°C
Fahrenheit: 77.0°F
Kelvin: 273.15K
```

---

### Opgave 1.39: Reading and updating
**Opgave:** 
1. Opret en Person: "Peter", "Hansen"
2. Sæt age til 30
3. Hent age til variabel `oldAge`
4. Erklær `int newAge = oldAge + 1`
5. Sæt age til newAge
6. Display info

**Forventet Output:**
```
Name: Peter Hansen
Age: 31
Height: 0.0m
Student: false
Blood Type: O
```

---

### Opgave 1.40: Complete object setup
**Opgave:** 
1. Opret en Person: "Maria", "Larsen"
2. Erklær og initialiser variabler for alle properties:
   - int age = 25
   - double height = 1.68
   - boolean isStudent = true
   - char bloodType = 'A'
3. Brug alle setters
4. Display complete info

**Forventet Output:**
```
Name: Maria Larsen
Age: 25
Height: 1.68m
Student: true
Blood Type: A
```

---

## Del I: Simple Arithmetic with Variables

### Opgave 1.41: Adding money together
**Opgave:** 
1. Erklær int `myMoney` = 50
2. Erklær int `foundMoney` = 20
3. Erklær int `totalMoney` = myMoney + foundMoney
4. Print totalMoney

**Forventet Output:**
```
70
```

---

### Opgave 1.42: Spending money
**Opgave:** 
1. Erklær int `savings` = 150
2. Erklær int `spent` = 45
3. Erklær int `remaining` = savings - spent
4. Print remaining

**Forventet Output:**
```
105
```

---

### Opgave 1.43: Multiple items cost
**Opgave:** 
1. Erklær int `iceCreamPrice` = 25
2. Erklær int `numberOfIceCreams` = 3
3. Erklær int `totalCost` = iceCreamPrice * numberOfIceCreams
4. Print totalCost

**Forventet Output:**
```
75
```

---

### Opgave 1.44: Sharing equally
**Opgave:** 
1. Erklær int `totalCandy` = 20
2. Erklær int `friends` = 4
3. Erklær int `candyEach` = totalCandy / friends
4. Print candyEach

**Forventet Output:**
```
5
```

---

### Opgave 1.45: Years until event
**Opgave:** 
1. Erklær int `currentYear` = 2026
2. Erklær int `graduationYear` = 2030
3. Erklær int `yearsUntilGraduation` = graduationYear - currentYear
4. Print yearsUntilGraduation

**Forventet Output:**
```
4
```

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem declaration og initialization?
2. Hvilke primitive typer findes der?
3. Hvornår bruger du int vs double?
4. Hvad betyder final?
5. Hvordan navngiver du variabler korrekt?
6. Hvad sker der når du caster double til int?
7. Hvorfor er det vigtigt at give variabler meningsfulde navne?
8. Hvordan bruger du +, -, *, / med variabler?
