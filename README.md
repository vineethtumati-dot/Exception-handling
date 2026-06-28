# ☕ Java Exception Handling Programs

A collection of Java programs demonstrating core **Exception Handling** concepts — part of my Java learning journey.

---

## 📁 Package: `exceptions`

| File | Exception Covered |
|------|------------------|
| `ArithmeticExceptionHandling.java` | `ArithmeticException` |
| `ArrayindexOutOfBoundsException.java` | `ArrayIndexOutOfBoundsException` |
| `InputMismatchexception.java` | `InputMismatchException` |
| `MultipleExceptionHandlingDemo.java` | Multiple Exceptions |
| `ThrowException.java` | `throw` keyword |
| `hi.java` | `IllegalArgumentException` |

---

## 📌 Programs Overview

### 1. ArithmeticExceptionHandling.java
- Takes **dividend** and **divisor** from user
- Handles division by zero using `try-catch-finally`
- Loop continues until user types `no`

**Concepts:** `try`, `catch`, `finally`, `ArithmeticException`

---

### 2. ArrayindexOutOfBoundsException.java
- User enters array size, elements, and an index to access
- Catches invalid index access gracefully
- Displays array length on error

**Concepts:** `ArrayIndexOutOfBoundsException`, static method with exception handling

---

### 3. InputMismatchexception.java
- Accepts `BigInteger` input from user
- Catches wrong data type entry (e.g. letters instead of numbers)

**Concepts:** `InputMismatchException`, `BigInteger`, Scanner input validation

---

### 4. MultipleExceptionHandlingDemo.java
- Combines **division** and **array index access** in one `try` block
- Uses multiple `catch` blocks for different exceptions
- `finally` block always executes

**Concepts:** Multiple `catch` blocks, `finally`, combined exception handling

---

### 5. ThrowException.java
- Checks if user age is eligible to vote (≥ 18)
- Manually throws `IllegalArgumentException` using `throw` keyword

**Concepts:** `throw` keyword, `IllegalArgumentException`

---

### 6. hi.java
- Validates **age** and **name** using `IllegalArgumentException`
- Demonstrates `throws` declaration in method signature
- ⚠️ Note: String comparison uses `!=` (should use `.equals()`)

**Concepts:** `throws` declaration, custom validation logic

---

## ⚠️ Bug Note — `hi.java`

```java
// ❌ Wrong — compares object references
if (name != "vineeth")

// ✅ Correct — compares string content
if (!name.equals("vineeth"))
```

---

## 🛠️ How to Run

1. Open project in **Eclipse IDE**
2. Place files under `src/exceptions/` package
3. Run each file individually via `Run As → Java Application`

---

## 🧠 Concepts Covered

- `try` / `catch` / `finally`
- `throw` and `throws`
- Built-in exceptions: `ArithmeticException`, `ArrayIndexOutOfBoundsException`, `InputMismatchException`, `IllegalArgumentException`
- Multiple exception handling
- Scanner-based user input with loop control

---

## 👨‍💻 Author

**Tumati Vineeth**  
B.Tech CSE (Data Science) — ABR College of Engineering, JNTUK  
🔗 [GitHub Profile](https://github.com/)
