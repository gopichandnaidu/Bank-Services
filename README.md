# Bank-Services
This Java program simulates a basic **Banking Application**, allowing users to create a bank account, view their details, and perform banking operations like deposits, withdrawals, and checking account balance. Below is a detailed description of the program's functionality:

---

### Features
1. **Account Creation**:
   - Collects user details like full name, age, date of birth, father's name, location, mobile number, and account number.
   - Stores these details for further operations.

2. **Banking Operations**:
   - **Deposit**: Users can deposit money into their account, and the balance is updated accordingly.
   - **Withdraw**: Users can withdraw money from their account. Withdrawals are allowed only if the account has sufficient balance.
   - **Balance Inquiry**: Displays the current balance in the account.

3. **Interactive Menu**:
   - Provides a text-based menu to guide users through the available operations (`deposit`, `withdraw`, and `balance`).
   - Handles invalid inputs gracefully.

4. **Recursive Operation Handling**:
   - After each operation, the application prompts the user to choose the next action, ensuring continuous interaction until the user exits.

---

### How It Works
1. **Initialization**:
   - The `Bankappn` class initializes variables for user details (name, age, date of birth, etc.) and account balance.

2. **Account Creation**:
   - The `create_display()` method collects user details via a `Scanner` object and displays them for verification.

3. **Operations Menu**:
   - The `operations()` method provides options for deposit, withdrawal, or balance inquiry.
   - Depending on the user's choice:
     - `deposit()`: Adds a specified amount to the account balance.
     - `withdraw()`: Deducts a specified amount if sufficient funds are available.
     - `balance()`: Displays the current account balance.

4. **Loop Until Exit**:
   - After completing an operation, the application recursively calls the `operations()` method, allowing users to perform additional actions.

---

### Example Usage
#### Input:
```
------------------------------------------
       Welcome to the BANK Application        
 Lets start with creation of bank account 
------------------------------------------
Enter Your full name
John Doe
Enter Your Age
30
Enter Date of birth: 
1993-01-15
Enter Your Father name: 
Michael Doe
Enter Your location
New York
Create a Bank Mobile Number
1234567890
Create a Bank Account Number
9876543210
------------------------------------------
```

#### Output:
```
------------------------------------------
John Doe
30
1993-01-15
Michael Doe
New York
1234567890
9876543210
------------------------------------------
What do you want to do (type: deposit, withdraw and balance)
deposit
------------------------------------------
How much money do you want to deposit: 
1000
1000.0
------------------------------------------
What do you want to do (type: deposit, withdraw and balance)
balance
------------------------------------------
Balance amount: 1000.0
------------------------------------------
```

---

### Class Structure
- **Attributes**:
  - `full_name`, `age`, `dob`, `father_name`, `loc`, `mob_num`, `acc_num`, and `balance`.
- **Methods**:
  - `display()`: Displays the welcome message and starts account creation.
  - `create_display()`: Collects user details.
  - `details_display()`: Displays account details after creation.
  - `operations(double balance)`: Handles the main menu for user operations.
  - `deposit()`: Allows depositing money.
  - `withdraw()`: Allows withdrawing money.
  - `balance(double amt)`: Displays the current balance.

---

### Setup Instructions
1. **Clone Repository**:
   - Clone the repository containing this program to your local machine.

2. **Run the Program**:
   - Compile the program using `javac Bankappn.java`.
   - Execute it using `java Bankappn`.

3. **Interactive Usage**:
   - Follow the on-screen prompts to create an account and perform operations.

---

### Notes
- This program is a simplified banking application and does not store data persistently.
- For production use, you would need to add features like secure authentication, persistent storage (e.g., database), and error handling for edge cases.