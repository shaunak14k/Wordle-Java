# Wordle-Java
Wordle game (NYTimes) 

I have made this game using Java(swing and awt).

1. Brief Description :

* I have used 6 JTextFields for 6 words that user will input. The TextField has a 5 character limit and i have added functionality to format it to capital letters only.
To enter any word in the textfield, user can either use keyboard or the simulated keyboard i have added in the frame, user can use that one with a mouse.

* For the simulated keyboard, i have used 3 JPanels and 27 JButtons, (10 JButtons on panel1, 9 JButtons on panel2 and 8 JButtons on panel 3). 

* After hitting enter/ clicking enter key, the word will be first checked if it exists in the text file, if it doesn't then a message will be shown as "word does not exist".
If the word exists, then the word will be compared character by chracter with the "wordle question word".

* If the position and letter both matches then it will show in green-background colored label, if any letter of input word matches with any letter of "wordle word" then it will be shown in yellow-background colored label, if neither letter nor the location matches then no background color will be there for the label.
So, as the enter is hit, the JTextField will be replaced by a JLabel with all the variations i mentioned above.

* There will also be some changes in the simulated keyboard, the colors of letters on keyboard will turn to green or yellow as per the rule mentioned above. If neither letter is not matched then it will be shown in grey color in simulated keyboard which will let the user know what letters are useless in the current game so those letters can be avoided for next turns.

* After this, the cursor will move to the next TextField.

* This process will continue until Player either wins or loses. If player wins, they will get a message of congratulations and an option if they want to play again. If the player loses then they will be shown the answer and option if they want to play again.


2. Technologies :

I have used Java swing and awt. I used IntelliJ IDEA as the IDE while building this game. 


3. Launch: 

I have added the entire IntelliJ project folder here in the repository, no external libraries were added. Java version used while building this is the Java 17.0.3 LTS.


4. NOTES : 
There could be some improvements done : Backspace functionality is missing in the simulated keyboard. Unnecessary message is shown sometimes if enter key is pressed through simulated keyboard.


5. Screenshots 

![Wordle-NYTimes Clone 02-05-2022 09_18_49](https://user-images.githubusercontent.com/30958999/166182120-1179ce6b-6753-44ce-b8e6-6f723bdccfc5.png)
![Wordle-NYTimes Clone 02-05-2022 09_19_42](https://user-images.githubusercontent.com/30958999/166182134-38405b4a-70dc-41fa-a682-0de99ebcc8cf.png)
![Wordle-NYTimes Clone 02-05-2022 09_20_53](https://user-images.githubusercontent.com/30958999/166182141-490aed71-9a6f-4100-9b02-844d46d07a72.png)
![Select an Option 02-05-2022 09_21_01](https://user-images.githubusercontent.com/30958999/166182161-755c8f60-3e7f-4f08-be67-40863852284f.png)
