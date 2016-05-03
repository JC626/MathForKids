# MathForKids

###Creators
- Dean Ong
- Chris Rabe
- Janice Chin
- Megan Liang

###Why this was made:
This is an android mobile game application which was created for the Summer of Tech 2016 android hackathon event.

###Aim
The game's purpose is to allow kids to apply and sharpen their skills in solving mathematics problems in a fun and engaging manner.
It covers various of basic arithmetic questions, which includes addition, subtraction, multiplication and division.

###Reward System
Our game offers achievements and highscores so that kids can show off their skills to their friends and families.

###Back-End Algorithm Complexity
The main purpose of the game is to ensure that the kids are learning. The algorithm implemented is called "Spaced Repetition" algorithm. 
Spaced repetition utilises the spacing effect, which comes from an observation made by Ebbinghaus over a hundred years ago: 

 “…with any considerable number of repetitions a suitable distribution of them over a space of time is decidedly more advantageous than the massing of them at a single time.”
— Ebbinghaus, H. (1885). Über das Gedchtnis. Untersuchungen zur experimentellen Psychologie. Leipzig: Duncker & Humblot; the English edition is Ebbinghaus, H. (1913). Memory. A Contribution to Experimental Psychology. New York: Teachers College, Columbia University (Reprinted Bristol: Thoemmes Press, 1999)"

In simple terms, people generally learn a lot more if they are asked repetitive questions. They learn even more if those repetitive questions
are asked in a large space of time. This algorithm is applied in flashcard revision software as well as language learning softwares.

####How did we implement this?
We have implemented a timer of 60 seconds and the aim of the game is to try to finish as much questions as the player can.
The design of gameplay is carefully devised because the timer is as short as the average kid's attention span. During this 60 seconds,
The kid would have probably revised addition, subtraction, multiplication and division in quick succession that they barely noticed.

####What makes this game special? It's just another time pressured maths game...
What makes this game unique is the fact that the implemented controller which the game uses follows a mantra of "the longer you play, the more the game recognises the user's skill level". What does this mean? It means that when you initially start up the game, the program assumes that you are only a beginner.
The more questions you answer correctly, the more types of questions the game will throw at you and it ensures that the questions thrown at you are scaled to what you know.
