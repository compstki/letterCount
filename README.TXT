 --------------------------------------------------------------------------------------
This is the project README file.
 --------------------------------------------------------------------------------------

PROJECT TITLE:LetterCount
PURPOSE OF PROJECT:Standard Algorithms
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS: St Kentigern's Academy Computing
USER INSTRUCTIONS:

Pseudocode Design
 ======================================================================================
 setUpDataList
 --------------------------------------------------------------------------------------
 for index = 0 to 199
   create a DATA object and store in position[index] in the dataList
   display the value of the DATA object from position[index] in the datalist
 end for  
 display a new line
 
 ======================================================================================
 findMinData
 --------------------------------------------------------------------------------------
 choose position of first value as the minPosition
 repeat for the rest of the array (1 to 199)
   if value of dataItem at current index is less than dataItem at best value position
     update the minPosition of the best value to current index
   end if
 end loop
 display results: minPosition and the value at minPosition
 
 ======================================================================================
 countValue
 --------------------------------------------------------------------------------------
 set the count to start at 0
 ask user for a target character to count
 loop for each item in the array
   decide if item at current index position matches target then
     add 1 to count
   end if
 end loop
 display the final count
 
 ======================================================================================
 searchA (very simple linear search)
 --------------------------------------------------------------------------------------
 ask the user to key in a target character
 clear the found flag, target not yet found
 loop for each position in the array
   decide if item at current index position matches target
     set the found flag, target has been found
   end if
 end loop
 decide if found is true then
   display success message with target
 else
   display not found message
 end if
 
 ======================================================================================