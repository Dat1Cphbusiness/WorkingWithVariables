# Level 3: Variable Roles - Flag & State

## Level 3 fokuserer på:
- Boolean flag variables (true/false indikatorer)
- State variables (spore tilstand)
- Setting og checking flags
- Multiple flags working together
- Flag naming conventions (isActive, hasError, isComplete)
- State transitions
- Logical combinations af flags

---

## Begrebsgennemgang

### Flag Variables
En **flag variabel** er en boolean der signalerer om noget er sandt eller falsk.

```java
boolean isReady = false;    // Flag: Er vi klar?
isReady = true;             // Nu er vi klar!

if (isReady) {
    System.out.println("Let's go!");
}
```

**Typisk brug:**
- Signal om noget er sket (hasStarted, isComplete)
- Tilstand af system (isActive, isPaused)
- Conditions der skal checkes (isValid, hasErrors)

### State Variables
**State variables** holder styr på systemets tilstand:

```java
boolean isLoggedIn = false;
boolean isAdmin = false;

// State transition: User logs in
isLoggedIn = true;

// Check state
if (isLoggedIn) {
    System.out.println("Welcome!");
}
```

### Flag vs State
Teknisk set er de det samme (begge boolean), men:

**Flag** = Signal at noget er sket:
```java
boolean found = false;
for (int num : numbers) {
    if (num == target) {
        found = true;  // Flag: Vi fandt det!
        break;
    }
}
```

**State** = Nuværende tilstand:
```java
boolean isPaused = false;
boolean isPlaying = true;

// State changes
isPaused = true;
isPlaying = false;
```

### Flag Naming Conventions

**is-prefix** for tilstand:
```java
boolean isActive = true;
boolean isValid = false;
boolean isPaused = true;
boolean isComplete = false;
```

**has-prefix** for besiddelse:
```java
boolean hasErrors = false;
boolean hasNotifications = true;
boolean hasPermission = false;
```

**can-prefix** for mulighed:
```java
boolean canEdit = true;
boolean canDelete = false;
boolean canSubmit = true;
```

### Setting Flags
Flags sættes baseret på conditions:

```java
boolean isAdult = false;
int age = 25;

if (age >= 18) {
    isAdult = true;
}

System.out.println("Adult: " + isAdult);  // true
```

### Checking Flags
Brug flags i if statements:

```java
boolean hasAccess = true;

if (hasAccess) {
    System.out.println("Access granted");
}

if (!hasAccess) {  // ! betyder "not"
    System.out.println("Access denied");
}
```

### Multiple Flags Together
Ofte bruges flere flags sammen:

```java
boolean isLoggedIn = true;
boolean isAdmin = false;

if (isLoggedIn && isAdmin) {
    System.out.println("Admin panel");
}

if (isLoggedIn && !isAdmin) {
    System.out.println("User panel");
}
```

### State Transitions
State ændrer sig over tid:

```java
boolean isPaused = false;
boolean isPlaying = true;

// User pauses game
isPaused = true;
isPlaying = false;

// User resumes game
isPaused = false;
isPlaying = true;
```

### Flag Patterns i Loops

**Search flag:**
```java
boolean found = false;
for (int num : numbers) {
    if (num == target) {
        found = true;
        break;
    }
}

if (found) {
    System.out.println("Found it!");
}
```

**Validation flag:**
```java
boolean allValid = true;
for (int score : scores) {
    if (score < 0) {
        allValid = false;
        break;
    }
}
```

**Multiple condition flags:**
```java
boolean hasPositive = false;
boolean hasNegative = false;

for (int num : numbers) {
    if (num > 0) hasPositive = true;
    if (num < 0) hasNegative = true;
}
```

### Logical Operators med Flags

**AND (&&)** - begge skal være true:
```java
if (isLoggedIn && isVerified) {
    // Både logged in OG verified
}
```

**OR (||)** - mindst én skal være true:
```java
if (isAdmin || isModerator) {
    // Enten admin ELLER moderator
}
```

**NOT (!)** - inverter boolean:
```java
if (!hasErrors) {
    // Ingen errors
}
```

### Guard Conditions
Brug flags som guards for handlinger:

```java
boolean canSubmit = false;
boolean isComplete = true;
boolean hasErrors = false;

if (isComplete && !hasErrors) {
    canSubmit = true;
}

if (canSubmit) {
    System.out.println("Form submitted!");
}
```

### Complex State Management

```java
boolean isRunning = false;
boolean isPaused = false;
boolean isComplete = false;

// Start
isRunning = true;

// Pause
if (isRunning && !isComplete) {
    isPaused = true;
    isRunning = false;
}

// Resume
if (isPaused && !isComplete) {
    isPaused = false;
    isRunning = true;
}

// Complete
if (isRunning) {
    isComplete = true;
    isRunning = false;
}
```

