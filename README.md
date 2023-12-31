# How to get started:
### Method 1 - Starting from Scratch:
1. Inside of an Eclipse Workspace, create a new Java project and call it whatever you want
2. Press finish and inside of src create a new Class called 'GradeCalculator' 
3. Either make sure to click the checkbox that adds a main method or write your own
4. Start your assignment

### Method 2 - Clone from Github:
1. Open the Git perspective: In Eclipse, select "Window" -> "Perspective" -> "Open Perspective" -> "Other...". Choose "Git" from the list and click "OK".
2. Clone the repository: Click on the "Clone a Git repository" icon in the Git perspective toolbar.
3. Provide the clone URL: Paste the clone URL of the GitHub project into the "URI" field in the "Clone Git Repository" dialog.
4. Authenticate (if required): Enter your GitHub credentials if prompted.
5. Configure the local destination: Choose a directory for the project's local copy.
6. Select branch or tag (optional): Choose a specific branch or leave it as the default.
7. Import the project: On the "Import Projects" screen, select the repository and click "Next".
8. Choose project import options: Select the project(s) you want to import and customize import options as needed. Click "Finish".
9. Wait for the import process: Eclipse will import the project(s) and display progress in the "Progress" view.
10. Open the imported project(s): The project(s) will be available in the Package Explorer or Project Explorer view in Eclipse.
11. Start your assignment


## The Assignment: 
We are going to make a project that uses the Control Flow concepts we learned to collect input from the user in the form of grades they received, and use that input to
give them the average of all of their grades! Below you will find a series of steps that you can follow to finish the assignment:

1. Inside of a Java class main method, initialize any variables and objects you need (i.e. a scanner, some counters for a total running sum, and a number tracking the # of scores inputted
2. Make a loop that repeatedly asks the user for a number and won't stop until the user answers using a negative number
3. Add some error checking for when a user inputs a number over 100 - we should skip that input and start the loop over to ask again
4. Calculate the average of all scores collected during the loop
5.  Display the average grade and corresponding message
    - If over 90: "Excellent Work!"
    - If over 80: "Good Job!"
    - If over 70: "Keep it up!"
    - anything else: "Let's work hard to get those grades up!"
