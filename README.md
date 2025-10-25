# Console-ATM-Machine-Simulator
Console ATM Machine Simulator
Problem Overview: 

The goal of this assignment is to create a text-based, interactive ATM application that runs indefinitely until the user explicitly chooses to exit. You must demonstrate proficiency in using while loops for continuous input, switch-case for menu navigation, and if-else statements for decision-making (like checking for sufficient funds).

Constrains:

1. Keep a double-precision variable, currentBalance, for tracking the account balance.

2. You must enclose the main functionality of the ATM in an infinite while loop (e.g., while(true)). This loop will ensure the user returns to the main menu after every action until they choose to exit.

3. The program should first display a menu each time:

Welcome to the Simple Console ATM!
Please select an option:
1. Check Balance
2. Deposit Funds
3. Withdraw Funds
4. Exit

Use switch-case to handle each menu option.

4. Handle the default case if the user doesn’t select any of the options shown.

5. You must check that the user has the required amount of balance in their account before making a withdrawal.

6. A User can withdraw a maximum of 100 taka per transaction.

7. The user must not deposit or withdraw any negative amount of funds, as it is impossible and unrealistic.

8. When the user selects the exit option, the system should print the message: “Thank you for using the ATM! Goodbye,” and break the main loop.