**Tag udgangspunkt i klasserne GameState, FormValidator, og UserSession.**  
**Skriv din kode i Main.java i testLevel3() metoden.**

---

## Tips
- Brug beskrivende navne: isActive er bedre end active
- Initialize flags til passende start værdi (normalt false)
- Brug is/has/can prefix for bedre læsbarhed
- Tænk på state transitions - hvad kan ændre sig hvornår?
- Test flags med if statements
- Kombiner flags med && og || når nødvendigt
- Brug ! for at tjekke "not true"
- Al din kode skal placeres inde i `testLevel3()` metoden mellem tuborgklammerne `{}`

---

## Del A: Basic Flag Variables

### Opgave 3.1: Din første flag
**Opgave:** 
1. Erklær boolean `isReady` = false
2. Print isReady
3. Set isReady til true
4. Print isReady

**Forventet Output:**
```
false
true
```

---

### Opgave 3.2: Multiple flags
**Opgave:** 
1. Erklær boolean `isActive` = true
2. Erklær boolean `isPaused` = false
3. Erklær boolean `isComplete` = false
4. Print alle tre

**Forventet Output:**
```
true
false
false
```

---

### Opgave 3.3: Flag naming conventions
**Opgave:** 
1. Erklær følgende flags med passende navne:
   - En der indikerer om en user er logged in (true)
   - En der indikerer om systemet har errors (false)
   - En der indikerer om en process er complete (true)
2. Print alle

**Forventet Output:** (eksempel)
```
true
false
true
```

---

### Opgave 3.4: Flags with object
**Opgave:** 
1. Opret en GameState: "Adventure"
2. Erklær boolean `playing` = false
3. Erklær boolean `paused` = false
4. Start game ved at sætte playing = true
5. Brug setStarted(true)
6. Print playing og hasStarted()

**Forventet Output:**
```
true
true
```

---

### Opgave 3.5: Toggling flags
**Opgave:** 
1. Erklær boolean `isEnabled` = true
2. Print isEnabled
3. Toggle til false
4. Print isEnabled
5. Toggle til true
6. Print isEnabled

**Forventet Output:**
```
true
false
true
```

---

## Del B: Checking Flags (if statements)

### Opgave 3.6: Simple flag check
**Opgave:** 
1. Erklær boolean `hasAccess` = true
2. Hvis hasAccess er true, print "Access granted"
3. Change hasAccess til false
4. Hvis hasAccess er true, print "Access granted" (prints ikke denne gang)

**Forventet Output:**
```
Access granted
```

---

### Opgave 3.7: Negation check
**Opgave:** 
1. Erklær boolean `hasErrors` = false
2. Hvis !hasErrors (not hasErrors), print "No errors found"
3. Set hasErrors til true
4. Hvis !hasErrors, print "No errors found" (prints ikke)

**Forventet Output:**
```
No errors found
```

---

### Opgave 3.8: If-else with flags
**Opgave:** 
1. Erklær boolean `isLoggedIn` = true
2. Hvis isLoggedIn: print "Welcome back!"
3. Ellers: print "Please log in"
4. Change isLoggedIn til false og gentag check

**Forventet Output:**
```
Welcome back!
Please log in
```

---

### Opgave 3.9: Multiple checks
**Opgave:** 
1. Erklær boolean `isActive` = true
2. Erklær boolean `isVerified` = true
3. Check hver flag separat og print status

**Forventet Output:**
```
Account is active
Account is verified
```

---

### Opgave 3.10: Guard condition
**Opgave:** 
1. Opret en FormValidator: "Registration"
2. Erklær boolean `canSubmit` = false
3. setComplete(true)
4. setHasErrors(false)
5. Hvis isComplete() og !hasErrors(), set canSubmit = true
6. Hvis canSubmit, print "Form submitted"

**Forventet Output:**
```
Form submitted
```

---

## Del C: Multiple Flags Together

### Opgave 3.11: AND operator
**Opgave:** 
1. Erklær boolean `isLoggedIn` = true
2. Erklær boolean `isAdmin` = true
3. Hvis (isLoggedIn && isAdmin), print "Admin access"

**Forventet Output:**
```
Admin access
```

---

### Opgave 3.12: OR operator
**Opgave:** 
1. Erklær boolean `isAdmin` = false
2. Erklær boolean `isModerator` = true
3. Hvis (isAdmin || isModerator), print "Moderator tools available"

**Forventet Output:**
```
Moderator tools available
```

---

