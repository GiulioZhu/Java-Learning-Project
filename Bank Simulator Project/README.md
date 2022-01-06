# Bank Simulator Project
 
## WHAT DOES THIS PROJECT DO?
It first will prompt the user for the password to access the program (Password: "Password100"), then it will prompt the user for an 'ID' and a 'Initial Deposit Amount' (precondition: any number and NO characters and words, postcondition: the program will save the 'ID' number and will add the 'Intial Deposit Amount' to the 'Balance').

After the verification system, the program will open up the "Bank" window, where the user can manually insert the amount to deposit or to withdraw in the text field (precondition: any number and NO characters and words, postcondition: it will add/subtract the entered value from the 'Balance')
The user can also close the program by tapping the 'exit' button, which will save the 'ID' and the 'Balance' into the "Balance Sheet" text file, and when the program is launched again, it will automatically retrieve the stored 'ID' and 'Balance' from the text file.

## BACKGROUND INFO
- For reference and guidance in the creation of the application window and some visual elements, I used the 'PasswordFIeldExample.java' file as a reference. Obviously made some modifications to the file and store the application window and the visual element components in the 'UI.java' file.

### Note:
- Don't close the window by pressing on the 'close button' at the top left corner of the window, but rather close it by pressing the 'exit' button. By doing so, you will save your 'ID' and 'Balance'.
- All the codes are written in the '.java' files. However, the file which will make the program run is the 'Main.java' file

### Note To Execute The Program: 
In order to execute the program all the files must be compiled through Terminal/Command line through 'javac [name of the file.java]' for all the files or just 'javac \*'. Consequently, just run the 'Main.java' file with 'java Main.java' or 'java Main'. (Note: this is just what I normally do to execute the files)

