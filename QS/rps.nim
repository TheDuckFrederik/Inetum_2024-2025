import random

echo "|--------------------|\n|-----Welcome to-----|\n|-rock paper sissors-|\n|--------------------|"
echo "|--Choose an option--|\n|------1. Start------|\n|------2. Exit-------|\n|--------------------|\n"
var strt = 1

while true:
  if strt == 0:
    echo "\n|--------------------|\n|--Choose an option--|\n|------1. Start------|\n|------2. Exit-------|\n|--------------------|\n"
  elif strt == 1:
    strt = 1
  let menuChoice = readLine(stdin)

  if menuChoice == "Start" or menuChoice == "start" or menuChoice == "1":
    while true:
      let enemyChoiceNum = rand(1..3)
      var enemyChoice = ""

      if enemyChoiceNum == 1:
        enemyChoice = "Rock"
      elif enemyChoiceNum == 2:
        enemyChoice = "Paper"
      elif enemyChoiceNum == 3:
        enemyChoice = "Scissors"

      echo "\n|--------------------|\n|-----1. Rock--------|\n|-----2. Paper-------|\n|-----3. Scissors----|\n|------4. Exit-------|\n|--------------------|"
      let playerChoice = readLine(stdin)

      if playerChoice == "Rock" or playerChoice == "rock" or playerChoice == "1":
        let playerChoicePrnt = "Rock"

        if enemyChoice == "Rock":
          echo playerChoicePrnt, " vs ", enemyChoice, "\nTie"
        elif enemyChoice == "Paper":
          echo playerChoicePrnt, " vs ", enemyChoice, "\nYou lose"
        elif enemyChoice == "Scissors":
          echo playerChoicePrnt, " vs ", enemyChoice, "\nYou win"

      elif playerChoice == "Paper" or playerChoice == "paper" or playerChoice == "2":
        let playerChoicePrnt = "Paper"

        if enemyChoice == "Rock":
          echo playerChoicePrnt, " vs ", enemyChoice, "\nYou win"
        elif enemyChoice == "Paper":
          echo playerChoicePrnt, " vs ", enemyChoice, "\nTie"
        elif enemyChoice == "Scissors":
          echo playerChoicePrnt, " vs ", enemyChoice, "\nYou lose"

      elif playerChoice == "Scissors" or playerChoice == "scissors" or playerChoice == "3":
        let playerChoicePrnt = "Scissors"

        if enemyChoice == "Rock":
          echo playerChoicePrnt, " vs ", enemyChoice, "\nYou lose"
        elif enemyChoice == "Paper":
          echo playerChoicePrnt, " vs ", enemyChoice, "\nYou win"
        elif enemyChoice == "Scissors":
          echo playerChoicePrnt, " vs ", enemyChoice, "\nTie"

      elif playerChoice == "Exit" or playerChoice == "exit" or playerChoice == "4":
        break
      else:
        echo "|--------------------|\n|-----Syntax err-----|\n|--Please try again--|\n|--------------------|"

  elif menuChoice == "Exit" or menuChoice == "exit" or menuChoice == "2":
    echo "\n|--------------------|\n|------Exiting!------|\n|--------------------|\n"
    break
    break
  else:
    echo "|--------------------|\n|-----Syntax err-----|\n|--Please try again--|\n|--------------------|"

  strt = 0