### Opgave 3.13: Complex condition
**Opgave:** 
1. Erklær boolean `isActive` = true
2. Erklær boolean `hasPermission` = true
3. Erklær boolean `isBlocked` = false
4. Hvis (isActive && hasPermission && !isBlocked), print "Action allowed"

**Forventet Output:**
```
Action allowed
```

---

### Opgave 3.14: State validation
**Opgave:** 
1. Opret en UserSession: "alice"
2. Erklær boolean `canAccessAdmin` = false
3. login()
4. setAdmin(true)
5. Hvis (isLoggedIn() && isAdmin()), set canAccessAdmin = true
6. Print canAccessAdmin

**Forventet Output:**
```
true
```

---

### Opgave 3.15: Multiple conditions
**Opgave:** 
1. Erklær boolean `hasInternet` = true
2. Erklær boolean `isSubscribed` = true
3. Erklær boolean `hasCredits` = false
4. Hvis (hasInternet && (isSubscribed || hasCredits)), print "Can stream"

**Forventet Output:**
```
Can stream
```

---

## Del D: State Transitions

### Opgave 3.16: Simple state change
**Opgave:** 
1. Erklær boolean `isRunning` = false
2. Print isRunning
3. Set isRunning = true (state transition: stopped → running)
4. Print isRunning
5. Set isRunning = false (state transition: running → stopped)
6. Print isRunning

**Forventet Output:**
```
false
true
false
```

---

### Opgave 3.17: Game state transitions
**Opgave:** 
1. Opret en GameState: "Tetris"
2. Erklær boolean `localPaused` = false
3. start() - game starter
4. pause() - game pauser, set localPaused = true
5. Print isPaused() og localPaused (should match)

**Forventet Output:**
```
true
true
```

---

### Opgave 3.18: Login/Logout flow
**Opgave:** 
1. Opret en UserSession: "bob"
2. Print isLoggedIn()
3. login()
4. Print isLoggedIn()
5. logout()
6. Print isLoggedIn()

**Forventet Output:**
```
false
true
false
```

---

### Opgave 3.19: Conditional state change
**Opgave:** 
1. Opret en GameState: "Chess"
2. Erklær boolean `shouldPause` = false
3. start()
4. Hvis hasStarted() og !isGameOver(), set shouldPause = true
5. Hvis shouldPause, call pause()
6. Display info

**Forventet Output:**
```
Game: Chess
Started: true
Paused: true
Game Over: false
Muted: false
```

---

### Opgave 3.20: Multiple state transitions
**Opgave:** 
1. Opret en FormValidator: "Survey"
2. setComplete(true)
3. validate() - this checks if complete and no errors
4. submit() - this checks if valid
5. Print isSubmitted()

**Forventet Output:**
```
true
```

---

## Del E: Flags in Loops

### Opgave 3.21: Search flag
**Opgave:** 
1. Erklær boolean `found` = false
2. Erklær int `target` = 5
3. Erklær array: int[] numbers = {1, 3, 5, 7, 9}
4. Loop gennem numbers
5. Hvis number == target, set found = true og break
6. Print found

**Forventet Output:**
```
true
```

---

### Opgave 3.22: Validation flag
**Opgave:** 
1. Erklær boolean `allPositive` = true
2. Erklær array: int[] numbers = {5, 10, 15, 20}
3. Loop gennem numbers
4. Hvis any number < 0, set allPositive = false og break
5. Print allPositive

**Forventet Output:**
```
true
```

---

### Opgave 3.23: Multiple condition flags
**Opgave:** 
1. Erklær boolean `hasEven` = false
2. Erklær boolean `hasOdd` = false
3. Erklær array: int[] numbers = {1, 2, 3, 4, 5}
4. Loop gennem numbers
5. Check for even og odd, set flags accordingly
6. Print both flags

**Forventet Output:**
```
true
true
```

---

### Opgave 3.24: Error detection
**Opgave:** 
1. Erklær boolean `hasErrors` = false
2. Erklær array: int[] scores = {85, 92, -5, 78, 101}
3. Loop gennem scores
4. Hvis score < 0 eller score > 100, set hasErrors = true
5. Print hasErrors

**Forventet Output:**
```
true
```

---

### Opgave 3.25: Complete validation
**Opgave:** 
1. Erklær boolean `allValid` = true
2. Erklær boolean `hasData` = false
3. Erklær array: String[] names = {"Alice", "Bob", "Charlie"}
4. Hvis array length > 0, set hasData = true
5. Loop through names
6. Hvis any name length < 2, set allValid = false
7. Print both flags

**Forventet Output:**
```
true
true
```

---

## Del F: Complex State Management

### Opgave 3.26: Game lifecycle
**Opgave:** 
1. Opret en GameState: "Pong"
2. Simulate game lifecycle:
   - start()
   - pause()
   - resume()
   - endGame()
3. Print state efter hver action

**Forventet Output:**
```
Started: true, Paused: false, Over: false
Started: true, Paused: true, Over: false
Started: true, Paused: false, Over: false
Started: true, Paused: false, Over: true
```

---

### Opgave 3.27: Form submission flow
**Opgave:** 
1. Opret en FormValidator: "Contact"
2. Simulate submission flow:
   - Check hvis not complete, print "Form incomplete"
   - setComplete(true)
   - validate()
   - Hvis not valid, print "Validation failed"
   - setValid(true) manuelt (fix errors)
   - submit()
   - Print isSubmitted()

**Forventet Output:**
```
Form incomplete
true
```

---

### Opgave 3.28: User permissions
**Opgave:** 
1. Opret en UserSession: "charlie"
2. Erklær boolean `canEdit` = false
3. Erklær boolean `canDelete` = false
4. login()
5. setVerified(true)
6. Hvis isLoggedIn() && isVerified(), set canEdit = true
7. setAdmin(true)
8. Hvis isAdmin(), set canDelete = true
9. Print canEdit og canDelete

**Forventet Output:**
```
true
true
```

---

### Opgave 3.29: Multi-flag decision
**Opgave:** 
1. Erklær 5 flags:
   - hasInternet = true
   - isLoggedIn = true
   - hasSubscription = false
   - hasFreeCredits = true
   - isBlocked = false
2. Erklær boolean `canAccess` = false
3. Hvis (hasInternet && isLoggedIn && (hasSubscription || hasFreeCredits) && !isBlocked)
   set canAccess = true
4. Print canAccess

**Forventet Output:**
```
true
```

---

### Opgave 3.30: State machine
**Opgave:** 
1. Opret en GameState: "RPG"
2. Erklær følgende local flags:
   - isInMenu = true
   - isInGame = false
   - isInSettings = false
3. Simulate menu flow:
   - Start game: isInMenu=false, isInGame=true, call start()
   - Pause: call pause()
   - Settings: isInGame=false, isInSettings=true
   - Back to game: isInSettings=false, isInGame=true, call resume()
4. Print final state

**Forventet Output:** (dit eget design)

---

## Del G: Real-World Scenarios

### Opgave 3.31: Download manager
**Opgave:** 
Simulate download state:
1. Erklær flags: isDownloading, isPaused, isComplete, hasError
2. Start download (isDownloading=true)
3. Pause (isPaused=true, isDownloading=false)
4. Resume (isPaused=false, isDownloading=true)
5. Complete (isComplete=true, isDownloading=false)
6. Print state progression

**Forventet Output:** (dit eget design)

---

### Opgave 3.32: Shopping cart validation
**Opgave:** 
1. Erklær flags:
   - hasItems = false
   - hasShippingAddress = false
   - hasPaymentMethod = false
   - termsAccepted = false
2. Erklær boolean `canCheckout` = false
3. Simulate adding requirements (set flags to true)
4. Hvis all flags true, set canCheckout = true
5. Print progression

**Forventet Output:** (dit eget design)

---

### Opgave 3.33: Multi-user system
**Opgave:** 
1. Opret tre UserSession objekter: "admin", "moderator", "user"
2. Erklær local flags for hver user's permissions
3. Setup appropriate states:
   - admin: login, setAdmin(true), setVerified(true)
   - moderator: login, setVerified(true)
   - user: login
4. Print access levels for each

**Forventet Output:** (dit eget design)

---

### Opgave 3.34: Process validator
**Opgave:** 
1. Opret en FormValidator: "Multi-step"
2. Simulate multi-step process:
   - Step 1 complete
   - Validate step 1
   - Step 2 complete
   - Validate step 2
   - Final validation
   - Submit
3. Track all flags through process

**Forventet Output:** (dit eget design)

---

### Opgave 3.35: Game state system
**Opgave:** 
Opret et comprehensive game state system:
1. Opret to GameState objekter: "Player1" og "Player2"
2. Erklær local flags for match state:
   - matchStarted, matchPaused, matchOver
   - player1Won, player2Won, isDraw
3. Simulate game match:
   - Start match
   - Pause
   - Resume
   - Determine winner (set appropriate flag)
   - End match
4. Print complete match report

**Forventet Output:** (dit eget design med complete match flow)

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem en flag og en state variable?
2. Hvorfor bruger vi is/has/can prefix til boolean variables?
3. Hvordan kombinerer du flere flags med && og ||?
4. Hvad betyder ! operator?
5. Hvordan bruges flags i loops til search/validation?
6. Hvorfor er state transitions vigtige?
7. Hvordan ville du designe et flag system for en kompleks process?
